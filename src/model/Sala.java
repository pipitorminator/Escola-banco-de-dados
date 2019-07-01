package model;

public class Sala {

	long id;
	int numero;
	int capacidade;

	public Sala(long id, int numero, int capacidade) {
		super();
		this.id = id;
		this.numero = numero;
		this.capacidade = capacidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
