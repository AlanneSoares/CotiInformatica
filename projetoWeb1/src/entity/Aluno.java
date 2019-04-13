package entity;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	// atributos deverá ser iguais ao formulário
	private String nome;
	private String email;
	private List<Disciplina> disciplinas; 
	
	
	public Aluno() {}
		
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", email=" + email + ", disciplinas=" + disciplinas + "]";
	}
	
	public void adicionar(Disciplina d) {
		
		if (disciplinas == null) {
			this.disciplinas = new ArrayList<Disciplina>();
		}
		
		this.disciplinas.add(d);
		
	}
}
