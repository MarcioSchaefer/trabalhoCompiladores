package Interpretador.Lexico;

import java.io.File;

public class GeradorLexico {

	public static void main(String[] args) {
		
		File diretorioRaiz = new File("");
		String diretorioArquivo = "src/main/java/Interpretador/Lexico/Linguagem.flex";
		
		// Busca o arquivo com as definições da linguagem a ser analisada	
		String arquivo[] = {diretorioRaiz + diretorioArquivo};
			
		// Gera o analisador léxico
		jflex.Main.main(arquivo);
			
		// Exibe mensagem de sucesso caso gere o analisador lexico
		System.out.println("\n\nAnalisador Lexico criado com sucesso =)");
	}
}