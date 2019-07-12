package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.CursoController;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUICursoDisciplina extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	CursoController cursoController = new CursoController();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUICursoDisciplina frame = new GUICursoDisciplina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUICursoDisciplina() {

		setBounds(100, 100, 450, 398);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 72, 296, 20);
		contentPane.add(comboBox);

		JLabel lblCursos = new JLabel("Cursos");
		lblCursos.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblCursos.setBounds(145, 0, 170, 50);
		contentPane.add(lblCursos);

		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnBuscar.setBounds(335, 71, 89, 23);
		contentPane.add(btnBuscar);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(10, 142, 185, 20);
		contentPane.add(comboBox_1);

		JButton btnEditar = new JButton("editar");
		btnEditar.setBounds(335, 141, 89, 23);
		contentPane.add(btnEditar);

		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 207, 46, 14);
		contentPane.add(lblNome);

		JLabel lblEmenta = new JLabel("ementa");
		lblEmenta.setBounds(10, 243, 46, 14);
		contentPane.add(lblEmenta);

		JLabel lblNumcreditos = new JLabel("num_creditos");
		lblNumcreditos.setBounds(10, 281, 66, 14);
		contentPane.add(lblNumcreditos);

		JLabel lblCodigoArea = new JLabel("codigo area");
		lblCodigoArea.setBounds(218, 207, 66, 14);
		contentPane.add(lblCodigoArea);

		JLabel lblCodigoCurso = new JLabel("codigo curso");
		lblCodigoCurso.setBounds(218, 243, 66, 14);
		contentPane.add(lblCodigoCurso);

		textField = new JTextField();
		textField.setBounds(79, 204, 116, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(79, 240, 116, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(79, 278, 116, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(294, 204, 116, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(294, 240, 116, 20);
		contentPane.add(textField_4);

		JButton btnSalvar = new JButton("salvar");
		btnSalvar.setBounds(205, 288, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnDeletar = new JButton("deletar");
		btnDeletar.setBounds(321, 288, 89, 23);
		contentPane.add(btnDeletar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(266, 326, 89, 23);
		contentPane.add(btnUpdate);

		ArrayList<String> cursos = cursoController.todosCursos();
		for (int i = 0; cursos.size() > i; i++) {
			comboBox.addItem(cursos.get(i));
		}

	}

}
