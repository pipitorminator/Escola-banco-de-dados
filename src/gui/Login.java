package gui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controllers.ADMController;
import controllers.AlunoController;
import controllers.ProfessorController;
import controllers.SecretariaController;
import model.ResponsavelFinanceiro;
import model.Usuario;
import repositorios.RepositorioAluno;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfUsuario;
	private JTextField tfSenha;
	private JRadioButton rdbtnAluno;
	private JRadioButton rdbtnFuncionario;
	private JComboBox<String> comboBoxFuncionarios;

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(5, 5, 424, 50);
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 35));
		contentPane.add(lblLogin);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 16));
		lblUsuario.setBounds(30, 88, 70, 14);
		contentPane.add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSenha.setBounds(30, 136, 70, 14);
		contentPane.add(lblSenha);

		tfUsuario = new JTextField();
		tfUsuario.setBounds(129, 87, 125, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);

		tfSenha = new JTextField();
		tfSenha.setBounds(129, 135, 125, 20);
		contentPane.add(tfSenha);
		tfSenha.setColumns(10);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(30, 201, 89, 23);
		contentPane.add(btnEntrar);

		this.rdbtnAluno = new JRadioButton("Aluno");
		rdbtnAluno.setSelected(true);
		rdbtnAluno.setBounds(303, 86, 109, 23);
		contentPane.add(rdbtnAluno);

		this.rdbtnFuncionario = new JRadioButton("Funcionario");
		rdbtnFuncionario.setBounds(303, 127, 109, 23);
		contentPane.add(rdbtnFuncionario);

		this.comboBoxFuncionarios = new JComboBox<String>();
		comboBoxFuncionarios.setBounds(303, 155, 89, 20);
		comboBoxFuncionarios.setEnabled(false);
		contentPane.add(comboBoxFuncionarios);
		comboBoxFuncionarios.addItem("ADM");
		comboBoxFuncionarios.addItem("Professor");
		comboBoxFuncionarios.addItem("Secretaria");

		rdbtnAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				comboBoxFuncionarios.setEnabled(false);

				if (rdbtnFuncionario.isSelected()) {
					rdbtnFuncionario.setSelected(false);
				}
				if (!rdbtnAluno.isSelected()) {
					rdbtnAluno.setSelected(true);
				}
			}
		});

		rdbtnFuncionario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				comboBoxFuncionarios.setEnabled(true);

				if (rdbtnAluno.isSelected()) {
					rdbtnAluno.setSelected(false);
				}
				if (!rdbtnFuncionario.isSelected()) {
					rdbtnFuncionario.setSelected(true);
				}
			}
		});

		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				entrar();

			}
		});

	}

	public void entrar() {
		if (rdbtnAluno.isSelected()) {
			RepositorioAluno repositorioAluno = new RepositorioAluno();
			AlunoController alunoController = new AlunoController(repositorioAluno);
			Usuario usuario = alunoController.loginAluno(tfUsuario.getText(), tfSenha.getText());

			if (usuario != null) {
				ResponsavelFinanceiro financeiro = alunoController.getResponsavel(tfUsuario.getText());
				String nomecurso = alunoController.getNomeCurso(tfUsuario.getText());
				ArrayList<String> nomeDisciplina = alunoController.getNomeDisciplina(tfUsuario.getText());
				GUIAluno guiAluno = new GUIAluno(usuario, financeiro, nomecurso, nomeDisciplina);
				guiAluno.setVisible(true);
			} else {
				JOptionPane.showMessageDialog(this, "Usuario ou Senha incorreta");
			}

		} else if (rdbtnFuncionario.isSelected()) {
			switch (comboBoxFuncionarios.getSelectedItem().toString()) {
			case "ADM":
				ADMController admController = new ADMController();
				Usuario usuario1 = admController.loginADM(tfUsuario.getText(), tfSenha.getText());
				if (usuario1 != null) {
					GUIADM guiadm = new GUIADM();
					guiadm.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "Usuario ou Senha incorreta");
				}
				break;

			case "Professor":
				ProfessorController professorController = new ProfessorController();
				Usuario usuario2 = professorController.loginProfessor(tfUsuario.getText(), tfSenha.getText());
				if (usuario2 != null) {
					GUIProfessor guiProfessor = new GUIProfessor(tfUsuario.getText());
					guiProfessor.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "Usuario ou Senha incorreta");
				}
				break;
			case "Secretaria":
				SecretariaController secretariaController = new SecretariaController();
				Usuario usuario3 = secretariaController.loginSecretaria(tfUsuario.getText(), tfSenha.getText());
				if (usuario3 != null) {
					GUISecretaria guiSecretaria = new GUISecretaria();
					guiSecretaria.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(this, "Usuario ou Senha incorreta");
				}

				break;
			}
		}
	}
}
