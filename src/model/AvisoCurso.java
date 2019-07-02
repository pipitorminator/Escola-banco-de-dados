package model;

public class AvisoCurso {

	long codigo_curso;
	int numero_aviso;

	public AvisoCurso(long codigo_curso, int numero_aviso) {
		super();
		this.codigo_curso = codigo_curso;
		this.numero_aviso = numero_aviso;
	}

	public long getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(long codigo_curso) {
		this.codigo_curso = codigo_curso;
	}

	public int getNumero_aviso() {
		return numero_aviso;
	}

	public void setNumero_aviso(int numero_aviso) {
		this.numero_aviso = numero_aviso;
	}

}
