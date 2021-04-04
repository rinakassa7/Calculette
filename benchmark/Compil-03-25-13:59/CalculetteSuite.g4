grammar CalculetteSuite;
@header{
    import java.util.*;
}
@parser::members {   
    private TablesSymboles tablesSymboles = new TablesSymboles();
    private int _cur_label = 1;
    /** générateur de nom d'étiquettes pour les boucles */
    private String getNewLabel() { return "B" +(_cur_label++); }
    private String evalexpr (String op) {
	            if ( op.equals("*") ){
	                return  "  MUL\n";
	            } else if ( op.equals("/") ){
	                return  "  DIV\n";
	            } else if ( op.equals("+") ){
	                return  "  ADD\n";
	            }else if ( op.equals("-") ){
	                return  "  SUB\n";
	            }else if ( op.equals("==") ){
	                return  "  EQUAL\n";
	            }else if ( op.equals("!=") || op.equals("<>") ){
	                return  "  NEQ\n";
	            }else if ( op.equals("<") ){
	                return  "  INF\n";
	            }else if ( op.equals("<=") ){
	                return  "  INFEQ\n";
	            }else if ( op.equals(">") ){
	                return  "  SUP\n";
	            }else if ( op.equals(">=") ){
	                return  "  SUPEQ\n";
	            }else {
	            System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
	            throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
	                }
            }
    private String evalexprF (String op) {

	            if ( op.equals("*") ){
	                return  "  FMUL\n";
	            } else if ( op.equals("/") ){
	                return  "  FDIV\n";
	            } else if ( op.equals("+") ){
	                return  "  FADD\n";
	            }else if ( op.equals("-") ){
	                return  "  FSUB\n";
	            }else if ( op.equals("==") ){
	                return  "  FEQUAL\n";
	            }else if ( op.equals("!=") || op.equals("<>") ){
	                return  "  FNEQ\n";
	            }else if ( op.equals("<") ){
	                return  "  FINF\n";
	            }else if ( op.equals("<=") ){
	                return  "  FINFEQ\n";
	            }else if ( op.equals(">") ){
	                return  "  FSUP\n";
	            }else if ( op.equals(">=") ){
	                return  "  FSUPEQ\n";
	            }else {
	            System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
	            throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
	                }
				
	        }
		}

start: calcul EOF;

calcul returns [ String code ] 
@init{ $code = new String(); }   // On initialise $code, pour ensuite l'utiliser comme accumulateur 
@after{ System.out.println($code); }
    :   (decl { $code += $decl.code; })*         
        { $code += "  JUMP Main\n"; }
        NEWLINE*
        
        (fonction { $code += $fonction.code; })* 
        NEWLINE*
        
        { $code += "LABEL Main\n"; }
        (instruction { $code += $instruction.code; })*

        { $code += "  HALT\n"; } 
    ;

/* Declaration */
decl returns [ String code ]
    :
        /* declaration "int/float ident" */
        TYPE IDENTIFIANT finInstruction 
         {  
             tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text); 
             if($TYPE.text.equals("float")){
                $code="  PUSHF 0.0\n";
             }else if ($TYPE.text.equals("int")){
                $code = "  PUSHI 0\n";
             }
         }
        /* declaration "int/float ident = valeur " */
       | TYPE IDENTIFIANT '=' instruction
          {
            //int x = 3
             tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
             $code = $instruction.code ;

          }
     ;

assignation returns [ String code ]
    /* ident = valeur ex: x = 46 */
     : IDENTIFIANT '=' expression
        {
            AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
            if (at.type.equals("float")){ 
                if(at.adresse < 0){ 
                    //STOREL stocke a la table locale expression.code    
                    $code = $expression.code+"  STOREL "+(at.adresse+1)+"\n"+"  STOREL "+ at.adresse +"\n";
                        }else{
                            $code = $expression.code+"  STOREG "+(at.adresse+1)+"\n" + "  STOREG "+ at.adresse +"\n";
                        }
            }else if (at.type.equals("int")){
                if(at.adresse < 0){
                    $code = $expression.code+ "  STOREL "+ at.adresse +"\n";
                }else{
                    $code = $expression.code+"  STOREG "+ at.adresse +"\n";
                    }
            }
        }
     ;
