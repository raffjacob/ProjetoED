package Projeto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//import Lista.Lista;
/***
 * Algoritmo para escrita de matriz em arquivo .txt
 * Usado para gravar os dados de uma matriz de alunos
 * 
 * @author Rafael Jacob
 *
 */

public class escritor {
	public static void escreveMatriz(String[][] matriz, String path, String file) throws IOException {
		File arq = new File(path, file);
//		Verifica se o arquivo existe para então ser escrito
		if (arq.exists() && arq.isFile()) {
			FileWriter fileWriter = new FileWriter(arq, true);
			PrintWriter print = new PrintWriter(fileWriter);
			StringBuffer cadastro = new StringBuffer();
//			Loop para a escrita da matriz de alunos
			for (int i = 0; i<matriz.length;i++) {
				for (int j = 0;j<matriz[0].length;j++) {
//					Escreve cada linha separando por ;
					cadastro.append(matriz[i][j]);
					cadastro.append(";");
				}
				cadastro.append("\n");
			}
			print.write(cadastro.toString());
			print.flush();
			print.close();
			fileWriter.close();
//		Cria o arquivo caso não exista
		} else {
			FileWriter fileWriter = new FileWriter(arq, true);
			PrintWriter print = new PrintWriter(fileWriter);
			print.flush();
			print.close();
			fileWriter.close();
			escreveMatriz(matriz, path, file);
		}
	}
}