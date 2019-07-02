package gui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controllers.ProdutoController;
import model.ProdutorRef;

public class GUIProduto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDescrio;
	private JTextField txtUnidade;
	private JTextField txtPreoUnitario;
	private JTextField txtCodigoDeBarras;
	private JTextField txtMarca;
	private JTextField txtTipo;
	private ProdutoController produtoController;

	/**
	 * Create the frame.
	 */
	public GUIProduto() {
		produtoController = new ProdutoController();
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(37, 105, 46, 14);
		contentPane.add(lblDescrio);

		JLabel lblUnidade = new JLabel("Unidade");
		lblUnidade.setBounds(37, 140, 46, 14);
		contentPane.add(lblUnidade);

		JLabel lblCodigoDeBarras = new JLabel("Codigo de barras");
		lblCodigoDeBarras.setBounds(37, 210, 91, 14);
		contentPane.add(lblCodigoDeBarras);

		JLabel lblPreoUnitario = new JLabel("Pre\u00E7o unitario");
		lblPreoUnitario.setBounds(37, 175, 82, 14);
		contentPane.add(lblPreoUnitario);

		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(37, 245, 46, 14);
		contentPane.add(lblMarca);

		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setBounds(37, 280, 46, 14);
		contentPane.add(lblTipo);

		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblProduto.setBounds(144, 11, 170, 39);
		contentPane.add(lblProduto);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cadastrarProduto();
			}
		});
		btnCadastrar.setBounds(30, 327, 89, 23);
		contentPane.add(btnCadastrar);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buscarProduto();
			}
		});
		btnBuscar.setBounds(181, 327, 89, 23);
		contentPane.add(btnBuscar);

		JButton btnRemover = new JButton("Remover");
		btnRemover.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removerProduto();
			}
		});
		btnRemover.setBounds(320, 327, 89, 23);
		contentPane.add(btnRemover);

		txtDescrio = new JTextField();
		txtDescrio.setText("descri\u00E7\u00E3o");
		txtDescrio.setColumns(10);
		txtDescrio.setBounds(154, 102, 178, 20);
		contentPane.add(txtDescrio);

		txtUnidade = new JTextField();
		txtUnidade.setText("Unidade*");
		txtUnidade.setColumns(10);
		txtUnidade.setBounds(154, 137, 178, 20);
		contentPane.add(txtUnidade);

		txtPreoUnitario = new JTextField();
		txtPreoUnitario.setText("Pre\u00E7o unitario*");
		txtPreoUnitario.setColumns(10);
		txtPreoUnitario.setBounds(154, 172, 178, 20);
		contentPane.add(txtPreoUnitario);

		txtCodigoDeBarras = new JTextField();
		txtCodigoDeBarras.setText("codigo de barras*");
		txtCodigoDeBarras.setColumns(10);
		txtCodigoDeBarras.setBounds(154, 207, 178, 20);
		contentPane.add(txtCodigoDeBarras);

		txtMarca = new JTextField();
		txtMarca.setText("Marca");
		txtMarca.setColumns(10);
		txtMarca.setBounds(154, 242, 178, 20);
		contentPane.add(txtMarca);

		txtTipo = new JTextField();
		txtTipo.setText("Tipo*");
		txtTipo.setColumns(10);
		txtTipo.setBounds(154, 277, 178, 20);
		contentPane.add(txtTipo);
	}

	public void cadastrarProduto() {
		try {
			
		ProdutorRef produto = new ProdutorRef(0, txtDescrio.getText(), txtUnidade.getText(), txtCodigoDeBarras.getText(), Double.parseDouble(txtPreoUnitario.getText()), txtMarca.getText(), txtTipo.getText());
		produtoController.cadastrar(produto);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "erro ao inserir");
		}
	}

	public void buscarProduto() {
		ProdutorRef produto = produtoController.buscar(txtCodigoDeBarras.getText());
		txtCodigoDeBarras.setText(produto.getCod_barras());
		txtDescrio.setText(produto.getDescricao());
		txtMarca.setText(produto.getMarca());
		txtPreoUnitario.setText(String.valueOf(produto.getPreco_unit()));
		txtTipo.setText(produto.getTipo());
		txtUnidade.setText(produto.getUnidade());

	}

	public void removerProduto() {
		try {
		produtoController.remover(txtCodigoDeBarras.getText());
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, "erro ao deletar");
		}
	}
}
