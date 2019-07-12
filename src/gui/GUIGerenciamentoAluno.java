package gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import controllers.AlunoController;
import controllers.FuncionarioController;
import controllers.ProfessorController;
import controllers.SecretariaController;
import controllers.UsuarioController;
import model.Aluno;
import model.Professor;
import model.Secretaria;
import model.Usuario;
import repositorios.RepositorioAluno;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class GUIGerenciamentoAluno extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;

	/**
	 * Create the frame.
	 */
	public GUIGerenciamentoAluno() {
		setBounds(100, 100, 425, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGerenciamentoAluno = new JLabel("Gerenciamento usuario");
		lblGerenciamentoAluno.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblGerenciamentoAluno.setBounds(10, 0, 340, 39);
		contentPane.add(lblGerenciamentoAluno);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(23, 60, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(23, 95, 46, 14);
		contentPane.add(lblNome);

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(23, 130, 46, 14);
		contentPane.add(lblSexo);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(23, 165, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(23, 200, 46, 14);
		contentPane.add(lblTelefone);

		JLabel lblTelefone_1 = new JLabel("Telefone2");
		lblTelefone_1.setBounds(23, 235, 60, 14);
		contentPane.add(lblTelefone_1);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(23, 270, 46, 14);
		contentPane.add(lblCep);

		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(23, 305, 46, 14);
		contentPane.add(lblNumero);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inserirAluno();
			}
		});
		btnInserir.setBounds(10, 404, 89, 23);
		contentPane.add(btnInserir);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscar();
			}
		});
		btnBuscar.setBounds(214, 404, 89, 23);
		contentPane.add(btnBuscar);

		textField = new JTextField();
		textField.setBounds(83, 57, 220, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(83, 92, 220, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(83, 127, 220, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(83, 162, 220, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(83, 197, 220, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(83, 232, 220, 20);
		contentPane.add(textField_5);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(83, 302, 220, 20);
		contentPane.add(textField_7);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				deletar();
			}
		});
		btnDeletar.setBounds(109, 404, 89, 23);
		contentPane.add(btnDeletar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				update();
			}
		});
		btnUpdate.setBounds(310, 404, 89, 23);
		contentPane.add(btnUpdate);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(130, 333, 146, 20);
		comboBox.addItem("professor");
		comboBox.addItem("aluno");
		comboBox.addItem("secretaria");
		contentPane.add(comboBox);

		JLabel lblTipoUsuario = new JLabel("tipo usuario");
		lblTipoUsuario.setBounds(23, 336, 76, 14);
		contentPane.add(lblTipoUsuario);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(79, 267, 224, 20);
		contentPane.add(comboBox_1);

		UsuarioController usuarioController = new UsuarioController();
		ArrayList<String> ceps = usuarioController.buscarCEP();

		for (int i = 0; i < ceps.size(); i++) {
			comboBox_1.addItem(ceps.get(i));
		}

	}

	public void update() {
		UsuarioController usuarioController = new UsuarioController();
		Usuario usuario = new Usuario(textField.getText(), comboBox_1.getSelectedItem().toString(), textField_1.getText(), textField_2.getText(), textField_4.getText(), textField_5.getText(), Integer.parseInt(textField_7.getText()), textField_3.getText(), textField_1.getText(), "1");
		Usuario usuarioguia = usuarioController.buscar(textField.getText());
		if (usuarioguia != null) {
			usuarioController.update(usuario);
			JOptionPane.showMessageDialog(this, "Update feito");
		} else {

			JOptionPane.showMessageDialog(this, "Usuario não existe para update");
		}

	}

	public void inserirAluno() {
		try {
			RepositorioAluno repositorioAluno = new RepositorioAluno();
			AlunoController alunoController = new AlunoController(repositorioAluno);
			UsuarioController usuarioController = new UsuarioController();
			Usuario usuario = new Usuario(textField.getText(), comboBox_1.getSelectedItem().toString(), textField_1.getText(), textField_2.getText(), textField_4.getText(), textField_5.getText(), Integer.parseInt(textField_7.getText()), textField_3.getText(), textField_1.getText(), "1");
			usuarioController.inserir(usuario);
			FuncionarioController controller = new FuncionarioController();
			switch (comboBox.getSelectedItem().toString()) {
			case "aluno":
				Aluno aluno = new Aluno(textField.getText());
				try {
					alunoController.cadastrar(aluno);
					JOptionPane.showMessageDialog(this, "usuario cadastrado");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(this, "usuario ja cadastrado");
				}
				break;

			case "professor":
				controller.inserir(textField.getText());
				Professor professor = new Professor(textField.getText());
				try {
					ProfessorController professorController = new ProfessorController();
					professorController.inserir(professor);
					JOptionPane.showMessageDialog(this, "professor cadastrado");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(this, "professor ja cadastrado");
				}
				break;
			case "secretaria":
				controller.inserir(textField.getText());
				Secretaria secretaria = new Secretaria(textField.getText());
				try {
					SecretariaController secretariaController = new SecretariaController();
					secretariaController.inserir(secretaria);
					JOptionPane.showMessageDialog(this, "secretaria ja cadastrado");
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(this, "secretaria ja cadastrado");
				}
				break;

			}

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}

	}

	public void buscar() {
		try {
			UsuarioController usuarioController = new UsuarioController();
			Usuario usuario = usuarioController.buscar(textField.getText());
			textField.setText(usuario.getCpf());
			textField_1.setText(usuario.getNome());
			textField_2.setText(usuario.getSexo());
			textField_3.setText(usuario.getEmail());
			textField_4.setText(usuario.getTelefone());
			textField_5.setText(usuario.getTelefoneSecundario());
			textField_7.setText(String.valueOf(usuario.getNumero()));
			JOptionPane.showMessageDialog(this, "usuario encontrado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "usuario não encontrado");
		}

	}

	public void deletar() {
		UsuarioController usuarioController = new UsuarioController();
		try {
			usuarioController.remover(textField.getText());
			JOptionPane.showMessageDialog(this, "usuario deletado");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}

	}
}
