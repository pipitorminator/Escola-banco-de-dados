package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AlmoxaridadoController;
import model.Almoxarifado;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;

public class GUIAlmoxarifade extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox<String> comboBox;

	/**
	 * Create the frame.
	 */
	public GUIAlmoxarifade() {
		setBounds(100, 100, 269, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlmoxarifado = new JLabel("Almoxarifado");
		lblAlmoxarifado.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAlmoxarifado.setBounds(10, 11, 205, 50);
		contentPane.add(lblAlmoxarifado);

		JLabel lblId = new JLabel("id");
		lblId.setBounds(20, 95, 46, 14);
		contentPane.add(lblId);

		JLabel lblLocalAlmoxarifado = new JLabel("local almoxarifado");
		lblLocalAlmoxarifado.setBounds(20, 131, 101, 14);
		contentPane.add(lblLocalAlmoxarifado);

		JLabel lblNumerodeitens = new JLabel("numero_de_itens");
		lblNumerodeitens.setBounds(20, 163, 101, 14);
		contentPane.add(lblNumerodeitens);

		JLabel lblDescricao = new JLabel("descricao");
		lblDescricao.setBounds(20, 199, 81, 14);
		contentPane.add(lblDescricao);

		JLabel lblTipo = new JLabel("tipo");
		lblTipo.setBounds(20, 237, 46, 14);
		contentPane.add(lblTipo);

		textField = new JTextField();
		textField.setBounds(129, 92, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(131, 128, 114, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(129, 160, 114, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(129, 196, 114, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(129, 234, 114, 20);
		contentPane.add(textField_4);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscar();
			}
		});
		btnBuscar.setBounds(12, 288, 89, 23);
		contentPane.add(btnBuscar);

		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(20, 72, 46, 14);
		contentPane.add(lblCpf);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cadastrar();
			}
		});
		btnInserir.setBounds(126, 288, 89, 23);
		contentPane.add(btnInserir);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				delete();
			}
		});
		btnDeletar.setBounds(12, 343, 89, 23);
		contentPane.add(btnDeletar);

		JButton btnUpdate = new JButton("update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				update();
			}
		});
		btnUpdate.setBounds(129, 343, 89, 23);
		contentPane.add(btnUpdate);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(129, 61, 114, 20);
		contentPane.add(comboBox);
		AlmoxaridadoController almoxaridadoController = new AlmoxaridadoController();
		ArrayList<String> cpfs = almoxaridadoController.buscarCPF();
		for (int i = 0; i < cpfs.size(); i++) {
			comboBox.addItem(cpfs.get(i));
		}
	}

	public void buscar() {
		try {
			AlmoxaridadoController almoxaridadoController = new AlmoxaridadoController();
			Almoxarifado almoxarifado = almoxaridadoController.buscar(comboBox.getSelectedItem().toString());

			textField.setText(String.valueOf(almoxarifado.getId()));
			textField_1.setText(almoxarifado.getLocal());
			textField_2.setText(String.valueOf(almoxarifado.getNumero_de_itens()));
			textField_3.setText(almoxarifado.getDescricao());
			textField_4.setText(almoxarifado.getTipo());
			JOptionPane.showMessageDialog(this, "buscado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro no buscar");
		}

	}

	public void update() {
		AlmoxaridadoController almoxaridadoController = new AlmoxaridadoController();
		Almoxarifado almoxarifado = new Almoxarifado(Integer.parseInt(textField.getText()), comboBox.getSelectedItem().toString(), textField_1.getText(), Integer.parseInt(textField_2.getText()), textField_3.getText(), textField_4.getText());
		try {
			almoxaridadoController.update(almoxarifado);
			JOptionPane.showMessageDialog(this, "update feito");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro no update");
		}
	}

	public void delete() {
		AlmoxaridadoController almoxaridadoController = new AlmoxaridadoController();
		try {
			almoxaridadoController.delete(comboBox.getSelectedItem().toString());
			JOptionPane.showMessageDialog(this, "deletado");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro no delete");
		}

	}

	public void cadastrar() {
		AlmoxaridadoController almoxaridadoController = new AlmoxaridadoController();
		Almoxarifado almoxarifado = new Almoxarifado(Integer.parseInt(textField.getText()), comboBox.getSelectedItem().toString(), textField_1.getText(), Integer.parseInt(textField_2.getText()), textField_3.getText(), textField_4.getText());
		try {
			almoxaridadoController.cadastrar(almoxarifado);
			JOptionPane.showMessageDialog(this, "inserido");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro no inserir");
		}
	}
}
