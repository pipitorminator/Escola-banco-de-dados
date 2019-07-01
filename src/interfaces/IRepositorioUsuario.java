package interfaces;

import model.Usuario;

public interface IRepositorioUsuario {

	public void inserir(Usuario usuario);

	public void remover(String cpf);

	public boolean existe(String cpf);

	public Usuario buscar(String cpf);
}
