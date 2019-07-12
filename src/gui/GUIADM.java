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
		setBounds(100, 100, 450, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAdministrador = new JLabel("Administrador");
		lblAdministrador.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAdministrador.setBounds(104, 11, 221, 39);
		contentPane.add(lblAdministrador);

		JButton btnAluno = new JButton("Usuario");
		btnAluno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIGerenciamentoAluno guiGerenciamentoAluno = new GUIGerenciamentoAluno();
				guiGerenciamentoAluno.setVisible(true);
			}
		});
		btnAluno.setBounds(46, 101, 117, 23);
		contentPane.add(btnAluno);

		JButton btnBoleto = new JButton("Boleto");
		btnBoleto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIBoleto guiBoleto = new GUIBoleto();
				guiBoleto.setVisible(true);
			}
		});
		btnBoleto.setBounds(236, 101, 108, 23);
		contentPane.add(btnBoleto);

		JButton btnGerenciarUsuario = new JButton("gerenciar endereco");
		btnGerenciarUsuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				GUIGerenciarUsuario gerenciarUsuario = new GUIGerenciarUsuario();
				gerenciarUsuario.setVisible(true);
			}
		});
		btnGerenciarUsuario.setBounds(46, 172, 117, 23);
		contentPane.add(btnGerenciarUsuario);

		JButton btnCandidato = new JButton("Candidato");
		btnCandidato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUICandidato guiCandidato = new GUICandidato();
				guiCandidato.setVisible(true);
			}
		});
		btnCandidato.setBounds(236, 172, 108, 23);
		contentPane.add(btnCandidato);

		JButton btnCurso = new JButton("Curso");
		btnCurso.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUICurso guiCurso = new GUICurso();
				guiCurso.setVisible(true);
			}
		});
		btnCurso.setBounds(46, 228, 117, 23);
		contentPane.add(btnCurso);

		JButton btnMatricula = new JButton("Matricula");
		btnMatricula.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIMatriculaBoleto guiMatriculaBoleto = new GUIMatriculaBoleto();
				guiMatriculaBoleto.setVisible(true);
			}
		});
		btnMatricula.setBounds(236, 228, 108, 23);
		contentPane.add(btnMatricula);

		JButton btnDisciplinas = new JButton("Disciplinas");
		btnDisciplinas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUICursoDisciplina guiCursoDisciplina = new GUICursoDisciplina();
				guiCursoDisciplina.setVisible(true);
			}
		});
		btnDisciplinas.setBounds(46, 277, 117, 23);
		contentPane.add(btnDisciplinas);

		JButton btnOfertaProf = new JButton("Oferta Prof");
		btnOfertaProf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUIProfOferta guiProfOferta = new GUIProfOferta();
				guiProfOferta.setVisible(true);
			}
		});
		btnOfertaProf.setBounds(236, 277, 108, 23);
		contentPane.add(btnOfertaProf);
	}
}
