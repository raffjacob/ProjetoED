package Projeto;

import java.io.IOException;

public class principal {

	public static void main(String[] args) {
		
		Fila filaQS = new Fila();
		Fila filaSS = new Fila();
		String pathTemp = "C:\\TEMP";
		String lerArq = "alunos.txt";
		String escArq1 = "alunosOrdQuickSort.txt";
		String escArq2 = "alunosOrdSelectionSort.txt";
		String[][] aluno = new String[1000][7];
		int inicio = 0;
		int fim = aluno.length - 1;
		selectionSort ss = new selectionSort();
		
		System.out.println("");
		System.out.println("Arquivo que os algoritimos vão ler, usa-lo para preencher a matriz e ordena-la: "+lerArq);
		System.out.println("");
		System.out.println("Tamanho da matriz que será ordenada: [1000][7]");
		System.out.println(" ");
		
		try {
			
			double TI1 = System.currentTimeMillis();
			
			aluno = leitor.lerMatriz(aluno, pathTemp, lerArq);

			aluno = quickSort.quick(aluno, inicio, fim);
			
			for(int i=0;i<aluno.length;i++) {
				Aluno cadastro = new Aluno(aluno[i][0], aluno[i][1], aluno[i][2], Float.parseFloat(aluno[i][3]), Float.parseFloat(aluno[i][4]), Float.parseFloat(aluno[i][5]), Float.parseFloat(aluno[i][6]));
				filaQS.adicionar(cadastro);				
			}
			
			escritor.escreveMatriz(aluno, pathTemp, escArq1);
			double TF1 = (System.currentTimeMillis() - TI1)/1000;
			System.out.println("Tempo usado pelo Quick Sort: " + TF1+" segundos");
			System.out.println("");
			System.out.println("Arquivo salvo em: "+escArq1);
			System.out.println("");
			// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			
			double TI2 = System.currentTimeMillis();
			aluno = leitor.lerMatriz(aluno, pathTemp, lerArq);
				
			ss.SelectionSort(aluno);
			
			for(int i=0;i<aluno.length;i++) {
				Aluno cadastro = new Aluno(aluno[i][0], aluno[i][1], aluno[i][2], Float.parseFloat(aluno[i][3]), Float.parseFloat(aluno[i][4]), Float.parseFloat(aluno[i][5]), Float.parseFloat(aluno[i][6]));
				filaSS.adicionar(cadastro);				
			}
			
			escritor.escreveMatriz(aluno, pathTemp, escArq2);
			double TF2 = (System.currentTimeMillis() - TI2)/1000;
			System.out.println("Tempo usado pelo Selection Sort: " + TF2+" segundos");
			System.out.println("");
			System.out.println("Arquivo salvo em: "+escArq2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

