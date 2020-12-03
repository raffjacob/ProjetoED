package Projeto;

public class Fila {
		private Aluno primeiro, ultimo;
	    int inicio;
	    int fim;
	    int tamanho;
	    int qtdeElementos;
	    int f[];
	    
//	    Classe construtora da Fila
	    public Fila(){
	        inicio = fim = -1;
	        tamanho = 1000;
	        tamanho++;
	        f = new int[tamanho];
	        qtdeElementos = 0;
	    }

//	    Verifica ese a Fila esta vazia
	    public boolean estaVazia(){
	        if (qtdeElementos == 0){
	            return true;
	        }
	        return false;
	    }
	    
//	    Verifica se a Fila esta cheia
	    public boolean estaCheia(){
	        if (qtdeElementos == tamanho - 1){
	            return true;
	        }
	        return false;
	    }
	    
//	    Adiciona um elemento de Aluno na Fila
	    public void adicionar(Aluno aluno){
	        if (! estaCheia()){
	        	if (qtdeElementos == 0) {
	            	primeiro  = aluno;
	            	ultimo = primeiro;
	            	qtdeElementos++;	            	
	            } else {       	               
	            	ultimo.setProximo(aluno);
	                ultimo = aluno; 
	                qtdeElementos++;	               
	            }
	        } else {
	        	System.out.println("Não foi possível incluir, a Fila está cheia!");

	        }
	    }
	    
//	    Remove um elemento de Aluno da Fila, removendo pelo primeiro da Fila
	    public void remover(){
	        if (! estaVazia() ){
	            primeiro = primeiro.getProximo();
	            qtdeElementos--;
	        } else {
	        	System.out.println("Não foi possível remover, a Fila está vazia!");

	        }
	    }
	    
//	    Mostre os elementos da Fila
	    public void mostra() {
	    	Aluno aux = primeiro;
	    	int cont = qtdeElementos;
	    	System.out.println("Fila:");
	    	if (aux == null) {
	    		System.out.println("Fila está vazia!");
	    	} else {
	    		while (cont > 0) {
	            System.out.println(aux.toString());
	            aux = aux.getProximo();
	            cont--;
	        	}
	    		System.out.println("\n");
	    	}
	    }
	}
