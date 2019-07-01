package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.BoletoController;
import model.Boleto;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIBoleto extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldCB;
	private JTextField textFieldCM;
	private JTextField textFieldV;
	private JTextField textFieldDE;
	private JTextField textFieldDV;
	private JTextField textFieldC;
	private JTextField textFieldN;

	/**
	 * Create the frame.
	 */
	public GUIBoleto() {
		setBounds(100, 100, 337, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCodigoBanco = new JLabel("codigo banco");
		lblCodigoBanco.setBounds(47, 75, 72, 14);
		contentPane.add(lblCodigoBanco);

		JLabel lblCodigoMatricula = new JLabel("codigo matricula");
		lblCodigoMatricula.setBounds(47, 110, 90, 14);
		contentPane.add(lblCodigoMatricula);

		JLabel lblDataEmisso = new JLabel("Data emiss\u00E3o");
		lblDataEmisso.setBounds(47, 198, 95, 14);
		contentPane.add(lblDataEmisso);

		JLabel lblValor = new JLabel("valor");
		lblValor.setBounds(47, 152, 46, 14);
		contentPane.add(lblValor);

		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(47, 325, 46, 14);
		contentPane.add(lblNumero);

		JLabel lblDataVencimento = new JLabel("Data vencimento");
		lblDataVencimento.setBounds(42, 247, 95, 14);
		contentPane.add(lblDataVencimento);

		JLabel lblCarteira = new JLabel("Carteira");
		lblCarteira.setBounds(47, 290, 55, 14);
		contentPane.add(lblCarteira);

		JLabel lblBoleto = new JLabel("Boleto");
		lblBoleto.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblBoleto.setBounds(47, 0, 185, 39);
		contentPane.add(lblBoleto);

		textFieldCB = new JTextField();
		textFieldCB.setBounds(146, 72, 165, 20);
		contentPane.add(textFieldCB);
		textFieldCB.setColumns(10);

		textFieldCM = new JTextField();
		textFieldCM.setColumns(10);
		textFieldCM.setBounds(147, 107, 165, 20);
		contentPane.add(textFieldCM);

		textFieldV = new JTextField();
		textFieldV.setColumns(10);
		textFieldV.setBounds(146, 149, 165, 20);
		contentPane.add(textFieldV);

		textFieldDE = new JTextField();
		textFieldDE.setColumns(10);
		textFieldDE.setBounds(146, 195, 165, 20);
		contentPane.add(textFieldDE);

		textFieldDV = new JTextField();
		textFieldDV.setColumns(10);
		textFieldDV.setBounds(146, 241, 165, 20);
		contentPane.add(textFieldDV);

		textFieldC = new JTextField();
		textFieldC.setColumns(10);
		textFieldC.setBounds(146, 287, 165, 20);
		contentPane.add(textFieldC);

		textFieldN = new JTextField();
		textFieldN.setColumns(10);
		textFieldN.setBounds(146, 322, 165, 20);
		contentPane.add(textFieldN);

		JButton btnInserir = new JButton("inserir");
		btnInserir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inserirBoleto();
			}
		});
		btnInserir.setBounds(30, 356, 89, 23);
		contentPane.add(btnInserir);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscarBoleto();
			}
		});
		btnBuscar.setBounds(205, 356, 89, 23);
		contentPane.add(btnBuscar);
	}

	public void inserirBoleto() {
		Boleto boleto = new Boleto(1L, textFieldCB.getText(), Long.parseLong(textFieldCM.getText()), textFieldC.getText(), textFieldDV.getText(), "0", Integer.parseInt(textFieldN.getText()), Double.parseDouble(textFieldV.getText()), textFieldDE.getText());
		BoletoController boletoController = new BoletoController();
		boletoController.inserir(boleto);

	}

	public void buscarBoleto() {
		BoletoController boletoController = new BoletoController();
		Boleto boleto = boletoController.buscar(textFieldCM.getText());
		textFieldC.setText(boleto.getCarteira());
		textFieldCB.setText(boleto.getCodigo_banco());
		textFieldCM.setText(String.valueOf(boleto.getCodigo_matricula()));
		textFieldDE.setText(boleto.getData_emisao());
		textFieldDV.setText(boleto.getData_venc());
		textFieldN.setText(String.valueOf(boleto.getNumero()));
		textFieldV.setText(String.valueOf(boleto.getValor()));

	}

}
