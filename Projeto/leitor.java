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
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				for (int i = 0;i<matriz.length;i++) {
					for (int j = 0;j<matriz[0].length;j++) {
						String[] col = linha.split(",");
						aluno[i][j] = col[j];
					}
					linha = buffer.readLine();
				}
			}
//			System.out.println(aluno.length);
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			JOptionPane.showMessageDialog(null, "Arquivo não existe!");
		}
		return aluno;
	}
}
