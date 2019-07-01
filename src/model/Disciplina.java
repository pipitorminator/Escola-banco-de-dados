package model;

public class Disciplina {

	long id;
	long codigo_area_conhecimento;
	long id_disci_requisito_curso;
	long codigo_curso;
	String nome;
	String ementa;
	int num_creditos;

	public Disciplina(long id, long codigo_area_conhecimento, long id_disci_requisito_curso, long codigo_curso, String nome, String ementa, int num_creditos) {
		super();
		this.id = id;
		this.codigo_area_conhecimento = codigo_area_conhecimento;
		this.id_disci_requisito_curso = id_disci_requisito_curso;
		this.codigo_curso = codigo_curso;
		this.nome = nome;
		this.ementa = ementa;
		this.num_creditos = num_creditos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCodigo_area_conhecimento() {
		return codigo_area_conhecimento;
	}

	public void setCodigo_area_conhecimento(long codigo_area_conhecimento) {
		this.codigo_area_conhecimento = codigo_area_conhecimento;
	}

	public long getId_disci_requisito_curso() {
		return id_disci_requisito_curso;
	}

	public void setId_disci_requisito_curso(long id_disci_requisito_curso) {
		this.id_disci_requisito_curso = id_disci_requisito_curso;
	}

	public long getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(long codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public int getNum_creditos() {
		return num_creditos;
	}

	public void setNum_creditos(int num_creditos) {
		this.num_creditos = num_creditos;
	}

}
