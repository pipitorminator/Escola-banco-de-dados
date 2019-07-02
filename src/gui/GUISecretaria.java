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

public class GUISecretaria extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GUISecretaria() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSecretario = new JLabel("Secretario");
		lblSecretario.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblSecretario.setBounds(133, 11, 158, 39);
		contentPane.add(lblSecretario);

		JButton btnProduto = new JButton("Produto");
		btnProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				painelProduto();
			}
		});
		btnProduto.setBounds(52, 110, 102, 23);
		contentPane.add(btnProduto);

		JButton btnAlmoxarifado = new JButton("Almoxarifado");
		btnAlmoxarifado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GUIAlmoxarifade guiAlmoxarifade = new GUIAlmoxarifade();
				guiAlmoxarifade.setVisible(true);
			}
		});
		btnAlmoxarifado.setBounds(265, 110, 102, 23);
		contentPane.add(btnAlmoxarifado);
	}

	public void painelProduto() {
		GUIProduto produto = new GUIProduto();
		produto.setVisible(true);

	}

}
