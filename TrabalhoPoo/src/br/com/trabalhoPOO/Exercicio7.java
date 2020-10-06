package br.com.trabalhoPOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Exercicio7 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio7 frame = new Exercicio7();
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
	public Exercicio7() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabelNome = new JLabel("Nome");
		lblNewLabelNome.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabelNome.setBounds(52, 46, 56, 16);
		contentPane.add(lblNewLabelNome);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(112, 46, 214, 22);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		textFieldCidade = new JTextField();
		textFieldCidade.setBounds(112, 96, 214, 22);
		contentPane.add(textFieldCidade);
		textFieldCidade.setColumns(10);

		JLabel lblNewLabelCidade = new JLabel("Cidade");
		lblNewLabelCidade.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabelCidade.setBounds(52, 96, 56, 16);
		contentPane.add(lblNewLabelCidade);

		JButton btnNewButtonCopiar = new JButton("Printar");
		btnNewButtonCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null,
						"Olá Sr. ," + textFieldNome.getText() + "\n\nCidade Natal; " + textFieldCidade.getText());

				textFieldNome.setText("");
				textFieldCidade.setText("");
			}
		});

		btnNewButtonCopiar.setBounds(277, 172, 97, 25);
		contentPane.add(btnNewButtonCopiar);
	}
}
