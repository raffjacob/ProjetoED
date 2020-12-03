package Projeto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/***
 * Leitura de matriz em arquivo .txt
 * Usado para leitura de uma matriz de alunos
 * 
 * @author Rafael Jacob
 *
 */

public class leitor {
	public static String[][] lerMatriz(String[][] matriz, String path, String file) throws IOException{
		File arq = new File(path, file);
		String[][] aluno = matriz;
//		Verifica se o arquivo existe para então realizar a leitura
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				for (int i = 0;i<matriz.length;i++) {
					for (int j = 0;j<matriz[0].length;j++) {
//						Realiza a leitura da linha separando por ;
						String[] col = linha.split(";");
						aluno[i][j] = col[j];
					}
					linha = buffer.readLine();
				}
			}
			buffer.close();
			leitor.close();
			fluxo.close();
//		Apresenta erro caso o arquivo não exista
		} else {
			JOptionPane.showMessageDialog(null, "Arquivo não existe!");
		}
		return aluno;
	}
}
