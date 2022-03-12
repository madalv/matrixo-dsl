// GRAMMAR FILE
grammar matrixo;

@header {
package antlr;
}

// production rules

// STATEMENTS
program: statement* EOF;

statement: nosemicolon_s | (semicolon_s SEMICOL);

nosemicolon_s: ctrlflow_s | block | COMMENT;

semicolon_s: declaration | return_s | assignment | expression | BREAK;

return_s: RETURN expression;

ctrlflow_s: for_s | if_s | while_s;

for_s: FOR L_PAR variable_dec SEMICOL expression SEMICOL expression R_PAR statement;

if_s: IF L_PAR expression R_PAR statement (else_s)?;

else_s: ELSE (if_s | statement);

while_s: WHILE L_PAR expression R_PAR statement;

block: L_BRAK statement* R_BRAK;

return_type: type | VOID;

assignment: identifier ASSIGN_OP expression;

// DECLARATIONS

declaration: function_dec | variable_dec;

function_dec: FUNCTION identifier L_PAR parameter* R_PAR RETURNS return_type block;

parameter: type identifier (COMMA)?;

variable_dec: type identifier (variable_init)?;

variable_init: ASSIGN_OP expression;

type: scalar_type | multidim_type;

scalar_type: INT | LONGINT | BOOL | DOUBLE;

multidim_type: scalar_type (MATRIX | VECTOR) bracket_expr*;

// EXPRESSIONS

expression: integer | double | expression INFIX_OP expression | identifier  | PREFIX_OP expression |
            | bracket_expr| matrix_init | paranthesis_expr | function_call | get_call;

get_call: GET identifier INBUILT_OPERATION;

matrix_init: L_PAR row* ;

row: (integer | double)* (COMMA | R_PAR);

function_call: identifier L_PAR (expression COMMA)? R_PAR;


paranthesis_expr: L_PAR expression R_PAR;

bracket_expr: L_SQBRAK expression R_SQBRAK (L_SQBRAK expression R_SQBRAK)?;

// IDENTIFIER, NUMBER

identifier: CHARACTER (CHARACTER | NONZERO_DIGIT | '0')*;

double: integer DOT (NONZERO_DIGIT | '0')+;

integer: NONZERO_DIGIT (NONZERO_DIGIT | '0')*;


// tokens
INBUILT_OPERATION: 'determinant' | 'eigenvalue';
RETURN: 'return';
FOR: 'for';
L_PAR: '(';
R_PAR: ')';
SEMICOL: ';';
ELSE: 'else';
IF: 'if';
L_BRAK: '{';
L_SQBRAK: '[';
R_SQBRAK: ']';
R_BRAK: '}';
WHILE: 'while';
COMMENT: '//' ~[\r\n]* -> skip;
VOID: 'void';
FUNCTION: 'function' | 'fun';
RETURNS: 'returns' | 'ret';
INT: 'int';
LONGINT: 'longint';
BOOL: 'bool';
DOUBLE: 'double';
MATRIX: 'matrix';
VECTOR: 'vector';
BREAK: 'break';
PREFIX_OP: '++' | '--' | '!';
INFIX_OP:  '+' | '-' | '&&' | 'and' | '||' | 'or'
         '%' | '==' | '/' | '*';
ASSIGN_OP: '+=' | '-=' | '*=' | '/=' | '=';
COMMA: ',';
//PLUS: '+';
//MINUS: '-';
//AND: '&&' | 'and';
//OR: '||' | 'or';
//MOD: '%';
//EQUAL: '==';
//DIV: '/';
//MULT: '*';
DOT: '.';
CHARACTER: [a-zA-Z] | '_';
NONZERO_DIGIT: [1-9];
GET: 'get';
IMPORT: 'import' | 'imp';
FILE_TYPE: 'odt' | 'xlsx' | 'csv';
BACKSLASH: '\\';
SPACE: [ \t\n\r] -> skip;
FROM: 'from';
