grammar MyParser;

prog    : insert? global? function? run
        ;

insert  : (INSERT STR)+
        ;

global  : GLB OPENB (var)+ CLOSEB
        ;

run     : RUN block
        ;

block   : OPENB line+ CLOSEB
        ;

line    : var           #delc
        | atr EOL       #lineatr
        | input EOL     #lineinp
        | output EOL    #lineout
        | expr EOL      #lineexpr
        | uif           #lineif
        | uwhile        #linewhile
        | ufor          #linefor
        | rtrn EOL      #lineret
        | cfunction     #linecfunc
        ;

var     : TYPE ID (EQUAL expr)? (COMA ID (EQUAL expr)?)* EOL
        ;

atr     : ID EQUAL expr #atrexpr
        | ID EQUAL STR  #atrstr
        ;

output  : PRINT OPEN outprint CLOSE
        ;

outprint: STR           #printstr
        | ID            #printid
        | expr          #printexpr
        ;

expr    : fact SUM expr         #exprsum
        | fact SUB expr         #exprsub
        | fact                  #exprfact
        ;

fact    : term MULT fact        #factmult
        | term DIV fact         #factdiv
        | term MOD fact         #factmod
        | term                  #factterm
        ;

term    : OPEN expr CLOSE       #termparexpr
        | NUM                   #termnum
        | ID                    #termid
        | STR                   #termstr
        ;

uif     : IF OPEN condition CLOSE block                 #ifline 
        | IF OPEN condition CLOSE block ELSE block      #iflineelse
        ;

condition   : TRUE                      #valtrue
            | FALSE                     #valfalse
            | term comp term            #boolexpr
            ;

comp    : DEQUAL 
        | BIGGER 
        | SMALLER 
        | BEQUAL 
        | SMEQUAL 
        | NEQUAL
        ;

uwhile  : WHILE OPEN condition CLOSE block      #whileline
        ;

ufor    : FOR OPEN atr EOL condition EOL ID incr NUM CLOSE block        #forline
        ;

incr    : DSUM 
        | DSUB
        ;

function    : TYPE ID OPEN (par)? CLOSE block
            ;

par     : (TYPE ID COMA)* TYPE ID
        ;

cfunction   : ID EQUAL ID OPEN ((cpar COMA)* cpar)? CLOSE
            | ID OPEN ((cpar COMA)* cpar)? CLOSE
            ;

cpar    : ID
        | NUM
        | STR
        ;

rtrn    : RETURN '0'    #returnline
        ;

input   : SCAN OPEN ID CLOSE
        ;


//TOKENS

RUN         :   'main';
PRINT       :   'print';
SCAN        :   'scan';
IF          :   'if';
ELSE        :   'else';
FOR         :   'for';
WHILE       :   'while';
INSERT      :   'insert';
GLB         :   'global';
RETURN      :   'return';

TRUE        :   'true';
FALSE       :   'false';
TYPE        :   'int' | 'float' | 'boolean' | 'string';

OPEN        :   '(';
CLOSE       :   ')';
OPENB       :   '{';
CLOSEB      :   '}';

SUM         :   '+';
SUB         :   '-';
MULT        :   '*';
DIV         :   '/';
MOD         :   '%';
COMA        :   ',';
EOL         :   ';';
EQUAL       :   '=';

DEQUAL      :   '==';
DSUM        :   '+=';
DSUB        :   '-=';
BIGGER      :   '>';
SMALLER     :   '<';
BEQUAL      :   '>=';
SMEQUAL     :   '<=';
NEQUAL      :   '!=';
AND         :   '&&';
OR          :   '||';

STR         :   '"'[a-zA-Z0-9_.: ]*'"';
NUM         :   [+-]?[0-9]+;
ID          :   [a-zA-Z][a-zA-Z0-9_]*;

COMMENT     :   '/*' .*? '*/' -> skip;
LINE_COMMENT:   '//' ~[\r\n]* -> skip;
WS          :   [ \t\r\n]+ -> skip;