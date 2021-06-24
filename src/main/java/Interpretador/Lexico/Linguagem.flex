package Interpretador.Lexico;

%%

%{
private void imprimir(String lexema, String resultado) {
	System.out.println("Lexema: " + lexema + " - Descricao: " + resultado + "\n");
}
%}

%public
%class AnalisadorLexico
%type String
%ignorecase

DIGITO = [0-9]
NUMERO = {DIGITO}+
LETRA = [a-zA-Z]
PALAVRA = {LETRA}+
ESPACO = [ \t\r\n]
STRING = ("'" ({PALAVRA} | {LETRA} | {DIGITO} | {NUMERO} | {ESPACO})+ "'")
VARIAVEL = ("#" {LETRA} | "#" {PALAVRA})
LISTA = ("entre" | "serie")
REPETICAO = ("escreva") 
ATRIBUICAO = ("guarde" | "=")
CONDICIONAL_SE = "se"
CONDICIONAL_SENAO = "senao"
OPERADOR_SOMA = ("mais" | "+")
OPERADOR_SUBTRACAO = ("menos" | "-")
OPERADOR_MULTIPLICACAO = ("vezes" | "*")
OPERADOR_DIVISAO = ("dividido" | "/")
RELACIONAL_MAIOR = "maior"
RELACIONAL_MENOR = "menor"
NUMERO_ORDINAL = ({NUMERO} "º" | {DIGITO} "º")
SEPARADOR_ABRE_PARENTESE = "("
SEPARADOR_FECHA_PARENTESE = ")"
SEPARADOR_ABRE_COLCHETE = "["
SEPARADOR_FECHA_COLCHETE = "]"

%%

{LISTA}							{ imprimir( yytext(), "LISTA"); }
{ATRIBUICAO}					{ imprimir( yytext(), "ATRIBUICAO"); }
{REPETICAO}						{ imprimir( yytext(), "REPETICAO"); }

{SEPARADOR_ABRE_PARENTESE}		{ imprimir( yytext(), "SEPARADOR_ABRE_PARENTESE"); }
{SEPARADOR_FECHA_PARENTESE}		{ imprimir( yytext(), "SEPARADOR_FECHA_PARENTESE"); }
{SEPARADOR_ABRE_COLCHETE}		{ imprimir( yytext(), "SEPARADOR_ABRE_COLCHETE"); }
{SEPARADOR_FECHA_COLCHETE}		{ imprimir( yytext(), "SEPARADOR_FECHA_COLCHETE"); }

{CONDICIONAL_SE}				{ imprimir( yytext(), "CONDICIONAL_SE"); }
{CONDICIONAL_SENAO}				{ imprimir( yytext(), "CONDICIONAL_SENAO"); }
{RELACIONAL_MAIOR}				{ imprimir( yytext(), "RELACIONAL_MAIOR"); }
{RELACIONAL_MENOR}				{ imprimir( yytext(), "RELACIONAL_MENOR"); }

{OPERADOR_SOMA}					{ imprimir( yytext(), "OPERADOR_SOMA"); }
{OPERADOR_SUBTRACAO}			{ imprimir( yytext(), "OPERADOR_SUBTRACAO"); }
{OPERADOR_MULTIPLICACAO}		{ imprimir( yytext(), "OPERADOR_MULTIPLICACAO"); }
{OPERADOR_DIVISAO}				{ imprimir( yytext(), "OPERADOR_DIVISAO"); }
{NUMERO_ORDINAL}				{ imprimir( yytext(), "NUMERO_ORDINAL"); }

{DIGITO}						{ imprimir( yytext(), "DIGITO"); }
{NUMERO}						{ imprimir( yytext(), "NUMERO"); }
{LETRA}							{ imprimir( yytext(), "LETRA"); }
{PALAVRA}						{ imprimir( yytext(), "PALAVRA"); }
{VARIAVEL}						{ imprimir( yytext(), "VARIAVEL"); }
{STRING}						{ imprimir( yytext(), "STRING"); }

{ESPACO}						{}
";" | "?"						{ imprimir( yytext(), "FIM"); }

. { System.out.println("Caractere invalido: " + yytext() + "\n"); }