/* tout types d'instructions */
instruction returns [ String code ]
    : expression finInstruction
        { $code= $expression.code; }
    |assignation finInstruction 
        { $code = $assignation.code; }

    |'write' '('expression')' finInstruction
        {  
            if($expression.type.equals("int")){
                $code=  $expression.code + "  WRITE\n" + "  POP\n";
            }else if($expression.type.equals("float")){
                $code=  $expression.code + "  WRITEF\n" + "  POP\n" +"  POP\n";
            }
        }
    |'read' '(' IDENTIFIANT ')' finInstruction
    //Read récupère la valeur et stock au sommet de la pile 
        {   
            AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text); 
            if(at.type.equals("int")){
                 $code = "  READ \n" + "  STOREG " + at.adresse+"\n"; 
            }else if(at.type.equals("float")){
                $code = "  READF \n" + "  STOREG " + (at.adresse+1)+"\n" + "  STOREG "+ at.adresse +"\n";
        }
    }
    |'while' '('condition ')'  instruction 
        {
              String debutWhile=getNewLabel();
              String finWhile=getNewLabel();
              $code = "LABEL "
              +debutWhile + "\n" 
              + $condition.code 
              +"  JUMPF " 
              +finWhile + "\n" 
              + $instruction.code 
              +"  JUMP "
              +debutWhile + "\n " 
              +"LABEL " 
              + finWhile 
              + "\n";
        }
    |'for' '('init=assignation? ';' condition? ';' incr=assignation?')' instruction
        {
            String startLabel=getNewLabel();
            String endLabel=getNewLabel();
            $code=$init.code 
            +"LABEL "+startLabel+"\n"
            +$condition.code
            +"  JUMPF " + endLabel +"\n"
            +$instruction.code 
            +$incr.code
            +"  JUMP "+startLabel+"\n"
            +"LABEL "+endLabel+"\n";
        }
    |'repeat' instruction 'until' '(' condition ')'
        {
            String labelRepeat=getNewLabel();
            $code="LABEL "+labelRepeat+"\n"
            +$instruction.code
            +$condition.code 
            +"  JUMPF "+labelRepeat+"\n";
        }
    |bloc { $code = $bloc.code;}
    |branchement { $code = $branchement.code;}
    |'return' expression finInstruction    
        {
            AdresseType at = tablesSymboles.getAdresseType("return");
                $code=$expression.code;
                if($expression.type.equals("float")){
                    $code +="  STOREL "+(at.adresse+1) +"\n" + "  STOREL "+(at.adresse) +"\n" + "  RETURN \n" + "  RETURN \n";
                }else if($expression.type.equals("int")) {
                    $code +="  STOREL "+(at.adresse) +"\n" + "  RETURN \n";
                }
        }
    | finInstruction
        { $code=""; }  
    ;

condition returns [String code]
    /* traitement des conditions basées sur les opérateurs relationnels */
    //la négation est prioritaire sur le && et le ||
    :'!' c=condition {
        $code= $c.code + "  PUSHI 0\n" + "  EQUAL\n";
        }
    /* && est prioritaire sur || */
    | c1=condition '&&' c2=condition { 
        //$code= $c1.code + $c2.code + "  MUL\n";
        
        /* amélioration de la conjonction */
        String labelElse = getNewLabel();
        String labelFin = getNewLabel();

        $code = $c1.code + "  PUSHI 0\n" + "  EQUAL \n" + 
        "  JUMPF " + labelElse +"\n" 
        +  "  PUSHI 0\n" 
        + "  JUMP " + labelFin +"\n"
        + "  LABEL " + labelElse +"\n" + $c2.code 
        + "  LABEL " + labelFin + "\n" ;
        }
    | c3=condition '||' c4=condition { 
        //$code= $c3.code + $c4.code + "ADD\n" + "PUSHI 0\n" + "NEQ\n"; 
        
        /* amélioration de la disjonction */
        String labelFin = getNewLabel();
        String labelElse = getNewLabel();
        
        $code = $c3.code 
        + "  JUMPF " + labelElse +"\n" 
        + "  PUSHI 1\n" 
        + "  JUMP " + labelFin +"\n" 
        + "  LABEL " + labelElse +"\n" 
        + $c4.code 
        + "  LABEL " + labelFin +"\n";
        }
    
    | f=expression op3=('=='|'!='|'<'|'>'|'<='|'>=') g=expression { 
        if($f.type.equals("int") && $g.type.equals("int") ){
            $code = $f.code + $g.code + evalexpr($op3.getText()); 
        }else if($f.type.equals("float") && $g.type.equals("float") ){
            $code = $f.code + $g.code + evalexprF($op3.getText()); 
        } 
    }
    // true à 1
    | 'true'  { $code = "  PUSHI 1\n"; }
    // false à 0
    | 'false' { $code = "  PUSHI 0\n"; } 
    ;
