package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AlunoController;
import controllers.DisciplinaController;
import controllers.OfertaDisciplinaController;
import model.Aluno;
import model.AlunoOfertaDisciplina;
import model.Disciplina;
import model.PeriodoLetivo;
import repositorios.RepositorioAluno;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JComboBox;

public class GUIOfertaDisciplina extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox<String> comboBoxIdDisci;
	private JComboBox<String> comboBoxIdPeriodo;
	private JComboBox<String> comboBoxCpf;

	/**
	 * Create the frame.
	 */
	public GUIOfertaDisciplina() {
		RepositorioAluno repositorioAluno = new RepositorioAluno();
		AlunoController alunoController = new AlunoController(repositorioAluno);
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
		btnAplicar.setBounds(231, 206, 89, 23);
		contentPane.add(btnAplicar);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				delete();
			}
		});
		btnDeletar.setBounds(335, 206, 89, 23);
		contentPane.add(btnDeletar);

		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscar();
			}
		});
		btnBuscar.setBounds(231, 167, 89, 23);
		contentPane.add(btnBuscar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				update();
			}
		});
		btnUpdate.setBounds(335, 167, 89, 23);
		contentPane.add(btnUpdate);

		JLabel lblMedia = new JLabel("Media");
		lblMedia.setBounds(244, 90, 46, 14);
		contentPane.add(lblMedia);

		textField_4 = new JTextField();
		textField_4.setBounds(312, 87, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		comboBoxIdDisci = new JComboBox<String>();
		comboBoxIdDisci.setBounds(104, 87, 103, 20);
		contentPane.add(comboBoxIdDisci);

		comboBoxIdPeriodo = new JComboBox<String>();
		comboBoxIdPeriodo.setBounds(104, 128, 103, 20);
		contentPane.add(comboBoxIdPeriodo);

		comboBoxCpf = new JComboBox<String>();
		comboBoxCpf.setBounds(104, 168, 103, 20);
		contentPane.add(comboBoxCpf);

		ArrayList<String> cpfs = alunoController.buscarTodosAlunos();
		for (int i = 0; i < cpfs.size(); i++) {
			comboBoxCpf.addItem(cpfs.get(i));
		}
		DisciplinaController disciplinaController = new DisciplinaController();
		ArrayList<String> disciplinas = disciplinaController.buscarTodasDisciplinas();
		for (int i = 0; i < disciplinas.size(); i++) {
			comboBoxIdDisci.addItem(disciplinas.get(i));
		}

		ArrayList<String> periodos = disciplinaController.buscarPeriodos();
		for (int i = 0; i < periodos.size(); i++) {
			comboBoxIdPeriodo.addItem(periodos.get(i));
		}

	}

	public void alocarAluno() {
		try {
			String[] idDis = comboBoxIdDisci.getSelectedItem().toString().split(Pattern.quote(" - "));
			String[] idper = comboBoxIdPeriodo.getSelectedItem().toString().split(Pattern.quote(" - "));
			OfertaDisciplinaController controller = new OfertaDisciplinaController();
			AlunoOfertaDisciplina alunoOfertaDisciplina = new AlunoOfertaDisciplina(Long.parseLong(idDis[0]), Long.parseLong(idper[0]), comboBoxCpf.getSelectedItem().toString(), textField_3.getText(), Double.parseDouble(textField_4.getText()));
			controller.inserir(alunoOfertaDisciplina);
			JOptionPane.showMessageDialog(this, "Inserido com sucesso;");
		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}
	}

	public void delete() {
		try {
			String[] idDis = comboBoxIdDisci.getSelectedItem().toString().split(Pattern.quote(" - "));
			String[] idper = comboBoxIdPeriodo.getSelectedItem().toString().split(Pattern.quote(" - "));
			OfertaDisciplinaController controller = new OfertaDisciplinaController();
			controller.delete(idDis[0], idper[0], comboBoxCpf.getSelectedItem().toString());
			JOptionPane.showMessageDialog(this, "deletado");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}

	}

	public void buscar() {
		try {
			String[] idDis = comboBoxIdDisci.getSelectedItem().toString().split(Pattern.quote(" - "));
			String[] idper = comboBoxIdPeriodo.getSelectedItem().toString().split(Pattern.quote(" - "));
			OfertaDisciplinaController controller = new OfertaDisciplinaController();
			AlunoOfertaDisciplina alunoOfertaDisciplina = controller.buscar(idDis[0], idper[0], comboBoxCpf.getSelectedItem().toString());
			textField_3.setText(alunoOfertaDisciplina.getData_matricula());
			textField_4.setText(String.valueOf(alunoOfertaDisciplina.getMedia_final()));
			JOptionPane.showMessageDialog(this, "encontrado");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "não encontrado");
		}
	}

	public void update() {
		String[] idDis = comboBoxIdDisci.getSelectedItem().toString().split(Pattern.quote(" - "));
		String[] idper = comboBoxIdPeriodo.getSelectedItem().toString().split(Pattern.quote(" - "));
		OfertaDisciplinaController controller = new OfertaDisciplinaController();
		try {
			AlunoOfertaDisciplina alunoOfertaDisciplina = new AlunoOfertaDisciplina(Long.parseLong(idDis[0]), Long.parseLong(idper[0]), comboBoxCpf.getSelectedItem().toString(), textField_3.getText(), Double.parseDouble(textField_4.getText()));
			controller.update(alunoOfertaDisciplina);
			JOptionPane.showMessageDialog(this, "sucesso no update");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "erro ao dar update");
		}

	}
}
