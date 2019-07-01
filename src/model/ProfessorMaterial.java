package model;

public class ProfessorMaterial {

	String cpf_professor;
	long id_material;

	public ProfessorMaterial(String cpf_professor, long id_material) {
		super();
		this.cpf_professor = cpf_professor;
		this.id_material = id_material;
	}

	public String getCpf_professor() {
		return cpf_professor;
	}

	public void setCpf_professor(String cpf_professor) {
		this.cpf_professor = cpf_professor;
	}

	public long getId_material() {
		return id_material;
	}

	public void setId_material(long id_material) {
		this.id_material = id_material;
	};

}
