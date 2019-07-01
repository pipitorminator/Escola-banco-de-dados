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

public class GUIProfessor extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GUIProfessor() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProfessor = new JLabel("Professor");
		lblProfessor.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblProfessor.setBounds(133, 11, 169, 39);
		contentPane.add(lblProfessor);
		
		JButton btnAvaliao = new JButton("Avalia\u00E7\u00E3o");
		btnAvaliao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				GUIAvaliacaoAluno guiAvaliacaoAluno = new GUIAvaliacaoAluno();
				guiAvaliacaoAluno.setVisible(true);
				
			}
		});
		btnAvaliao.setBounds(46, 107, 111, 23);
		contentPane.add(btnAvaliao);
		
		JButton btnOfertaDisciplina = new JButton("Oferta Disciplina");
		btnOfertaDisciplina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIOfertaDisciplina guiOfertaDisciplina = new GUIOfertaDisciplina();
				guiOfertaDisciplina.setVisible(true);
			}
		});
		btnOfertaDisciplina.setBounds(274, 107, 111, 23);
		contentPane.add(btnOfertaDisciplina);
	}

}

