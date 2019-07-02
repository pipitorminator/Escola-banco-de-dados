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

import controllers.EnderecoController;
import model.Endereco;

public class GUIGerenciarUsuario extends JFrame {

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
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the frame.
	 */
	public GUIGerenciarUsuario() {
		setBounds(100, 100, 300, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblGerenciarUsuario = new JLabel("Gerenciar Usuario");
		lblGerenciarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblGerenciarUsuario.setBounds(10, 0, 268, 45);
		contentPane.add(lblGerenciarUsuario);

		JLabel lblCpfUsuario = new JLabel("CPF Usuario");
		lblCpfUsuario.setBounds(20, 68, 73, 14);
		contentPane.add(lblCpfUsuario);

		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(20, 109, 46, 14);
		contentPane.add(lblCep);

		JLabel lblRua = new JLabel("Rua");
		lblRua.setBounds(20, 186, 46, 14);
		contentPane.add(lblRua);

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(20, 148, 46, 14);
		contentPane.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(20, 225, 46, 14);
		contentPane.add(lblCidade);

		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(20, 260, 46, 14);
		contentPane.add(lblEstado);

		JLabel lblPais = new JLabel("Pais");
		lblPais.setBounds(20, 296, 46, 14);
		contentPane.add(lblPais);

		textField = new JTextField();
		textField.setBounds(103, 65, 171, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 106, 171, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 145, 171, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(103, 183, 171, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(103, 222, 171, 20);
		contentPane.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(103, 257, 171, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(103, 293, 171, 20);
		contentPane.add(textField_6);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscar();
			}
		});
		btnBuscar.setBounds(20, 336, 89, 23);
		contentPane.add(btnBuscar);
	}

	public void buscar() {
		EnderecoController controller = new EnderecoController();
		Endereco endereco = controller.buscar(textField.getText());
		textField_1.setText(endereco.getCep());
		textField_2.setText(endereco.getBairro());
		textField_3.setText(endereco.getRua());
		textField_4.setText(endereco.getCidade());
		textField_5.setText(endereco.getEstado());
		textField_6.setText(endereco.getPais());
	}
}
