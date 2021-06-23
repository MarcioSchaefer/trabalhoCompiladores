package Interpretador.Sintatico;

import java_cup.runtime.Symbol;

%%

%cup
%full
%line
%char
%ignorecase
%eofval{
    return new Symbol(sym.EOF, new String("Fim do arquivo"));
%eofval}

%public
%class AnalisadorLexico
%type LinguagemTokens
%ignorecase

DIGITO = [0-9]
LETRA = [a-zA-Z]
NUMERO = {DIGITO}+
NUMERO_ORDINAL = ({NUMERO} "º" | {DIGITO} "º")
PALAVRA = {LETRA}+
IGNORAR = [ \t\r\n]
SEPARADOR = ("(" | ")" | "[" | "]")
OPERADOR_CONDICIONAL = ("se" | "senao")
OPERADOR_REPETICAO = ("escreva") 
OPERADOR_RELACIONAL = ("maior" | "menor" | "igual" | "diferente")
OPERADOR_SOMA = ("mais" | "+")
OPERADOR_SUBTRACAO = ("menos" | "-")
OPERADOR_MULTIPLICACAO = ("vezes" | "*")
OPERADOR_DIVISAO = ("dividido" | "/")
OPERADOR_ATRIBUICAO = ("guarde" | "=")
OPERADOR_MULTIPLICACAO_POR2 = ("dobro")
OPERADOR_MULTIPLICACAO_POR3 = ("triplo")
SIMBOLO_FIM_FRASE = (";" | "?")
SIMBOLO_ESPECIAL = ("'" | ",")
VARIAVEL = ("#" {LETRA} | "#" {PALAVRA}) 

%{
public String lexema;
%}

%%

{SIMBOLO_ESPECIAL}				{ imprimir( yytext(), LinguagemTokens.SIMBOLO_ESPECIAL); }
{SIMBOLO_FIM_FRASE}				{ imprimir( yytext(), LinguagemTokens.SIMBOLO_FIM_FRASE); }
{SEPARADOR}						{ imprimir( yytext(), LinguagemTokens.SEPARADOR); }

{OPERADOR_CONDICIONAL}			{ imprimir( yytext(), LinguagemTokens.OPERADOR_CONDICIONAL); }
{OPERADOR_REPETICAO}			{ imprimir( yytext(), LinguagemTokens.OPERADOR_REPETICAO); }
{OPERADOR_RELACIONAL}			{ imprimir( yytext(), LinguagemTokens.OPERADOR_RELACIONAL); }

{OPERADOR_SOMA}					{ imprimir( yytext(), LinguagemTokens.OPERADOR_SOMA); }
{OPERADOR_SUBTRACAO}			{ imprimir( yytext(), LinguagemTokens.OPERADOR_SUBTRACAO); }
{OPERADOR_MULTIPLICACAO}		{ imprimir( yytext(), LinguagemTokens.OPERADOR_MULTIPLICACAO); }
{OPERADOR_DIVISAO}				{ imprimir( yytext(), LinguagemTokens.OPERADOR_DIVISAO); }
{OPERADOR_ATRIBUICAO}			{ imprimir( yytext(), LinguagemTokens.OPERADOR_ATRIBUICAO); }

{OPERADOR_MULTIPLICACAO_POR2}	{ imprimir( yytext(), LinguagemTokens.OPERADOR_MULTIPLICACAO_POR2); }
{OPERADOR_MULTIPLICACAO_POR3}	{ imprimir( yytext(), LinguagemTokens.OPERADOR_MULTIPLICACAO_POR3); }

{DIGITO}						{ imprimir( yytext(), LinguagemTokens.DIGITO); }
{NUMERO}						{ imprimir( yytext(), LinguagemTokens.NUMERO); }
{NUMERO_ORDINAL}				{ imprimir( yytext(), LinguagemTokens.NUMERO_ORDINAL); }
{LETRA}							{ imprimir( yytext(), LinguagemTokens.LETRA); }
{PALAVRA}						{ imprimir( yytext(), LinguagemTokens.PALAVRA); }
{VARIAVEL}						{ imprimir( yytext(), LinguagemTokens.VARIAVEL); }

{IGNORAR}						{}

. { System.out.println("Caractere invalido: " + yytext() + "\n"); }