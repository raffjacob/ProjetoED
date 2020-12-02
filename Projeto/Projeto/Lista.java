package Projeto;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/***
 * Lista encadeada de Aluno
 * 
 * @author Rafael Jacob
 *
 */
public class Lista {
	private Aluno primeiro, ultimo;
	public int total = 0;
	private String separador = "\n----------------------------";
	private String removido = "Aluno foi removido\n";
	private String adicionado = "Aluno foi adicionado\n";
	private String path = "D:\\Fatec\\Codes\\";
	
	
//	Adiciona Aluno na Lista
	public void adiciona(Aluno aluno) { 
        if (total == 0) {
        	primeiro  = aluno;
        	ultimo = primeiro;
        	total++;
        	System.out.println(separador+adicionado+primeiro+separador);
        	escrever(primeiro,adicionado,path);
        } else {       	               
        	ultimo.setProximo(aluno);
            ultimo = aluno; 
            total++;
            System.out.println(separador+adicionado+ultimo+separador);
            escrever(ultimo,adicionado,path);
        }
    }
	
//	Remove Aluno da Lista
	public void remove() {		
        if (total == 0) {
        	System.out.println("Não foi possível remover, a lista está vazia!");
        } else {
        System.out.println(separador+removido+primeiro+separador);
        primeiro = primeiro.getProximo();
        total--;
        escrever(primeiro,removido,path);
        }
    }
/*
    public void separador() {
    	System.out.println("\n----------------------------");
    }
*/
//	Mostra os elementos da Lista
    public void mostra() {
    	Aluno aux = primeiro;
    	int cont = total;
//		separador();
    	System.out.println("Lista:");
    	if (aux == null) {
    		System.out.println("Lista esta vazia!");
    	} else {
    		while (cont > 0) {
            System.out.println(aux.toString());
            aux = aux.getProximo();
            cont--;
        	} 
    	}
    }
    
    public void escrever(Aluno aluno, String texto, String Path) {
    	try {
    		File dir = new File(Path);
    		if (!dir.exists()) {
    			dir.mkdir();
    		}
    		PrintWriter write = new PrintWriter(Path + "log" +".txt");
    		write.println(texto);
    		write.println(aluno);
    		write.flush();
    		write.close();
    	} catch (IOException e) {
    		
    	}
    }
}
