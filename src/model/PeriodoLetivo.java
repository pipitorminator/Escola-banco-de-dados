package model;

public class PeriodoLetivo {

	long idPeriodo;
	String ano;
	String dataInicio;
	String dataFim;
	String status;
	String semestre;
	String calendario;
	String obs;

	public PeriodoLetivo(long idPeriodo, String ano, String dataInicio, String dataFim, String status, String semestre, String calendario, String obs) {
		super();
		this.idPeriodo = idPeriodo;
		this.ano = ano;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.status = status;
		this.semestre = semestre;
		this.calendario = calendario;
		this.obs = obs;
	}

	public long getIdPeriodo() {
		return idPeriodo;
	}

	public void setIdPeriodo(long idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getCalendario() {
		return calendario;
	}

	public void setCalendario(String calendario) {
		this.calendario = calendario;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
