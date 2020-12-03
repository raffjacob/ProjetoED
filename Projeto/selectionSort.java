package Projeto;

public class selectionSort {

	public String[][] SelectionSort(String[][] aluno) {

		int posicaoMenor;

		String[] aux = new String[7];

		for (int i = 0; i < aluno.length; i++) {

			posicaoMenor = i;

			for (int j = i + 1; j < aluno.length; j++) {

				if (Integer.parseInt(aluno[j][0]) < Integer.parseInt(aluno[posicaoMenor][0])) {
					posicaoMenor = j;
				}
			}

			aux[0] = aluno[posicaoMenor][0];
			aux[1] = aluno[posicaoMenor][1];
			aux[2] = aluno[posicaoMenor][2];
			aux[3] = aluno[posicaoMenor][3];
			aux[4] = aluno[posicaoMenor][4];
			aux[5] = aluno[posicaoMenor][5];
			aux[6] = aluno[posicaoMenor][6];

			aluno[posicaoMenor][0] = aluno[i][0];
			aluno[posicaoMenor][1] = aluno[i][1];
			aluno[posicaoMenor][2] = aluno[i][2];
			aluno[posicaoMenor][3] = aluno[i][3];
			aluno[posicaoMenor][4] = aluno[i][4];
			aluno[posicaoMenor][5] = aluno[i][5];
			aluno[posicaoMenor][6] = aluno[i][6];

			aluno[i][0] = aux[0];
			aluno[i][1] = aux[1];
			aluno[i][2] = aux[2];
			aluno[i][3] = aux[3];
			aluno[i][4] = aux[4];
			aluno[i][5] = aux[5];
			aluno[i][6] = aux[6];

		}

		return aluno;

	}

}
