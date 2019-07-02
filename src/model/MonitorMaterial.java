package model;

public class MonitorMaterial {

	String cpf_monitor;
	long id_material;
	String data;

	public MonitorMaterial(String cpf_monitor, long id_material, String data) {
		super();
		this.cpf_monitor = cpf_monitor;
		this.id_material = id_material;
		this.data = data;
	}

	public String getCpf_monitor() {
		return cpf_monitor;
	}

	public void setCpf_monitor(String cpf_monitor) {
		this.cpf_monitor = cpf_monitor;
	}

	public long getId_material() {
		return id_material;
	}

	public void setId_material(long id_material) {
		this.id_material = id_material;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	};

}
