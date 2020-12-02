package Projeto;

public class mergeSort {
	public static void Sort(int inicio, int fim, int[] vet){
		if (inicio < fim-1) {
			int meio = (inicio + fim)/2;
			Sort(inicio, meio, vet);
			Sort(meio, fim, vet);
			intercala(inicio, meio, fim, vet);
		}		
	}

	private static void intercala(int inicio, int meio, int fim, int[] vet) {
		int novoVet[] = new int[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;
		
		while(i < meio && m < fim) {
			if(vet[i] <= vet[m]) {
				novoVet[pos] = vet[i];
				pos++;
				i++;
			} else {
				novoVet[pos] = vet[m];
				pos++;
				m++;
			}
		}
		while (i<meio) {
			novoVet[pos] = vet[i];
			pos++;
			i++;
		}
		while (m<fim) {
			novoVet[pos] = vet[m];
			pos++;
			m++;
		}
		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vet[i] = novoVet[pos];
		}
	}
}
