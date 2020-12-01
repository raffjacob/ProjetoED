package Projeto;

import java.io.IOException;

import Lista.Aluno;
import Lista.Lista;

public class principal {

	public static void main(String[] args) {
//		int[] vet = {5, 7, 9, 3, 2, 6, 1, 4, 8};
		Lista lista = new Lista();
		String pathTemp = "C:\\TEMP";
		String lerArq = "alunos.txt";
		String escArq = "alunosOrd.txt";
		int[] vet = new int[10];
		String[][] aluno = new String[10][7];
//		String[] vet = new String[10];

		int inicio = 0;
		int fim = aluno.length - 1;
		
		try {
			aluno = leitor.lerMatriz(aluno, pathTemp, lerArq);
			lista.mostra();			
			/*
			for (int i = 0;i<10;i++) {
				System.out.print("Aluno: ");
				for (int j = 0;j<7;j++) {
					System.out.print(aluno[i][j]+" - ");
				}
				System.out.print("\n");
			}*/
			/*
			for (int i=0; i<aluno.length;i++) {
				System.out.println("Posicao "+ i+": " + vet[i]);
				System.out.println("\n\n");
			}*/
			aluno = quickSort.quick(aluno, inicio, fim);
			for(int i=0;i<aluno.length;i++) {
				Aluno cadastro = new Aluno(aluno[i][0], aluno[i][1], aluno[i][2], Float.parseFloat(aluno[i][3]), Float.parseFloat(aluno[i][4]), Float.parseFloat(aluno[i][5]), Float.parseFloat(aluno[i][6]));
				lista.adiciona(cadastro);
			}
			lista.mostra();
//			System.out.println("\n\n");
			/*
			for (int i = 0;i<10;i++) {
				System.out.print("Aluno: ");
				for (int j = 0;j<7;j++) {
					System.out.print(aluno[i][j]+" - ");
				}
				System.out.print("\n");
			}*/
			escritor.escreveMatriz(aluno, pathTemp, escArq);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
//		mergeSort.Sort(inicio, fim, vet);
		
		for (int i=0; i<vet.length;i++) {
//			System.out.println("Posicao "+ i+": " + vet[i]);
		}
		
	}

}
