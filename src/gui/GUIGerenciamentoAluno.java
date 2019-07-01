package gui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import controllers.AlunoController;
import controllers.UsuarioController;
import model.Aluno;
import model.Usuario;
import repositorios.RepositorioAluno;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the frame.
	 */
	public GUIGerenciamentoAluno() {
		setBounds(100, 100, 355, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGerenciamentoAluno = new JLabel("Gerenciamento Aluno");
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
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inserirAluno();
			}
		});
		btnInserir.setBounds(83, 352, 89, 23);
		contentPane.add(btnInserir);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscarAluno();
			}
		});
		btnBuscar.setBounds(214, 352, 89, 23);
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

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(83, 267, 220, 20);
		contentPane.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(83, 302, 220, 20);
		contentPane.add(textField_7);
	}

	public void inserirAluno() {
		RepositorioAluno repositorioAluno = new RepositorioAluno();
		AlunoController alunoController = new AlunoController(repositorioAluno);
		UsuarioController usuarioController = new UsuarioController();
		Aluno aluno = new Aluno(textField.getText());
		Usuario usuario = new Usuario(textField.getText(), textField_6.getText(), textField_1.getText(), textField_2.getText(), textField_4.getText(), textField_5.getText(), Integer.parseInt(textField_7.getText()), textField_3.getText(), textField_1.getText(), "1");
		usuarioController.inserir(usuario);
		try {
			alunoController.cadastrar(aluno);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Aluno ja cadastrado");
		}

	}

	public void buscarAluno() {
		UsuarioController usuarioController = new UsuarioController();
		Usuario usuario = usuarioController.buscar(textField.getText());
		textField.setText(usuario.getCpf());
		textField_1.setText(usuario.getNome());
		textField_2.setText(usuario.getSexo());
		textField_3.setText(usuario.getEmail());
		textField_4.setText(usuario.getTelefone());
		textField_5.setText(usuario.getTelefoneSecundario());
		textField_6.setText(usuario.getCep());
		textField_7.setText(String.valueOf(usuario.getNumero()));

	}
}
