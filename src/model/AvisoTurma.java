package model;

public class AvisoTurma {

	int numero_aviso;
	long codigo_turma;

	public AvisoTurma(int numero_aviso, long codigo_turma) {
		super();
		this.numero_aviso = numero_aviso;
		this.codigo_turma = codigo_turma;
	}

	public int getNumero_aviso() {
		return numero_aviso;
	}

	public void setNumero_aviso(int numero_aviso) {
		this.numero_aviso = numero_aviso;
	}

	public long getCodigo_turma() {
		return codigo_turma;
	}

	public void setCodigo_turma(long codigo_turma) {
		this.codigo_turma = codigo_turma;
	}

}
