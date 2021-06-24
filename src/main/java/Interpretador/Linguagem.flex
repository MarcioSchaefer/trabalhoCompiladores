package Interpretador;

import java_cup.runtime.Symbol;

%%

%public
%class AnalisadorLexico
%cup
%ignorecase

%eofval{
	return (new Symbol(sym.EOF));
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

{LISTA}							{ return new Symbol(sym.LISTA); }
{ATRIBUICAO}					{ return new Symbol(sym.ATRIBUICAO); }
{REPETICAO}						{ return new Symbol(sym.REPETICAO); }

{SEPARADOR_ABRE_PARENTESE}		{ return new Symbol(sym.SEPARADOR_ABRE_PARENTESE); }
{SEPARADOR_FECHA_PARENTESE}		{ return new Symbol(sym.SEPARADOR_FECHA_PARENTESE); }
{SEPARADOR_ABRE_COLCHETE}		{ return new Symbol(sym.SEPARADOR_ABRE_COLCHETE); }
{SEPARADOR_FECHA_COLCHETE}		{ return new Symbol(sym.SEPARADOR_FECHA_COLCHETE); }

{CONDICIONAL_SE}				{ return new Symbol(sym.CONDICIONAL_SE); }
{CONDICIONAL_SENAO}				{ return new Symbol(sym.CONDICIONAL_SENAO); }
{RELACIONAL_MAIOR}				{ return new Symbol(sym.RELACIONAL_MAIOR); }
{RELACIONAL_MENOR}				{ return new Symbol(sym.RELACIONAL_MENOR); }

{OPERADOR_SOMA}					{ return new Symbol(sym.OPERADOR_SOMA); }
{OPERADOR_SUBTRACAO}			{ return new Symbol(sym.OPERADOR_SUBTRACAO); }
{OPERADOR_MULTIPLICACAO}		{ return new Symbol(sym.OPERADOR_MULTIPLICACAO); }
{OPERADOR_DIVISAO}				{ return new Symbol(sym.OPERADOR_DIVISAO); }
{NUMERO_ORDINAL}				{ return new Symbol(sym.NUMERO_ORDINAL); }

{DIGITO}						{ return new Symbol(sym.DIGITO); }
{NUMERO}						{ return new Symbol(sym.NUMERO); }
{LETRA}							{ return new Symbol(sym.LETRA); }
{PALAVRA}						{ return new Symbol(sym.PALAVRA); }
{VARIAVEL}						{ return new Symbol(sym.VARIAVEL); }
{STRING}						{ return new Symbol(sym.STRING); }

{ESPACO}						{}
";" | "?"						{ return new Symbol(sym.EOF); }

. { System.out.println("Caractere invalido: " + yytext() + "\n"); }