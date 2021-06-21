package Interpretador;

import java.io.IOException;
import java.io.StringReader;

public class EntradaDeDados {
	
	public static void main(String[] args) throws IOException {
		String expressao = "if 2 + 3+a then";

		AnalisadorLexico analisadorLexico = new AnalisadorLexico(new StringReader(expressao));
		analisadorLexico.yylex();
	}
}