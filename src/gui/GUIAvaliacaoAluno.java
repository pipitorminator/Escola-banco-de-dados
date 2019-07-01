package gui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controllers.AvaliacaoController;
import model.AlunoAvaliacaoOfertaDisciplina;

public class GUIAvaliacaoAluno extends JFrame {

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

	/**
	 * Create the frame.
	 */
	public GUIAvaliacaoAluno() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAvaliao = new JLabel("Avalia\u00E7\u00E3o");
		lblAvaliao.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAvaliao.setBounds(146, 11, 153, 39);
		contentPane.add(lblAvaliao);

		JLabel lblIdDisciplina = new JLabel("Id Disciplina");
		lblIdDisciplina.setBounds(33, 92, 70, 14);
		contentPane.add(lblIdDisciplina);

		JLabel lblIdPeriodo = new JLabel("Id Periodo");
		lblIdPeriodo.setBounds(33, 129, 70, 14);
		contentPane.add(lblIdPeriodo);

		JLabel lblCpfAluno = new JLabel("CPF aluno");
		lblCpfAluno.setBounds(33, 169, 70, 14);
		contentPane.add(lblCpfAluno);

		JLabel lblNota = new JLabel("Nota");
		lblNota.setBounds(33, 208, 46, 14);
		contentPane.add(lblNota);

		JLabel lblIdAvaliao = new JLabel("Id Avalia\u00E7\u00E3o");
		lblIdAvaliao.setBounds(237, 92, 70, 14);
		contentPane.add(lblIdAvaliao);

		textField = new JTextField();
		textField.setBounds(108, 89, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(108, 126, 86, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(108, 166, 86, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(108, 205, 86, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(317, 89, 86, 20);
		contentPane.add(textField_4);

		JButton btnAtribuirNota = new JButton("Atribuir nota");
		btnAtribuirNota.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				atribuirNota();
			}
		});
		btnAtribuirNota.setBounds(289, 204, 123, 23);
		contentPane.add(btnAtribuirNota);
	}

	public void atribuirNota() {
		AvaliacaoController avaliacaoController = new AvaliacaoController();
		AlunoAvaliacaoOfertaDisciplina ofertaDisciplina = new AlunoAvaliacaoOfertaDisciplina(Long.parseLong(textField.getText()), textField_2.getText(), Long.parseLong(textField_1.getText()), Long.parseLong(textField_4.getText()), Double.parseDouble(textField_3.getText()));
		avaliacaoController.inserir(ofertaDisciplina);

	}

}
