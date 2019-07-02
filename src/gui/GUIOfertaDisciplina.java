package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.OfertaDisciplinaController;
import model.AlunoOfertaDisciplina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIOfertaDisciplina extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the frame.
	 */
	public GUIOfertaDisciplina() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOfertaDisciplina = new JLabel("Oferta Disciplina");
		lblOfertaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblOfertaDisciplina.setBounds(87, 11, 254, 39);
		contentPane.add(lblOfertaDisciplina);

		JLabel lblIdDisciplina = new JLabel("Id Disciplina");
		lblIdDisciplina.setBounds(25, 90, 65, 14);
		contentPane.add(lblIdDisciplina);

		JLabel lblIdPeriodo = new JLabel("Id Periodo");
		lblIdPeriodo.setBounds(25, 131, 65, 14);
		contentPane.add(lblIdPeriodo);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(25, 171, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblDataMatricula = new JLabel("Data Matricula");
		lblDataMatricula.setBounds(25, 210, 77, 14);
		contentPane.add(lblDataMatricula);

		textField = new JTextField();
		textField.setBounds(121, 87, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(121, 128, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(121, 168, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(121, 207, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JButton btnAplicar = new JButton("alocar");
		btnAplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				alocarAluno();
			}
		});
		btnAplicar.setBounds(291, 206, 89, 23);
		contentPane.add(btnAplicar);
	}

	public void alocarAluno() {
		try {
		OfertaDisciplinaController controller = new OfertaDisciplinaController();
		AlunoOfertaDisciplina alunoOfertaDisciplina = new AlunoOfertaDisciplina(Long.parseLong(textField.getText()), Long.parseLong(textField_1.getText()), textField_2.getText(), textField_3.getText(), 0);
		controller.inserir(alunoOfertaDisciplina);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}
	}
}
