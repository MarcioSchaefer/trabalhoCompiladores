package Interpretador;

import java_cup.runtime.Symbol;

%%

%class AnalisadorLexico
%cup
%line
%char
%ignorecase

%eofval{
	return new Symbol(sym.EOF,new String("Fim do arquivo"));
%eofval}

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
DELIMITADOR = (";" | "?")
SEPARADOR = ","
CONDICIONAL_SE = "se"
CONDICIONAL_SENAO = "senao"
OPERADOR_SOMA = ("mais" | "+")
OPERADOR_SUBTRACAO = ("menos" | "-")
RELACIONAL_MAIOR = "maior"
RELACIONAL_MENOR = "menor"
SIMBOLO_ORDINAL = "º"
SEPARADOR_ABRE_PARENTESE = "("
SEPARADOR_FECHA_PARENTESE = ")"
SEPARADOR_ABRE_COLCHETE = "["
SEPARADOR_FECHA_COLCHETE = "]"

%%

	{LISTA}							{ return new Symbol(sym.LISTA, yytext()); }
	{ATRIBUICAO}					{ return new Symbol(sym.ATRIBUICAO, yytext()); }
	{REPETICAO}						{ return new Symbol(sym.REPETICAO, yytext()); }
	{DELIMITADOR}					{ return new Symbol(sym.DELIMITADOR, yytext()); }
	{SEPARADOR}						{ return new Symbol(sym.SEPARADOR, yytext()); }
	
	{SEPARADOR_ABRE_PARENTESE}		{ return new Symbol(sym.SEPARADOR_ABRE_PARENTESE, yytext()); }
	{SEPARADOR_FECHA_PARENTESE}		{ return new Symbol(sym.SEPARADOR_FECHA_PARENTESE, yytext()); }
	{SEPARADOR_ABRE_COLCHETE}		{ return new Symbol(sym.SEPARADOR_ABRE_COLCHETE, yytext()); }
	{SEPARADOR_FECHA_COLCHETE}		{ return new Symbol(sym.SEPARADOR_FECHA_COLCHETE, yytext()); }
	
	{CONDICIONAL_SE}				{ return new Symbol(sym.CONDICIONAL_SE, yytext()); }
	{CONDICIONAL_SENAO}				{ return new Symbol(sym.CONDICIONAL_SENAO, yytext()); }
	{RELACIONAL_MAIOR}				{ return new Symbol(sym.RELACIONAL_MAIOR, yytext()); }
	{RELACIONAL_MENOR}				{ return new Symbol(sym.RELACIONAL_MENOR, yytext()); }
	
	{OPERADOR_SOMA}					{ return new Symbol(sym.OPERADOR_SOMA, yytext()); }
	{OPERADOR_SUBTRACAO}			{ return new Symbol(sym.OPERADOR_SUBTRACAO, yytext()); }
	{SIMBOLO_ORDINAL}				{ return new Symbol(sym.SIMBOLO_ORDINAL, yytext()); }
	
	{DIGITO}						{ return new Symbol(sym.DIGITO, yytext()); }
	{NUMERO}						{ return new Symbol(sym.NUMERO, yytext()); }
	{LETRA}							{ return new Symbol(sym.LETRA, yytext()); }
	{PALAVRA}						{ return new Symbol(sym.PALAVRA, yytext()); }
	{VARIAVEL}						{ return new Symbol(sym.VARIAVEL, yytext()); }
	{STRING}						{ return new Symbol(sym.STRING, yytext()); }
		
	{ESPACO}						{}

.	{ System.out.println("CARACTERE ILEGAL: " + yytext() + "\n"); }