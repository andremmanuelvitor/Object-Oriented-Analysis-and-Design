package br.edu.unifei.ecot02.relacoes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Janela extends JFrame {
	private JLabel lblAltura = new JLabel("Altura");
	private JLabel lblBase = new JLabel("Base");
	private JLabel lblArea = new JLabel("Area");
	private JTextField txtAltura = new JTextField();
	private JTextField txtBase = new JTextField();
	private JTextField txtArea = new JTextField();
	private JPanel panPainel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panPainel.setLayout(new GridLayout(4, 2));
		setContentPane(panPainel);
		panPainel.add(lblAltura);
		panPainel.add(txtAltura);
		panPainel.add(lblBase);
		panPainel.add(txtBase);
		panPainel.add(lblArea);
		panPainel.add(txtArea);
	}

}
