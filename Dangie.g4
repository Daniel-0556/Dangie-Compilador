grammar Dangie;
program: instruccion* EOF;

instruccion
    : confPin
    | actuadorPin
    | lecturaSensor
    | declaracionVar
    | asignacionVar
    | bucleWhen
    | bucleLoop
    ;


//Reglas sintacticas(Parser)


declaracionVar
    : TIPO ID ';'
    ;


asignacionVar
    : ID '=' valor ';'
    ;


valor
    : NUMB        
    | POINT       
    | HL          
    | ID          
    ;


confPin : CONF PIN NUMB MODO ';' ;


actuadorPin : PIN NUMB ESTADO ';' ;


lecturaSensor : TIPO_LECTURA '{' PIN NUMB '}' ';' ;//Ampliar


bucleWhen : WHEN '(' expresion ')' THEN '{' instruccion* '}' ';' ;
bucleLoop : LOOP '{' instruccion* '}' ';' ;


expresion 
    : PIN NUMB 'is'? ESTADO//estado ambiguo 
    | valor OP_COMP valor
    ;

// Reglas léxicas (Lexer)

// Palabras reservadas: deben aparecer antes que ID.
CONF: 'CONF' ;
PIN: 'Pin' ;
WHEN: 'WHEN' ;
THEN: 'THEN' ;
LOOP: 'LOOP' ;
WHILE: 'WHILE' ;
TIPO: 'NUMB' | 'HL' | 'POINT' ;
MODO: 'IN' | 'OUT' ;
ESTADO: 'ON' | 'OFF' ;
TIPO_LECTURA: 'AREAD' | 'DREAD' ;
HL: 'HIGH' | 'LOW' ;

// Operadores más largos antes que sus prefijos más cortos.
OP_COMP: '==' | '!=' | '>=' | '<=' | '>' | '<' ;

// Literales: POINT debe aparecer antes que NUMB.
POINT: [0-9]+ '.' [0-9]+ ;
NUMB: [0-9]+ ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;

COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \t\r\n]+ -> skip ;