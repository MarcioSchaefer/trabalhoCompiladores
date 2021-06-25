package Interpretador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.Scanner;

import java_cup.runtime.Symbol;


public class ExecutaAnalise {

	public static void main(String[] args) throws Exception {

		// Informamos o diretorio do caminho com a entrada de dados a ser analisada
		File diretorioArquivo = new File("src/main/java/Interpretador/TESTE2.txt");
		
		// Variavel que ira guardar o arquivo 
		StringBuilder arquivo = new StringBuilder();
		
		// Caso seja possivel abrir o arquivo, a variavel irá guardar cada linha presente no mesmo
		try(Scanner leitorDeArquivo = new Scanner(diretorioArquivo)) {	
			
			while (leitorDeArquivo.hasNextLine())
				arquivo.append(leitorDeArquivo.nextLine().concat("\n")); 
			
			leitorDeArquivo.close(); 
		
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo de entrada nao foi encontrado!");
		} 
			
		System.out.println("FOI REALIZADO A SEGUINTE ANALISE LEXICA:");
		System.out.println("----------------------------------------\n\n");
		
		// Instancia analisador lexico e passa por parametro o arquivo a ser analisado
		AnalisadorLexico analisadorLexico = new AnalisadorLexico(new StringReader(arquivo.toString()));
        Symbol s = analisadorLexico.next_token();
        
        // Faz a escrita de cada token que foi possivel identificar
        while(s.sym != sym.EOF){
        	System.out.println("Lexema: " + s.value + " - Codigo SYM: " + s.sym  + "\n");
            s = analisadorLexico.next_token();
        }
        System.out.println("----------------------------------------\n\n");
        
        try {
        	
			// Instancia analisador sintatico e passa por parametro a instancia lexica
			analisadorLexico = new AnalisadorLexico(new StringReader(arquivo.toString()));
			parser variavelParser = new parser(analisadorLexico);
			variavelParser.parse();
			
			System.out.println("A Analise Sintatica esta correta!");
				
		} catch (Exception e) {
			System.out.println("\nA Analise Sintatica esta incorreta!");
		}
        
        
		
	
	}
}