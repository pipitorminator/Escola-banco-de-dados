package model;

public class Usuario {

	String cpf;
	String cep;
	String nome;
	String sexo;
	String telefone;
	String telefoneSecundario;
	int numero;
	String email;
	String senha;
	String status;

	public Usuario(String cpf, String cep, String nome, String sexo, String telefone, String telefoneSecundario, int numero, String email, String senha, String status) {
		super();
		this.cpf = cpf;
		this.cep = cep;
		this.nome = nome;
		this.sexo = sexo;
		this.telefone = telefone;
		this.telefoneSecundario = telefoneSecundario;
		this.numero = numero;
		this.email = email;
		this.senha = senha;
		this.status = status;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefoneSecundario() {
		return telefoneSecundario;
	}

	public void setTelefoneSecundario(String telefoneSecundario) {
		this.telefoneSecundario = telefoneSecundario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
