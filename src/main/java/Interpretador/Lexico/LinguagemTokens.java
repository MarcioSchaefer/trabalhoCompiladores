package Interpretador.Lexico;

//Tokens criados no arquivo de linguagem (Linguagem.lex) definidos como enum para organização e utilização pela programa principal
public enum LinguagemTokens {
	DIGITO, LETRA, PALAVRA, NUMERO, NUMERO_ORDINAL, IGNORAR, SEPARADOR, PALAVRA_RESERVADA, OPERADOR_CONDICIONAL,
	OPERADOR_REPETICAO, OPERADOR_RELACIONAL, OPERADOR_SOMA, OPERADOR_SUBTRACAO, OPERADOR_MULTIPLICACAO,
	OPERADOR_DIVISAO, OPERADOR_MULTIPLICACAO_POR2, OPERADOR_MULTIPLICACAO_POR3, SIMBOLO_FIM_FRASE, SIMBOLO_ESPECIAL,
	OPERADOR_ATRIBUICAO, VARIAVEL
}