package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.ProfOfertaController;
import model.Disciplina;
import model.OfertaDisciplina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class GUIProfOferta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JComboBox<String> comboBox;
	JComboBox<String> comboBox_1;
	private ProfOfertaController ofertaController = new ProfOfertaController();
	private JTextField textField_5;

	/**
	 * Create the frame.
	 */
	public GUIProfOferta() {
		setBounds(100, 100, 450, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOfertaDisciplina = new JLabel("Oferta Disciplina");
		lblOfertaDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblOfertaDisciplina.setBounds(81, 0, 275, 39);
		contentPane.add(lblOfertaDisciplina);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(22, 58, 217, 20);
		contentPane.add(comboBox);

		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscardisc();
			}
		});
		btnBuscar.setBounds(321, 57, 89, 23);
		contentPane.add(btnBuscar);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(22, 118, 258, 20);
		contentPane.add(comboBox_1);

		JButton btnEditar = new JButton("editar");
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editar();
			}
		});
		btnEditar.setBounds(290, 117, 89, 23);
		contentPane.add(btnEditar);

		JLabel lblDia = new JLabel("dia 1");
		lblDia.setBounds(22, 200, 46, 14);
		contentPane.add(lblDia);

		JLabel lblDia_1 = new JLabel("dia 2");
		lblDia_1.setBounds(22, 246, 46, 14);
		contentPane.add(lblDia_1);

		JLabel lblHora = new JLabel("hora 1");
		lblHora.setBounds(193, 200, 46, 14);
		contentPane.add(lblHora);

		JLabel lblHora_1 = new JLabel("hora 2");
		lblHora_1.setBounds(193, 246, 46, 14);
		contentPane.add(lblHora_1);

		JLabel lblPeriodo = new JLabel("periodo");
		lblPeriodo.setBounds(22, 295, 46, 14);
		contentPane.add(lblPeriodo);

		textField = new JTextField();
		textField.setBounds(63, 197, 109, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(63, 243, 109, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(63, 292, 109, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(249, 197, 109, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(249, 243, 109, 20);
		contentPane.add(textField_4);

		JButton btnAlocar = new JButton("alocar");
		btnAlocar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				alocar();
			}
		});
		btnAlocar.setBounds(218, 291, 89, 23);
		contentPane.add(btnAlocar);

		JButton btnEditar_1 = new JButton("editar");
		btnEditar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editaroferta();
			}
		});
		btnEditar_1.setBounds(321, 291, 89, 23);
		contentPane.add(btnEditar_1);

		JButton btnDeletar = new JButton("deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deletar();
			}
		});
		btnDeletar.setBounds(267, 345, 89, 23);
		contentPane.add(btnDeletar);

		textField_5 = new JTextField();
		textField_5.setBounds(66, 169, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblIf = new JLabel("id");
		lblIf.setBounds(25, 172, 31, 14);
		contentPane.add(lblIf);

		ArrayList<String> cpf = ofertaController.buscarprof();

		for (int i = 0; i < cpf.size(); i++) {
			comboBox.addItem(cpf.get(i));
		}

	}

	protected void editaroferta() {
		try {
			String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
			OfertaDisciplina ofertaDisciplina = new OfertaDisciplina(Long.parseLong(id[0]), Long.parseLong(id[2]), comboBox.getSelectedItem().toString(), "1", textField.getText(), textField_1.getText(), textField_3.getText(), textField_4.getText());
			ofertaController.update(ofertaDisciplina);

			JOptionPane.showMessageDialog(this, "update feito");
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, "erro ao dar update");
		}
	}

	protected void deletar() {
		String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
		try {
			ofertaController.delete(id[0], id[2]);
			JOptionPane.showMessageDialog(this, "deletado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}

	}

	protected void alocar() {
		try {
			OfertaDisciplina ofertaDisciplina = new OfertaDisciplina(Long.parseLong(textField_5.getText()), Long.parseLong(textField_2.getText()), comboBox.getSelectedItem().toString(), "1", textField.getText(), textField_1.getText(), textField_3.getText(), textField_4.getText());
			ofertaController.salvar(ofertaDisciplina);
			JOptionPane.showMessageDialog(this, "inserido");
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}

	}

	protected void editar() {
		String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
		OfertaDisciplina disciplina = ofertaController.oferta(id[0], id[2]);
		textField.setText(disciplina.getDia1());
		textField_1.setText(disciplina.getDia2());
		textField_2.setText(String.valueOf(disciplina.getId_periodo()));
		textField_3.setText(disciplina.getHora1());
		textField_4.setText(disciplina.getHora2());
	}

	protected void buscardisc() {
		ArrayList<OfertaDisciplina> disc = ofertaController.buscardisc(comboBox.getSelectedItem().toString());
		comboBox_1.removeAllItems();
		for (int i = 0; i < disc.size(); i++) {
			comboBox_1.addItem(ofertaController.disciplinas(disc.get(i).getId_disciplina()) + " - " + ofertaController.periodos(String.valueOf(disc.get(i).getId_periodo())));
		}

	}

}
