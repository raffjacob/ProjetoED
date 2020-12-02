package Projeto;

import java.io.IOException;

import Lista.Aluno;
import Lista.Lista;
import Projeto.Fila;

public class principal {

	public static void main(String[] args) {
		Lista lista = new Lista();
		Fila fila = new Fila();
		String pathTemp = "C:\\TEMP";
		String lerArq = "teste.txt";
		String escArq = "AlunosOrd.txt";
		String[][] matrizAlunos = new String[10][7];
		int inicio = 0;
		int fim = matrizAlunos.length - 1;
		
		try {
			double TI = System.currentTimeMillis();
			matrizAlunos = leitor.lerMatriz(matrizAlunos, pathTemp, lerArq);
//			lista.mostra();			
			matrizAlunos = quickSort.quick(matrizAlunos, inicio, fim);
			for(int i=0;i<matrizAlunos.length;i++) {
				Aluno cadastro = new Aluno(
						matrizAlunos[i][0]
						, matrizAlunos[i][1]
						, matrizAlunos[i][2]
						, Float.parseFloat(matrizAlunos[i][3])
						, Float.parseFloat(matrizAlunos[i][4])
						, Float.parseFloat(matrizAlunos[i][5])
						, Float.parseFloat(matrizAlunos[i][6]));
//				lista.adiciona(cadastro);
				fila.adicionar(cadastro);
//				matrizAlunos = converteAluno.conversor(cadastro, matrizAlunos);
			}
//			lista.mostra();
			fila.mostra();
			fila.remover();
			fila.mostra();
//			matrizAlunos = converteAluno.conversor(cadastro, matrizAlunos);
			escritor.escreveMatriz(matrizAlunos, pathTemp, escArq);
			double TF = (System.currentTimeMillis() - TI)/1000;
			System.out.println("Tempo medido: " + TF +" segundos");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
