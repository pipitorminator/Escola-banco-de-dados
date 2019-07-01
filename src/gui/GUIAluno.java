package gui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import model.ResponsavelFinanceiro;
import model.Usuario;

public class GUIAluno extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Usuario usuario;
	private ResponsavelFinanceiro financeiro;
	private String nomeCurso;
	private ArrayList<String> nomeDisciplina;

	/**
	 * Create the frame.
	 */
	public GUIAluno(Usuario usuario, ResponsavelFinanceiro financeiro, String nomeCurso, ArrayList<String> nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
		this.usuario = usuario;
		this.financeiro = financeiro;
		this.nomeCurso = nomeCurso;
		setBounds(100, 100, 464, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAluno = new JLabel("Aluno " + usuario.getNome());
		lblAluno.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAluno.setBounds(10, 0, 428, 39);
		contentPane.add(lblAluno);

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

		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setEditable(false);
		txtpnCpf.setText(this.usuario.getCpf());
		txtpnCpf.setBounds(92, 55, 130, 20);
		contentPane.add(txtpnCpf);

		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setEditable(false);
		txtpnNome.setText(this.usuario.getNome());
		txtpnNome.setBounds(92, 90, 130, 20);
		contentPane.add(txtpnNome);

		JTextPane txtpnSexo = new JTextPane();
		txtpnSexo.setEditable(false);
		if(this.usuario.getSexo().equals("M")) {
			txtpnSexo.setText("Masculino");
		}else {
			txtpnSexo.setText("Feminino");
		}
		txtpnSexo.setBounds(92, 125, 130, 20);
		contentPane.add(txtpnSexo);

		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setText(this.usuario.getEmail());
		txtpnEmail.setBounds(92, 160, 130, 20);
		contentPane.add(txtpnEmail);

		JTextPane txtpnTelefone = new JTextPane();
		txtpnTelefone.setEditable(false);
		txtpnTelefone.setText(this.usuario.getTelefone());
		txtpnTelefone.setBounds(92, 195, 130, 20);
		contentPane.add(txtpnTelefone);

		JTextPane txtpnTelefone_1 = new JTextPane();
		txtpnTelefone_1.setEditable(false);
		txtpnTelefone_1.setText(this.usuario.getTelefoneSecundario());
		txtpnTelefone_1.setBounds(92, 230, 130, 20);
		contentPane.add(txtpnTelefone_1);

		JTextPane txtpnCep = new JTextPane();
		txtpnCep.setEditable(false);
		txtpnCep.setText(this.usuario.getCep());
		txtpnCep.setBounds(92, 265, 130, 20);
		contentPane.add(txtpnCep);

		JTextPane txtpnNumero = new JTextPane();
		txtpnNumero.setEditable(false);
		txtpnNumero.setText(String.valueOf(this.usuario.getNumero()));
		txtpnNumero.setBounds(92, 300, 130, 20);
		contentPane.add(txtpnNumero);

		JLabel lblResponsavel = new JLabel("Responsavel");
		lblResponsavel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblResponsavel.setBounds(255, 50, 104, 24);
		contentPane.add(lblResponsavel);

		JLabel lblTelefone_2 = new JLabel("Telefone");
		lblTelefone_2.setBounds(265, 125, 60, 14);
		contentPane.add(lblTelefone_2);

		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setBounds(265, 152, 46, 14);
		contentPane.add(lblEmail_1);

		JLabel lblNome_1 = new JLabel("Nome");
		lblNome_1.setBounds(265, 95, 46, 14);
		contentPane.add(lblNome_1);

		JTextPane txtpnNome_1 = new JTextPane();
		txtpnNome_1.setEditable(false);
		txtpnNome_1.setText(this.financeiro.getNome());
		txtpnNome_1.setBounds(321, 90, 130, 20);
		contentPane.add(txtpnNome_1);

		JTextPane txtpnTelefoneres = new JTextPane();
		txtpnTelefoneres.setEditable(false);
		txtpnTelefoneres.setText(this.financeiro.getTelefone());
		txtpnTelefoneres.setBounds(321, 121, 130, 20);
		contentPane.add(txtpnTelefoneres);

		JTextPane txtpnEmailres = new JTextPane();
		txtpnEmailres.setEditable(false);
		txtpnEmailres.setText(this.financeiro.getEmail());
		txtpnEmailres.setBounds(321, 152, 130, 20);
		contentPane.add(txtpnEmailres);

		JLabel lblTurmas = new JLabel("Turma");
		lblTurmas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTurmas.setBounds(265, 200, 75, 20);
		contentPane.add(lblTurmas);

		JTextPane txtpnCurso = new JTextPane();
		txtpnCurso.setEditable(false);
		txtpnCurso.setText(this.nomeCurso);
		txtpnCurso.setBounds(265, 232, 173, 20);
		contentPane.add(txtpnCurso);

		JLabel lblDisciplinas = new JLabel("Disciplinas");
		lblDisciplinas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDisciplinas.setBounds(265, 270, 116, 24);
		contentPane.add(lblDisciplinas);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(265, 302, 161, 20);
		contentPane.add(comboBox);
		
		for(int i=0;  i< nomeDisciplina.size(); i++) {
			comboBox.addItem(this.nomeDisciplina.get(i));
		}
		
	}
}
