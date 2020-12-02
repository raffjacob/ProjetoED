package Projeto;

//import javax.swing.JOptionPane;

import Lista.Aluno;

public class Fila {
		private Aluno primeiro, ultimo;
	    int inicio;
	    int fim;
	    int tamanho;
	    int qtdeElementos;
	    int f[];

	    public Fila(){
	        inicio = fim = -1;
	        tamanho = 100;
	        tamanho++;
	        f = new int[tamanho];
	        qtdeElementos = 0;
	    }

	    public boolean estaVazia(){
	        if (qtdeElementos == 0){
	            return true;
	        }
	        return false;
	    }
	    
	    public boolean estaCheia(){
	        if (qtdeElementos == tamanho - 1){
	            return true;
	        }
	        return false;
	    }
	    
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
	    
	    public void remover(){
	        if (! estaVazia() ){
//	            inicio++;
	            primeiro = primeiro.getProximo();
	            qtdeElementos--;
	        } else {
	        	System.out.println("Não foi possível remover, a Fila está vazia!");

	        }
	    }
	    
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
