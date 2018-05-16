package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.List;
import java.awt.Button;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JButton btnPrimera;
	protected JButton btnAnterior;
	protected JButton btnUltima;
	protected JButton btnSiguiente;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
//	protected Button lb1;
//	protected Button lb2;
	protected JTextArea textArea;
	private JLabel lblNumeroPagina;
//	protected JPanel panelDos;
//	protected JButton btnAadir;
//	protected JButton btnBorrarLibro;


	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 297, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 250, 210));
		contentPane.setBorder(new LineBorder(new Color(255, 228, 196), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(250, 250, 210), 2));
		textArea.setSelectionColor(new Color(218, 165, 32));
		textArea.setBounds(0, 0, 291, 399);
		contentPane.add(textArea);
		textArea.setBackground(Color.DARK_GRAY);
		textArea.setForeground(Color.WHITE);
		textArea.setEnabled(false);
		
		btnPrimera = new JButton("<<");
		btnPrimera.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnPrimera.setBackground(SystemColor.inactiveCaptionBorder);
		btnPrimera.setBounds(10, 427, 49, 23);
		contentPane.add(btnPrimera);
		
		btnAnterior = new JButton("<");
		btnAnterior.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnAnterior.setBackground(SystemColor.inactiveCaptionBorder);
		btnAnterior.setBounds(54, 427, 41, 23);
		contentPane.add(btnAnterior);
		
		btnUltima = new JButton(">>");
		btnUltima.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnUltima.setBackground(SystemColor.inactiveCaptionBorder);
		btnUltima.setBounds(232, 427, 49, 23);
		contentPane.add(btnUltima);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnSiguiente.setBackground(SystemColor.inactiveCaptionBorder);
		btnSiguiente.setBounds(196, 427, 41, 23);
		contentPane.add(btnSiguiente);
		
		btnMarcar = new JButton("Marcar");
		btnMarcar.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnMarcar.setBackground(SystemColor.inactiveCaptionBorder);
		btnMarcar.setBounds(91, 427, 107, 23);
		contentPane.add(btnMarcar);
		
		btnIrAMarca = new JButton("Ir a marca");
		btnIrAMarca.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnIrAMarca.setBackground(SystemColor.inactiveCaptionBorder);
		btnIrAMarca.setBounds(10, 401, 203, 23);
		contentPane.add(btnIrAMarca);
		
		lblNumeroPagina = new JLabel("0");
		lblNumeroPagina.setForeground(new Color(0, 0, 0));
		lblNumeroPagina.setBounds(242, 399, 24, 23);
		contentPane.add(lblNumeroPagina);
		
//		panelDos = new JPanel();
//		tabbedPane.addTab("Libros", null, panelDos, null);
//		panelDos.setLayout(null);
		
//		lb1 = new Button("Juego de Tronos - George R. R. Martin");
//		lb1.setBounds(0, 0, 266, 28);
//		panelDos.add(lb1);
//		
//		lb2 = new Button("Ready Player One - Ernest Cline ");
//		lb2.setBounds(0, 28, 266, 28);
//		lb2.setName("lb-2");
//		panelDos.add(lb2);
		
//		JPanel panel = new JPanel();
//		panel.setBackground(Color.BLACK);
//		panel.setBounds(0, 353, 266, 49);
//		panelDos.add(panel);
//		panel.setLayout(null);
//		
//		btnAadir = new JButton("A\u00F1adir libro");
//		btnAadir.setFont(new Font("Yu Gothic", Font.BOLD, 9));
//		btnAadir.setBounds(21, 11, 97, 23);
//		panel.add(btnAadir);
//		
//		btnBorrarLibro = new JButton("Borrar libro");
//		btnBorrarLibro.setFont(new Font("Yu Gothic", Font.BOLD, 9));
//		btnBorrarLibro.setBounds(141, 11, 97, 23);
//		panel.add(btnBorrarLibro);
	}
	
	

//	public JPanel getPanelDos() {
//		return panelDos;
//	}
//
//
//
//	public void setPanelDos(JPanel panelDos) {
//		this.panelDos = panelDos;
//	}



	public JButton getBtnPrimera() {
		return btnPrimera;
	}

	public void setBtnPrimera(JButton btnPrimera) {
		this.btnPrimera = btnPrimera;
	}

	public JButton getBtnAnterior() {
		return btnAnterior;
	}

	public void setBtnAnterior(JButton btnAnterior) {
		this.btnAnterior = btnAnterior;
	}

	public JButton getBtnUltima() {
		return btnUltima;
	}

	public void setBtnUltima(JButton btnUltima) {
		this.btnUltima = btnUltima;
	}

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public JButton getBtnIrAMarca() {
		return btnMarcar;
	}

	public void setBtnIrAMarca(JButton btnIrAMarca) {
		this.btnMarcar = btnIrAMarca;
	}

	public JButton getBtnMarcar() {
		return btnIrAMarca;
	}

	public void setBtnMarcar(JButton btnMarcar) {
		this.btnIrAMarca = btnMarcar;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}

	public JLabel getLblNumeroPagina() {
		return lblNumeroPagina;
	}

	public void setLblNumeroPagina(JLabel lblNumeroPagina) {
		this.lblNumeroPagina = lblNumeroPagina;
	}
}
