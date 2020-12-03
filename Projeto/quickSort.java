package Projeto;
/***
 * QuickSort para ordenação de Matriz
 * Usado para ordenar uma matriz de alunos em ordem de id
 * 
 * @author Rafael Jacob
 *
 */
public class quickSort {
	public static String[][] quick(String matriz[][], int inicio, int fim){
//	    Definião de pivo e variaveis
		int pivo = inicio, i, j;
//		Definição de um vetor auxiliar para ordenação
	    String[] aux = new String[matriz[0].length];
	    for(i=inicio+1;i<=fim;i++){        
	    	j = i;
//	    	Compara o id de cada aluno
	        if(Integer.parseInt(matriz[j][0]) < Integer.parseInt(matriz[pivo][0])){     
//	        	Carrega o aluno com id menor no vetor auxiliar
	        	for(int x=0;x<aux.length;x++) {
	            	aux[x] = matriz[j][x];
	                }
//	        	Realiza as substituições
	            while(j > pivo){           
	                for(int x=0;x<aux.length;x++) {
	            	matriz[j][x] = matriz[j-1][x];
	                }
	                j--;	                
	            }	            	            
	            for(int x=0;x<aux.length;x++) {
	            	matriz[j][x] = aux[x];
	                }
	            pivo++;                    
	        }
	    }
//	    Separa a lista e realiza a ordenação de forma recursiva 
	    if(pivo-1 >= inicio){              
	        quick(matriz,inicio,pivo-1);      
	    }
	    if(pivo+1 <= fim){              
	        quick(matriz,pivo+1,fim);      
	    }
	    return matriz;
	 }
}
