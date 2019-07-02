package interfaces;

import model.Aluno;
import model.Usuario;

public interface IRepositorioAluno  {

	
	public void inserir(Aluno aluno);

	public void remover(String cpf);

	public boolean existe(String cpf);

	public Aluno consultar(String cpf);
	
	public Usuario loginAluno(String cpf, String senha);
}
