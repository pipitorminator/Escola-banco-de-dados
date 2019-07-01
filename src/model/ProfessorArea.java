package model;

public class ProfessorArea {

	String cpf_professor;
	long codigo_area;

	public ProfessorArea(String cpf_professor, long codigo_area) {
		super();
		this.cpf_professor = cpf_professor;
		this.codigo_area = codigo_area;
	}

	public String getCpf_professor() {
		return cpf_professor;
	}

	public void setCpf_professor(String cpf_professor) {
		this.cpf_professor = cpf_professor;
	}

	public long getCodigo_area() {
		return codigo_area;
	}

	public void setCodigo_area(long codigo_area) {
		this.codigo_area = codigo_area;
	}

}
