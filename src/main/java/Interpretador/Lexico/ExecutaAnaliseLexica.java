package Interpretador.Lexico;

import java.io.IOException;
import java.io.StringReader;

public class ExecutaAnaliseLexica {
	
	public static void main(String[] args) throws IOException {
		String expressao = "Qual e o 3º elemento da serie [5, 10, 15, 20]?";
		
		AnalisadorLexico analisadorLexico = new AnalisadorLexico(new StringReader(expressao));
		analisadorLexico.yylex();
	}
}