expression returns [ String code, String type ]
    : '(' e=expression ')' {$code=$e.code; $type=$e.type; }  //(a+b)
    | a=expression op=('*'|'/') b=expression{
        if($a.type.equals("int") && ($b.type.equals("int"))){
            $code = $a.code  + $b.code +  evalexpr($op.getText());
            $type = "int";
        }else if($a.type.equals("float") && $b.type.equals("float")){
            $type = "float";
            $code = $a.code  + $b.code +  evalexprF($op.getText());
        }
    }
    | c=expression op1=('+'|'-') d=expression {
        if( ($c.type.equals("int")) && ($d.type.equals("int"))){
            $code = $c.code  + $d.code + evalexpr($op1.getText());
            $type = "int";
        }else if($c.type.equals("float") && $d.type.equals("float")){
            $code = $c.code  + $d.code + evalexprF($op1.getText());
            $type = "float"; 
        }
    }
    |'-'ENTIER  //-2
    {
        $code = "  PUSHI -"+ $ENTIER.text + "\n"; 
            $type ="int";
    }
    |IDENTIFIANT 
    {  
        AdresseType at = tablesSymboles.getAdresseType($IDENTIFIANT.text);
        $type= at.type;
        if(at.type.equals("int")){
            if(at.adresse < 0){
                $code = "  PUSHL " + (at.adresse) + "\n";
            }else{
                $code = "  PUSHG " + at.adresse + "\n";
            }
        }else if( at.type.equals("float")){
           if(at.adresse < 0){
                $code = "  PUSHL " + (at.adresse) + "\n" +"  PUSHL " + (at.adresse+1)+"\n";
            }else{
                $code = "  PUSHG "+ at.adresse + "\n" + "  PUSHG "+ (at.adresse+1)+"\n";
            } 
        }
    }
    |IDENTIFIANT '(' args ')'   // appel de fonction  f(x,y)
    {  
        $type = tablesSymboles.getFunction($IDENTIFIANT.text);
        if($type.equals("int")){
            $code= "  PUSHI 0 \n";
        }else if($type.equals("float")){
            $code="  PUSHF 0.0 \n";
        }
        $code += $args.code +"\n"  + "CALL " + $IDENTIFIANT.text + "\n";
 
        for (int i=0; i<$args.size; i++){
            $code += "  POP \n";
        }
    }
    |ENTIER {$code= "  PUSHI "+ $ENTIER.getText()+"\n"; 
            $type ="int";}
    |FLOAT { $code = "  PUSHF "+ $FLOAT.text+"\n"; 
                $type="float";}
    |'-'FLOAT { $code = "  PUSHF -"+ $FLOAT.text+"\n"; $type="float";}
    ;


bloc returns [ String code ]
@init{ $code = new String();}
    : '{'(instruction {$code+=$instruction.code;} )*'}' NEWLINE*
;

branchement returns [String code]
    :'if' '(' condition ')'  blocthen=instruction NEWLINE* 'else' blocelse=instruction
        {
            String si = getNewLabel();
            String sinon = getNewLabel();
            
            $code=$condition.code 
            +"  JUMPF " +sinon + "\n "
            +$blocthen.code
            +"  JUMP "+si + "\n"
            +"LABEL "+sinon + "\n"
            +$blocelse.code
            +"LABEL "+si
            + "\n";
        }
    |'if' '(' condition ')'  blocthen=instruction 
        {
            String labelFin = getNewLabel();
            
            $code=$condition.code
            +"  JUMPF " + labelFin + "\n "
            +$blocthen.code
            +"LABEL "+ labelFin + "\n";
        }
    ;
fonction returns [ String code ]
    : TYPE 
        { 
            tablesSymboles.newTableLocale();
            // code java pour gérer la déclaration de "la variable" de retour de la fonction
            tablesSymboles.putVar("return", $TYPE.text);

        }
        IDENTIFIANT '('  params ? ')' 
        { 
            //Déclarer la nouvelle fonction 
            tablesSymboles.newFunction($IDENTIFIANT.text, $TYPE.text);
            $code ="LABEL  " + $IDENTIFIANT.text +"\n";
        }
        bloc 
        {
            // corps de la fonction
            $code += $bloc.code + "RETURN \n";
            tablesSymboles.dropTableLocale();
        }
    ;


params
    : TYPE IDENTIFIANT 
        { 
            // code java gérant la déclaration de "la variable" de retour de la fonction
            // stocker l'identifiant ainsi son type dans la table Locale  
            tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
        }  
        ( ',' TYPE IDENTIFIANT 
            { 
                // code java gérant une variable locale (argi)
                tablesSymboles.putVar($IDENTIFIANT.text, $TYPE.text);
            } 
        )*
    ;


// init nécessaire à cause du ? final et donc args peut être vide (mais $args sera non null) 
args returns [ String code, int size] 
@init{ $code = new String(); $size = 0; }
    : ( expression 
    { 
        // code java pour première expression pour arg
            $code+=$expression.code;
            $size += AdresseType.getSize($expression.type); 
    }
    ( ',' expression 
    { 
        // code java pour expression suivante pour arg
            $code+=$expression.code;
            $size += AdresseType.getSize($expression.type);
     } 
    )* 
      )? 
    ;

finInstruction : ( ';' | NEWLINE )+ ;

// lexer
TYPE : 'int' | 'float';

IDENTIFIANT : ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

NEWLINE : '\r'? '\n';

WS :   (' '|'\t')+ -> skip  ;

ENTIER : ('0'..'9')+  ;

FLOAT : ('0'..'9')+'.'('0'..'9')?;

UNMATCH : . -> skip ;
