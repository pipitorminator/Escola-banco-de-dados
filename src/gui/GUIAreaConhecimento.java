package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.AreaDeConhecimentoController;
import model.AreaDeConhecimento;

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

public class GUIAreaConhecimento extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox<String> comboBox;

	/**
	 * Create the frame.
	 */
	public GUIAreaConhecimento() {
		setBounds(100, 100, 427, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAreaConhecimento = new JLabel("Area conhecimento");
		lblAreaConhecimento.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAreaConhecimento.setBounds(78, 0, 295, 53);
		contentPane.add(lblAreaConhecimento);

		JLabel lblCodigo = new JLabel("codigo");
		lblCodigo.setBounds(36, 100, 46, 14);
		contentPane.add(lblCodigo);

		JLabel lblDescri = new JLabel("Descri\u00E7\u00E3o");
		lblDescri.setBounds(36, 139, 46, 14);
		contentPane.add(lblDescri);

		JLabel lblCodigo_1 = new JLabel("codigo assunto");
		lblCodigo_1.setBounds(36, 178, 84, 14);
		contentPane.add(lblCodigo_1);

		textField = new JTextField();
		textField.setBounds(130, 97, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(130, 136, 149, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cadastrar();
			}
		});
		btnCadastrar.setBounds(10, 228, 89, 23);
		contentPane.add(btnCadastrar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				update();
			}
		});
		btnUpdate.setBounds(109, 228, 89, 23);
		contentPane.add(btnUpdate);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deletar();
			}
		});
		btnDeletar.setBounds(208, 228, 89, 23);
		contentPane.add(btnDeletar);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(130, 175, 149, 20);
		contentPane.add(comboBox);
		AreaDeConhecimentoController areaDeConhecimentoController = new AreaDeConhecimentoController();
		ArrayList<String> assunto = areaDeConhecimentoController.buscarAll();
		for (int i = 0; i < assunto.size(); i++) {
			comboBox.addItem(assunto.get(i));
		}

	}

	public void update() {
		String[] id = comboBox.getSelectedItem().toString().split(Pattern.quote(" - "));
		AreaDeConhecimento areaDeConhecimento = new AreaDeConhecimento(Long.parseLong(textField.getText()), Long.parseLong(id[0]), textField_1.getText());
		AreaDeConhecimentoController areaDeConhecimentoController = new AreaDeConhecimentoController();
		try {
			areaDeConhecimentoController.update(areaDeConhecimento);
			JOptionPane.showMessageDialog(this, "update feito");
		} catch (Exception e) {
			// TODO: handle exception

			JOptionPane.showMessageDialog(this, "erro no update");
		}
	}

	public void deletar() {
		try {
			AreaDeConhecimentoController areaDeConhecimentoController = new AreaDeConhecimentoController();
			areaDeConhecimentoController.deletar(textField.getText());
			JOptionPane.showMessageDialog(this, "deletado");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}
	}

	public void cadastrar() {
		String[] id = comboBox.getSelectedItem().toString().split(Pattern.quote(" - "));
		AreaDeConhecimento areaDeConhecimento = new AreaDeConhecimento(Long.parseLong(textField.getText()), Long.parseLong(id[0]), textField_1.getText());
		AreaDeConhecimentoController areaDeConhecimentoController = new AreaDeConhecimentoController();
		try {
			areaDeConhecimentoController.inserir(areaDeConhecimento);
			JOptionPane.showMessageDialog(this, "inserido");
		} catch (Exception e) {
			// TODO: handle exception

			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}
	}

}
