package Projeto;

public class selectionSort {
	void selecao (String matriz[][], int tam){
		 int i, j, min, x;
		 for (i=1; i<=tam-1; i++){
			 min = i;
			 for (j=i+1; j<=tam; j++){
				 if (Integer.parseInt(matriz[j][0]) < Integer.parseInt(matriz[min][0]))
					 min = j;
			 }
			 x = Integer.parseInt(matriz[min][0]);
			 matriz[min] = matriz[i];
			 matriz[i][0] = String.valueOf(x);
		 	}
		}
	}
