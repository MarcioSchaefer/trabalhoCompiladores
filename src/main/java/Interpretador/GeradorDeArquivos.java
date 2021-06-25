package Interpretador;

import java.io.IOException;

import java_cup.internal_error;

public class GeradorDeArquivos {

	public static void main(String[] args) throws internal_error, IOException, Exception {

		// Variavel contendo diretorio onde se encontra o arquivo com as definições da linguagem
		String arquivoLexico[] = { "src/main/java/Interpretador/Linguagem.flex" };

		// Variavel contendo diretorio onde se encontra o arquivo com as definições da gramatica da linguagem
		String arquivoSintatico[] = { "src/main/java/Interpretador/Parser.cup" };

		lexico(arquivoLexico);
		sintatico(arquivoSintatico);
	}

	// Gera o analisador léxico atraves do arquivo informado
	public static void lexico(String arquivo[]) {
		jflex.Main.main(arquivo);
		System.out.println("\n\nAnalisador Lexico criado com sucesso =)\n\n");
	}

	// Gera o analisador sintatico atraves do arquivo informado
	public static void sintatico(String arquivo[]) throws internal_error, IOException, Exception {
		java_cup.Main.main(arquivo);
		System.out.println("\n\nAnalisador Sintatico criado com sucesso =)\n\n");
	}
}