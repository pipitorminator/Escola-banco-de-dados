package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.CandidatoController;
import model.Candidato;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUICandidato extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the frame.
	 */
	public GUICandidato() {
		setBounds(100, 100, 303, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblCandidato = new JLabel("Candidato");
		lblCandidato.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblCandidato.setBounds(28, 0, 179, 45);
		contentPane.add(lblCandidato);

		JLabel lblCpf = new JLabel("cpf");
		lblCpf.setBounds(10, 64, 46, 14);
		contentPane.add(lblCpf);

		JLabel lblNome = new JLabel("nome");
		lblNome.setBounds(10, 97, 46, 14);
		contentPane.add(lblNome);

		JLabel lblTelefone = new JLabel("telefone");
		lblTelefone.setBounds(10, 169, 46, 14);
		contentPane.add(lblTelefone);

		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(10, 134, 46, 14);
		contentPane.add(lblEmail);

		JLabel lblData = new JLabel("data");
		lblData.setBounds(10, 205, 46, 14);
		contentPane.add(lblData);

		textField = new JTextField();
		textField.setBounds(80, 61, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(80, 94, 143, 20);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 131, 143, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(80, 166, 143, 20);
		contentPane.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 202, 143, 20);
		contentPane.add(textField_4);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				salvar();
			}
		});
		btnSalvar.setBounds(20, 230, 89, 23);
		contentPane.add(btnSalvar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscar();
			}
		});
		btnBuscar.setBounds(160, 233, 89, 23);
		contentPane.add(btnBuscar);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				delete();
			}
		});
		btnDeletar.setBounds(20, 264, 89, 23);
		contentPane.add(btnDeletar);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				update();
			}
		});
		btnUpdate.setBounds(160, 267, 89, 23);
		contentPane.add(btnUpdate);
	}

	public void salvar() {
		try {
			CandidatoController candidatoController = new CandidatoController();
			Candidato candidato = new Candidato(textField.getText(), textField_1.getText(), textField_3.getText(), textField_2.getText(), textField_4.getText());
			candidatoController.inserir(candidato);
			JOptionPane.showMessageDialog(this, "inserido");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}
	}

	public void buscar() {
		try {
			CandidatoController candidatoController = new CandidatoController();
			Candidato candidato = candidatoController.buscar(textField.getText());
			textField.setText(candidato.getCpf());
			textField_1.setText(candidato.getNome());
			textField_2.setText(candidato.getEmail());
			textField_3.setText(candidato.getTelefone());
			textField_4.setText(candidato.getData());
			JOptionPane.showMessageDialog(this, "encontrado");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "não encontrado");
		}

	}

	public void update() {
		try {
			CandidatoController candidatoController = new CandidatoController();
			Candidato candidato = new Candidato(textField.getText(), textField_1.getText(), textField_3.getText(), textField_2.getText(), textField_4.getText());
			candidatoController.update(candidato);
			JOptionPane.showMessageDialog(this, "sucesso no update");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "erro ao dar update");
		}
	}

	public void delete() {
		try {
			CandidatoController candidatoController = new CandidatoController();
			candidatoController.delete(textField.getText());
			JOptionPane.showMessageDialog(this, "deletado");
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}
	}
}
