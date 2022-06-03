// GRAMMAR FILE
grammar matrixo;

@header {
package matrixoLang;
}

// production rules

// STATEMENTS
program: statement* EOF;

statement: nosemicolon_s | (semicolon_s SEMICOL);

nosemicolon_s:
                ctrlflow_s
                | block
                | COMMENT
                | function_dec;

semicolon_s: variable_dec | return_s | assignment | expression | BREAK;

return_s: RETURN expression;

ctrlflow_s: for_s | if_s | while_s;

for_s: FOR L_PAR IDENTIFIER FROM expression TO expression R_PAR statement;

if_s: IF L_PAR expression R_PAR statement (else_s)?;

else_s: ELSE (if_s | statement);

while_s: WHILE L_PAR expression R_PAR statement;

block: L_BRAK statement* R_BRAK;

return_type: type | VOID;

assignment: IDENTIFIER ASSIGN_OP expression;

// DECLARATIONS

function_dec: FUNCTION IDENTIFIER L_PAR parameter_list R_PAR RETURNS return_type block;

parameter_list: parameter*;

parameter: type IDENTIFIER (COMMA)?;

variable_dec: type IDENTIFIER (variable_init)?;

variable_init: ASSIGN_OP expression;

type: DOUBLE_TYPE | BOOL_TYPE | INT_TYPE | MATRIX | VECTOR;

// EXPRESSIONS

expression:  atom #atomExp
            | PREFIX_OP atom #prefixExp
            | SQRT atom #sqrtExp
            | expression POWER expression #powerExp
            | expression FIRST_ORDER_OP expression #firstOrdExp
            | expression SECOND_ORDER_OP expression #secondOrdExp
            | expression BOOL_OP expression #boolOp
            | matrix_init #matrixInit
            | get_call  #getCall
            | import_call #importCall
            ;

atom: TRUE | FALSE | NUMBER | IDENTIFIER | paranthesis_expr | function_call;

get_call: GET IDENTIFIER IDENTIFIER;

matrix_init: L_PAR row* ;

row: NUMBER* (COMMA | R_PAR);

function_call: IDENTIFIER L_PAR argument_list R_PAR;

argument_list: (expression COMMA?)*;

import_call: IMPORT (MATRIX | VECTOR) FROM filename;

paranthesis_expr: L_PAR expression R_PAR;

//bool_expr: TRUE | FALSE | expression BOOL_OP expression;

filename: (PATH)? NAME;

// tokens

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
BOOL_TYPE: 'bool';
INT_TYPE: 'int';
TRUE: 'true';
FALSE: 'false';
DOUBLE_TYPE: 'double';
MATRIX: 'matrix';
VECTOR: 'vector';
BREAK: 'break';
POWER: '**';
SQRT: '%%';
PREFIX_OP: '++' | '--' | '!';
SECOND_ORDER_OP:  '+' | '-';
FIRST_ORDER_OP: '%' |  '/' | '*';
BOOL_OP: '&&' | 'and' | '||' | 'or' | '==' | '<' | '>' | '<=' | '>=' | '!=';
ASSIGN_OP: '+=' | '-=' | '*=' | '/=' | '=';
COMMA: ',';
DOT: '.';
NUMBER: [1-9][0-9]*'.'[0-9]* | [1-9][0-9]* | '0';
GET: 'get';
IMPORT: 'import' | 'imp';
FILE_TYPE: 'odt' | 'xlsx' | 'csv';
SPACE: [ \t\n\r] -> skip;
FROM: 'from';
TO: 'to';
IDENTIFIER: [a-zA-Z_][0-9a-zA-Z_]*;
NAME: [a-zA-Z0-9_]+ '.' ('csv' | 'xlsx');
PATH: ([a-zA-Z0-9_]':\\')([a-zA-Z0-9_]+ '\\')* | '\\' ;

