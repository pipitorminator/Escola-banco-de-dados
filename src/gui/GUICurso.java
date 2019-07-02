package gui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controllers.DisciplinaController;
import model.Disciplina;

public class GUICurso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JComboBox<String> comboBox;

	/**
	 * Create the frame.
	 */
	public GUICurso() {
		setBounds(100, 100, 239, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblCurso.setBounds(29, 11, 101, 39);
		contentPane.add(lblCurso);

		JLabel lblIdCurso = new JLabel("ID Curso");
		lblIdCurso.setBounds(10, 69, 46, 14);
		contentPane.add(lblIdCurso);

		textField = new JTextField();
		textField.setBounds(86, 66, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(31, 119, 157, 20);
		contentPane.add(comboBox);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscar();
			}
		});
		btnBuscar.setBounds(29, 228, 89, 23);
		contentPane.add(btnBuscar);
	}

	public void buscar() {
		comboBox.removeAllItems();
		DisciplinaController disciplinaController = new DisciplinaController();
		ArrayList<Disciplina> disciplinas = disciplinaController.buscarDisciplina(textField.getText());
		for (int i = 0; disciplinas.size() > i; i++) {
			comboBox.addItem(disciplinas.get(i).getNome());
		}
	}
}
