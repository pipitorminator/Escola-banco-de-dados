package model;

public class questao {

	long id;
	String cpf_professor;
	String pergunta;
	String tipo;

	public questao(long id, String cpf_professor, String pergunta, String tipo) {
		super();
		this.id = id;
		this.cpf_professor = cpf_professor;
		this.pergunta = pergunta;
		this.tipo = tipo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf_professor() {
		return cpf_professor;
	}

	public void setCpf_professor(String cpf_professor) {
		this.cpf_professor = cpf_professor;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
