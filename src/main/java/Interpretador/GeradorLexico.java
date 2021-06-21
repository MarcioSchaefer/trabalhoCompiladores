package Interpretador;

import java.io.File;
import java.nio.file.Paths;

public class GeradorLexico {

	public static void main(String[] args) {

		// Busca o arquivo com as definições da linguagem a ser analisada
		File arquivoComLinguagem = buscaArquivoComLinguagem("LinguagemNatural.lex");

		// Gera o analisador léxico
		try {
			jflex.Main.generate(arquivoComLinguagem);
			System.out.println("\n\nAnalisador Lexico criado com sucesso =)");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("\n\nFalha ao criar o Analisador Lexico =(");
		}
	}

	public static File buscaArquivoComLinguagem(String arquivo) {
		String diretorioRaiz = Paths.get("").toAbsolutePath().toString();
		String diretorioLinguagens = "/src/main/java/Interpretador/";
		
		String localizacaoArquivo = diretorioRaiz + diretorioLinguagens + arquivo;

		return new File(localizacaoArquivo);
	}
}