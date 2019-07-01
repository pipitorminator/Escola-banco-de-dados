package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIADM extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */

	public GUIADM() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAdministrador.setBounds(104, 11, 221, 39);
		contentPane.add(lblAdministrador);

		JButton btnAluno = new JButton("Aluno");
		btnAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIGerenciamentoAluno guiGerenciamentoAluno = new GUIGerenciamentoAluno();
				guiGerenciamentoAluno.setVisible(true);
			}
		});
		btnAluno.setBounds(46, 101, 89, 23);
		contentPane.add(btnAluno);

		JButton btnBoleto = new JButton("Boleto");
		btnBoleto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIBoleto guiBoleto = new GUIBoleto();
				guiBoleto.setVisible(true);
			}
		});
		btnBoleto.setBounds(236, 101, 89, 23);
		contentPane.add(btnBoleto);
	}

}
