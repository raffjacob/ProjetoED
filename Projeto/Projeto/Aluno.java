package Projeto;
/***
 * Construtor de Aluno
 * 
 * @author Rafael Jacob
 *
 */
public class Aluno {
	public String Matricula;
	public String Nome;
	public String Disciplina;
	public float NotaP1;
	public float NotaP2;
	public float NotaSUB;
	public float NotaEX;
//	public int total = 0;
	Aluno proximo;
	
//	Construtor Aluno	
	public Aluno(String Matricula,String Nome, String Disciplina, float NotaP1, float NotaP2, float NotaSUB, float NotaEX) {
		this.Matricula = Matricula;
		this.Nome = Nome;
		this.Disciplina = Disciplina;
		this.NotaP1 = NotaP1;
		this.NotaP2 = NotaP2;
		this.NotaSUB = NotaSUB;
		this.NotaEX = NotaEX;
	}
	
	public Aluno getProximo() {
        return proximo;
    }

    public void setProximo(Aluno proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "\nNº Matricula: "+Matricula+
        		"\nNome: " + Nome + 
        		"\nDisciplina: " + Disciplina + 
        		"\nNotaP1: " + NotaP1+ 
        		"\nNotaP2: " + NotaP2+ 
        		"\nNotaSUB: " + NotaSUB+ 
        		"\nNotaEX: " + NotaEX;
    }
		
}
