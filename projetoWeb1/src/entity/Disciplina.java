package entity;

public class Disciplina {

	private String disciplina;
	private Double nota1;
	private Double nota2;
	private Double media;
	private String situacao;
	
	public Disciplina() {}

	public Disciplina(String disciplina, Double nota1, Double nota2, Double media, String situacao) {
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getMedia() {
		return media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2=" + nota2 + ", media=" + media
				+ ", situacao=" + situacao + "]";
	}
	
	public Disciplina gerarMedia() {
		this.media = (this.nota1 + this.nota2)/2;
		return this;
		
	}
	
	public Disciplina gerarSitucao() {
		this.situacao = (this.media >= 7) ? "Aprovado" : "Reprovado";
		return this;
	}
}
