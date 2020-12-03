package Projeto;

import java.io.IOException;

public class principal {

	public static void main(String[] args) {
		
		Fila fila_quickSort = new Fila();
		Fila fila_selectionSort = new Fila();
		String caminho_arquivos = "C:\\TEMP";
		String arquivo_leitura = "alunos.txt";
		String arquivo_escrita_quicksort = "alunosOrdQuickSort.txt";
		String arquivo_escrita_selectionSort = "alunosOrdSelectionSort.txt";
//		Definido uma matriz com o número de linhas igual a quantidade de linhas do arquivo de leitura
		String[][] matriz_alunos = new String[1000][7];
		int inicio = 0;
		int fim = matriz_alunos.length - 1;
		selectionSort ss = new selectionSort();
		
		System.out.println("");
		System.out.println("Arquivo que os algoritimos vão ler, usa-lo para preencher a matriz e ordena-la: "+arquivo_leitura);
		System.out.println("");
		System.out.println("Tamanho da matriz que será ordenada: [1000][7]");
		System.out.println(" ");
		
		try {
//			Realiza o teste para o Quick Sort, começa contagem do processo, realiza a leitura, ordenação e escrita.
			double tempo_inicial_1 = System.currentTimeMillis();
			
			matriz_alunos = leitor.lerMatriz(matriz_alunos, caminho_arquivos, arquivo_leitura);
			
			matriz_alunos = quickSort.quick(matriz_alunos, inicio, fim);
			
			for(int i=0;i<matriz_alunos.length;i++) {
				Aluno cadastro = new Aluno (matriz_alunos[i][0], matriz_alunos[i][1], matriz_alunos[i][2], Float.parseFloat(matriz_alunos[i][3]), Float.parseFloat(matriz_alunos[i][4]), Float.parseFloat(matriz_alunos[i][5]), Float.parseFloat(matriz_alunos[i][6]));
				fila_quickSort.adicionar(cadastro);				
			}
			
			escritor.escreveMatriz(matriz_alunos, caminho_arquivos, arquivo_escrita_quicksort);
			double tempo_final_1 = (System.currentTimeMillis() - tempo_inicial_1)/1000;
			System.out.println("Tempo usado pelo Quick Sort: " + tempo_final_1+" segundos");
			System.out.println("");
			System.out.println("Arquivo salvo em: "+arquivo_escrita_quicksort);
			System.out.println("");
			// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
			
//			Realiza o teste para o Selection Sort, começa contagem do processo, realiza a leitura, ordenação e escrita.
			double tempo_inicial_2 = System.currentTimeMillis();
			matriz_alunos = leitor.lerMatriz(matriz_alunos, caminho_arquivos, arquivo_leitura);
				
			ss.SelectionSort(matriz_alunos);
			
			for(int i=0;i<matriz_alunos.length;i++) {
				Aluno cadastro = new Aluno (matriz_alunos[i][0], matriz_alunos[i][1], matriz_alunos[i][2], Float.parseFloat(matriz_alunos[i][3]), Float.parseFloat(matriz_alunos[i][4]), Float.parseFloat(matriz_alunos[i][5]), Float.parseFloat(matriz_alunos[i][6]));
				fila_selectionSort.adicionar(cadastro);				
			}
			
			escritor.escreveMatriz(matriz_alunos, caminho_arquivos, arquivo_escrita_selectionSort);
			double tempo_final_2 = (System.currentTimeMillis() - tempo_inicial_2)/1000;
			System.out.println("Tempo usado pelo Selection Sort: " + tempo_final_2+" segundos");
			System.out.println("");
			System.out.println("Arquivo salvo em: "+arquivo_escrita_selectionSort);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

