package Interpretador.Lexico;

public class GeradorLexico {

	public static void main(String[] args) {
		
		// Variavel contendo diretorio onde se encontra o arquivo com as definições da linguagem a ser analisada	
		String arquivo[] = {"src/main/java/Interpretador/Lexico/Linguagem.flex"};
		
		// Gera o analisador léxico atraves do arquivo informado
		jflex.Main.main(arquivo);
		
		// Exibe mensagem de sucesso caso gere o analisador lexico
		System.out.println("\n\nAnalisador Lexico criado com sucesso =)");
	}
}