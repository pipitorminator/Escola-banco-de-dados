package model;

public class Turma {
	long codigo;
	long id_sala;
	String nome;
	String sigla;
	String semestre;
	String ano;
	int quantidade_alunos;
	String turno;
	String status;

	public Turma(long codigo, long id_sala, String nome, String sigla, String semestre, String ano, int quantidade_alunos, String turno, String status) {
		super();
		this.codigo = codigo;
		this.id_sala = id_sala;
		this.nome = nome;
		this.sigla = sigla;
		this.semestre = semestre;
		this.ano = ano;
		this.quantidade_alunos = quantidade_alunos;
		this.turno = turno;
		this.status = status;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getId_sala() {
		return id_sala;
	}

	public void setId_sala(long id_sala) {
		this.id_sala = id_sala;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getQuantidade_alunos() {
		return quantidade_alunos;
	}

	public void setQuantidade_alunos(int quantidade_alunos) {
		this.quantidade_alunos = quantidade_alunos;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
