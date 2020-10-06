package br.com.trabalhoPOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio10_Cidades extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio10_Cidades frame = new Exercicio10_Cidades();
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
	public Exercicio10_Cidades() {
		setTitle("Exerc\u00EDcio 10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBoxcity = new JComboBox();
		comboBoxcity.setEditable(true);
		comboBoxcity.setBounds(43, 77, 216, 30);
		contentPane.add(comboBoxcity);
		
		comboBoxcity.addItem("Belo Horizonte");
		comboBoxcity.addItem("Ouro Preto");
		comboBoxcity.addItem("Materlandia");
		comboBoxcity.addItem("Serro");
		comboBoxcity.addItem("Diamantina");
        comboBoxcity.setSelectedItem(null);
		
		comboBoxcity.setSelectedItem("Selecione uma opção");
		
		JLabel lblNewLabel = new JLabel("Escolha uma Cidade Favorita de MG");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(43, 26, 347, 30);
		contentPane.add(lblNewLabel);
		
		JButton confirm = new JButton("Confirmar");
		confirm.setForeground(new Color(0, 128, 128));
		confirm.setBackground(Color.WHITE);
		confirm.setFont(new Font("Arial", Font.BOLD, 13));
		confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String value = (String) comboBoxcity.getSelectedItem ();
				JOptionPane.showConfirmDialog(contentPane, "A cidade selecionada foi " + value + "",
						"Confirmação Cidade", JOptionPane.PLAIN_MESSAGE);;
			}
		});
		confirm.setBounds(283, 77, 107, 30);
		contentPane.add(confirm);
	}
}

