package Projeto;

import java.io.IOException;

import Lista.Aluno;
import Lista.Lista;

public class principal {

	public static void main(String[] args) {
		Lista lista = new Lista();
		String pathTemp = "C:\\TEMP";
		String lerArq = "alunos.txt";
		String escArq = "alunosOrd.txt";
		String[][] aluno = new String[1000][7];
		int inicio = 0;
		int fim = aluno.length - 1;
		
		try {
			double start = System.currentTimeMillis();
			aluno = leitor.lerMatriz(aluno, pathTemp, lerArq);
//			lista.mostra();			
			aluno = quickSort.quick(aluno, inicio, fim);
			for(int i=0;i<aluno.length;i++) {
				Aluno cadastro = new Aluno(aluno[i][0], aluno[i][1], aluno[i][2], Float.parseFloat(aluno[i][3]), Float.parseFloat(aluno[i][4]), Float.parseFloat(aluno[i][5]), Float.parseFloat(aluno[i][6]));
				lista.adiciona(cadastro);				
			}
//			lista.mostra();
			escritor.escreveMatriz(aluno, pathTemp, escArq);
			double elapsed = (System.currentTimeMillis() - start)/1000;
			System.out.println("Tempo medido: " + elapsed+" segundos");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
