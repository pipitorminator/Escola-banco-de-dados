package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.MatriculaBoletoController;
import model.Boleto;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIMatriculaBoleto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JComboBox<String> comboBox;
	JComboBox<String> comboBox_1;
	private MatriculaBoletoController controller = new MatriculaBoletoController();

	/**
	 * Create the frame.
	 */
	public GUIMatriculaBoleto() {
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBoleto = new JLabel("Boleto");
		lblBoleto.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblBoleto.setBounds(151, 0, 173, 47);
		contentPane.add(lblBoleto);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(27, 77, 264, 20);
		contentPane.add(comboBox);

		JButton btnBuscar = new JButton("buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscarBoleto();
			}
		});
		btnBuscar.setBounds(317, 76, 89, 23);
		contentPane.add(btnBuscar);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(27, 128, 264, 20);
		contentPane.add(comboBox_1);

		JButton btnEditar = new JButton("editar");
		btnEditar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editar();
			}
		});
		btnEditar.setBounds(335, 127, 89, 23);
		contentPane.add(btnEditar);

		JLabel lblCarteira = new JLabel("carteira");
		lblCarteira.setBounds(26, 194, 46, 14);
		contentPane.add(lblCarteira);

		JLabel lblDataVenciment = new JLabel("data vencimento");
		lblDataVenciment.setBounds(27, 269, 95, 14);
		contentPane.add(lblDataVenciment);

		JLabel lblNumero = new JLabel("numero");
		lblNumero.setBounds(245, 194, 46, 14);
		contentPane.add(lblNumero);

		JLabel lblValor = new JLabel("valor");
		lblValor.setBounds(245, 219, 46, 14);
		contentPane.add(lblValor);

		JLabel lblDataEmisso = new JLabel("data emiss\u00E3o");
		lblDataEmisso.setBounds(27, 244, 81, 14);
		contentPane.add(lblDataEmisso);

		JLabel lblCodigoBanco = new JLabel("codigo banco");
		lblCodigoBanco.setBounds(27, 219, 81, 14);
		contentPane.add(lblCodigoBanco);

		textField = new JTextField();
		textField.setBounds(125, 191, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 216, 86, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 241, 86, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(125, 266, 86, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(301, 191, 86, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(301, 216, 86, 20);
		contentPane.add(textField_5);

		JButton btnEditar_1 = new JButton("editar");
		btnEditar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editarBoleto();
			}
		});
		btnEditar_1.setBounds(245, 265, 89, 23);
		contentPane.add(btnEditar_1);

		JButton btnDeletar = new JButton("deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				deletar();
			}
		});
		btnDeletar.setBounds(335, 265, 89, 23);
		contentPane.add(btnDeletar);

		JButton btnInserir = new JButton("inserir");
		btnInserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inserir();
			}
		});
		btnInserir.setBounds(298, 299, 89, 23);
		contentPane.add(btnInserir);

		ArrayList<String> cpfs = controller.alunos();

		for (int i = 0; i < cpfs.size(); i++) {
			comboBox.addItem(cpfs.get(i));
		}
	}

	protected void editarBoleto() {
		String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
		String[] id2 = comboBox.getSelectedItem().toString().split(Pattern.quote(" - "));
		Boleto boleto = new Boleto(Long.parseLong(id[0]), textField_1.getText(), Long.parseLong(id2[0]), textField.getText(), textField_3.getText(), "1", Integer.parseInt(textField_4.getText()), Double.parseDouble(textField_5.getText()), textField_2.getText());
		try {
			controller.update(boleto);
			JOptionPane.showMessageDialog(this, "update feito");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro no update");
		}

	}

	protected void inserir() {
		String[] id2 = comboBox.getSelectedItem().toString().split(Pattern.quote(" - "));
		Boleto boleto = new Boleto(1L, textField_1.getText(), Long.parseLong(id2[0]), textField.getText(), textField_3.getText(), "1", Integer.parseInt(textField_4.getText()), Double.parseDouble(textField_5.getText()), textField_2.getText());
		try {
			controller.inserir(boleto);

			JOptionPane.showMessageDialog(this, "inserido");
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}
	}

	protected void deletar() {
		String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
		try {
			controller.deletar(id[0]);

			JOptionPane.showMessageDialog(this, "deletado");
		} catch (Exception e) {

			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}
	}

	protected void editar() {
		String[] id = comboBox_1.getSelectedItem().toString().split(Pattern.quote(" - "));
		Boleto boleto = controller.buscar(id[0]);
		textField.setText(boleto.getCarteira());
		textField_1.setText(boleto.getCodigo_banco());
		textField_2.setText(boleto.getData_emisao());
		textField_3.setText(boleto.getData_venc());
		textField_4.setText(String.valueOf(boleto.getNumero()));
		textField_5.setText(String.valueOf(boleto.getValor()));

	}

	protected void buscarBoleto() {
		String[] id = comboBox.getSelectedItem().toString().split(Pattern.quote(" - "));
		ArrayList<String> boletos = controller.boletos(id[0]);

		comboBox_1.removeAllItems();

		for (int i = 0; i < boletos.size(); i++) {
			comboBox_1.addItem(boletos.get(i));
		}

	}

}
