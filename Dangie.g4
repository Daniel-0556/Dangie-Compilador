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
    | funcionwait
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
    | lecturaPin
    ;


confPin : CONF PIN (NUMB | ID) MODO ';' ;


actuadorPin : PIN (NUMB | ID) ESTADO ';' ;


lecturaSensor : TIPO_LECTURA '{' PIN NUMB '}' ';' ;//Ampliar
lecturaPin : TIPO_LECTURA '(' (ID | NUMB) ')' ;


bucleWhen
    : WHEN '(' expresion ')' THEN bloqueWhen (';' ELSE bloqueWhen)? ';'
    ;

bloqueWhen : '{' instruccion* '}' ;
bucleLoop : LOOP '{' instruccion* '}' ';' ;
funcionwait : WAIT '(' NUMB ')' ';' ;


expresion 
    : PIN NUMB 'is'? ESTADO//estado ambiguo 
    | valor OP_COMP valor
    ;

// Reglas léxicas (Lexer)

// Palabras reservadas: deben aparecer antes que ID.
CONF: 'CONF' ;
PIN: 'Pin' | 'PIN' ;
WHEN: 'WHEN' ;
THEN: 'THEN' ;
ELSE: 'ELSE' ;
LOOP: 'LOOP' ;
WHILE: 'WHILE' ;
TIPO: 'NUMB' | 'HL' | 'POINT' ;
MODO: 'IN' | 'OUT' ;
ESTADO: 'ON' | 'OFF' ;
TIPO_LECTURA: 'AREAD' | 'DREAD' ;
HL: 'HIGH' | 'LOW' ;
WAIT: 'WAIT' ;

// Operadores más largos antes que sus prefijos más cortos.
OP_COMP: '==' | '!=' | '>=' | '<=' | '>' | '<' ;

// Literales: POINT debe aparecer antes que NUMB.
POINT: [0-9]+ '.' [0-9]+ ;
NUMB: [0-9]+ ;

ID: [a-zA-Z_][a-zA-Z0-9_]* ;

COMMENT: '//' ~[\r\n]* -> skip ;
WS: [ \t\r\n]+ -> skip ;