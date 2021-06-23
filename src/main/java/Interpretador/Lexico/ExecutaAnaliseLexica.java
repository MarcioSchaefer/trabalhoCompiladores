package Interpretador.Lexico;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;

public class ExecutaAnaliseLexica {
	public static void main(String[] args) throws IOException  {
		
		// Informamos o diretorio do caminho com a entrada de dados a ser analisada
		File diretorioArquivo = new File("src/main/java/Interpretador/Lexico/EntradaDeDadosTXT.txt");
		
		// Variavel que ira guardar o arquivo 
		StringBuilder arquivo = new StringBuilder();
		
		// Caso seja possivel abrir o arquivo, a variavel irá guardar cada linha presente no mesmo
		try(Scanner leitorDeArquivo = new Scanner(diretorioArquivo)) {	
			while (leitorDeArquivo.hasNextLine())
				arquivo.append(leitorDeArquivo.nextLine().concat("\n")); 
			
		leitorDeArquivo.close(); 
					
		// Apos a correta leitura, ira apresentar os dados que foram lidos
		System.out.println("----------------------------------------");
		System.out.println("DADA A SEGUINTE ENTRADA DE DADOS:");
		System.out.println("----------------------------------------\n\n");
		System.out.println(arquivo.toString());
		System.out.println("\n\n----------------------------------------");
		System.out.println("FOI REALIZADO A SEGUINTE ANALISE LEXICA:");
		System.out.println("----------------------------------------\n\n");
		
		// Passara os dados lidos para o analisador lexico fazer a analise
		AnalisadorLexico analisadorLexico = new AnalisadorLexico(new StringReader(arquivo.toString()));
		
		// Analisador lexico retorna os dados analisados
		analisadorLexico.yylex();
		
		// Casso nao encontre o arquivo de entrada de dados
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo de entrada nao foi encontrado!");
		} 
	}
}