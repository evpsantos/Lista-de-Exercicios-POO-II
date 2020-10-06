package br.com.trabalhoPOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

/*Crie um JFrame que contenha exemplos de RadioButton. Você pode usar para determinar se o
usuário é do sexo Masculino ou Feminino ou pode simular a resposta de uma prova de múltipla
escolha.*/

public class Exercicio8 extends JFrame {

	private JPanel contentPane;
	private JRadioButton masculino;
	private JRadioButton feminino;
	private JTextField textFieldNome;
	private JLabel lblNewLabelcabeçalho;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio8 frame = new Exercicio8();
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
	public Exercicio8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 312);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*-----------------Cabeçalho---------------------------------------*/
		lblNewLabelcabeçalho = new JLabel("Formul\u00E1rio");
		lblNewLabelcabeçalho.setForeground(Color.WHITE);
		lblNewLabelcabeçalho.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabelcabeçalho.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabelcabeçalho.setBounds(41, 13, 373, 40);
		contentPane.add(lblNewLabelcabeçalho);
		/*-----------------------------------------------------------------*/
		
		JLabel lblNewLabelsexo = new JLabel("Sexo");
		lblNewLabelsexo.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabelsexo.setForeground(Color.WHITE);
		lblNewLabelsexo.setBounds(31, 146, 70, 25);
		contentPane.add(lblNewLabelsexo);

		feminino = new JRadioButton("Feminino");
		feminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				masculino.setSelected(false);

			}
		});
		feminino.setForeground(Color.WHITE);
		feminino.setBackground(new Color(47, 79, 79));
		feminino.setFont(new Font("Arial", Font.BOLD, 13));
		feminino.setBounds(281, 146, 127, 25);
		contentPane.add(feminino);

		masculino = new JRadioButton("Masculino");
		masculino.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {

				feminino.setSelected(false);

			}
		});
		
		masculino.setBackground(new Color(47, 79, 79));
		masculino.setForeground(Color.WHITE);
		masculino.setFont(new Font("Arial", Font.BOLD, 13));
		masculino.setBounds(131, 146, 127, 25);
		contentPane.add(masculino);

		JButton ButtonConfirmar = new JButton("Confirmar");
		ButtonConfirmar.setForeground(new Color(47, 79, 79));
		ButtonConfirmar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

				String selection = null;

				if (masculino.isSelected()) {
					selection = " \n\n Gênero Selecionado:  Mascuilino ";
				}
				if (feminino.isSelected()) {
					selection = "\n\n Gênero Selecionado: Feminino ";
				}

				JOptionPane.showMessageDialog(null, "Olá, Senhor(a) " + textFieldNome.getText() + selection);
			}
		});
		ButtonConfirmar.setFont(new Font("Arial", Font.BOLD, 13));
		ButtonConfirmar.setBackground(Color.WHITE);
		ButtonConfirmar.setBounds(281, 211, 97, 25);
		contentPane.add(ButtonConfirmar);

		textFieldNome = new JTextField();
		textFieldNome.setBounds(95, 87, 283, 22);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);

		JLabel lblNewLabelNome = new JLabel("Nome");
		lblNewLabelNome.setForeground(Color.WHITE);
		lblNewLabelNome.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabelNome.setBounds(31, 87, 70, 25);
		contentPane.add(lblNewLabelNome);

	}
}
