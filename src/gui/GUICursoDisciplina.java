package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.CursoController;
import model.Disciplina;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.regex.Pattern;

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
				buscarDisci();
			}
		});
		btnBuscar.setBounds(335, 71, 89, 23);
		contentPane.add(btnBuscar);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(10, 142, 185, 20);
		contentPane.add(comboBox_1);

		JButton btnEditar = new JButton("editar");
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				editardisc();
			}
		});
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
		lblCodigoArea.setBounds(208, 207, 86, 14);
		contentPane.add(lblCodigoArea);

		JLabel lblCodigoCurso = new JLabel("codigo curso");
		lblCodigoCurso.setBounds(208, 243, 86, 14);
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
		btnSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				salvar();
			}
		});
		btnSalvar.setBounds(205, 288, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnDeletar = new JButton("deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				delete();
			}
		});
		btnDeletar.setBounds(321, 288, 89, 23);
		contentPane.add(btnDeletar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				update();
			}
		});
		btnUpdate.setBounds(266, 326, 89, 23);
		contentPane.add(btnUpdate);

		ArrayList<String> cursos = cursoController.todosCursos();
		for (int i = 0; cursos.size() > i; i++) {
			comboBox.addItem(cursos.get(i));
		}

	}

	protected void update() {
		try {
			String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
			Disciplina disciplina = new Disciplina(Long.parseLong(id[0]), Long.parseLong(textField_3.getText()), 1L, Long.parseLong(textField_4.getText()), textField.getText(), textField_1.getText(), Integer.parseInt(textField_2.getText()));
			cursoController.update(disciplina);
			JOptionPane.showMessageDialog(this, "update feito");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro no update");
		}
		buscarDisci();
	}

	protected void salvar() {
		try {
			Disciplina disciplina = new Disciplina(1L, Long.parseLong(textField_3.getText()), 1L, Long.parseLong(textField_4.getText()), textField.getText(), textField_1.getText(), Integer.parseInt(textField_2.getText()));
			cursoController.salvar(disciplina);
			JOptionPane.showMessageDialog(this, "disciplina Inserida");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro ao Inserido");
		}
		buscarDisci();
	}

	protected void delete() {
		try {
			String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
			cursoController.delete(id[0]);
			JOptionPane.showMessageDialog(this, "deletado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}
		buscarDisci();

	}

	protected void editardisc() {
		try {
			String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
			Disciplina disciplina = cursoController.editardisc(id[0]);
			textField.setText(disciplina.getNome());
			textField_1.setText(disciplina.getEmenta());
			textField_2.setText(String.valueOf(disciplina.getNum_creditos()));
			textField_3.setText(String.valueOf(disciplina.getCodigo_area_conhecimento()));
			textField_4.setText(String.valueOf(disciplina.getCodigo_curso()));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro inesperado");
		}

	}

	protected void buscarDisci() {
		try {
			String[] curso = comboBox.getSelectedItem().toString().split(Pattern.quote(" - "));
			ArrayList<String> disci = cursoController.disciplinas(curso[0]);
			comboBox_1.removeAllItems();
			for (int i = 0; i < disci.size(); i++) {
				comboBox_1.addItem(disci.get(i));

			}
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, "erro inesperado");
		}

	}

}
