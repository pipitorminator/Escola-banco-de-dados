package model;

public class OfertaDisciplina {

	long id_disciplina;
	long id_periodo;
	String cpf_prof;
	String status;
	String dia1;
	String dia2;
	String hora1;
	String hora2;

	public OfertaDisciplina(long id_disciplina, long id_periodo, String cpf_prof, String status, String dia1, String dia2, String hora1, String hora2) {
		super();
		this.id_disciplina = id_disciplina;
		this.id_periodo = id_periodo;
		this.cpf_prof = cpf_prof;
		this.status = status;
		this.dia1 = dia1;
		this.dia2 = dia2;
		this.hora1 = hora1;
		this.hora2 = hora2;
	}

	public long getId_disciplina() {
		return id_disciplina;
	}

	public void setId_disciplina(long id_disciplina) {
		this.id_disciplina = id_disciplina;
	}

	public long getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(long id_periodo) {
		this.id_periodo = id_periodo;
	}

	public String getCpf_prof() {
		return cpf_prof;
	}

	public void setCpf_prof(String cpf_prof) {
		this.cpf_prof = cpf_prof;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDia1() {
		return dia1;
	}

	public void setDia1(String dia1) {
		this.dia1 = dia1;
	}

	public String getDia2() {
		return dia2;
	}

	public void setDia2(String dia2) {
		this.dia2 = dia2;
	}

	public String getHora1() {
		return hora1;
	}

	public void setHora1(String hora1) {
		this.hora1 = hora1;
	}

	public String getHora2() {
		return hora2;
	}

	public void setHora2(String hora2) {
		this.hora2 = hora2;
	}

}
