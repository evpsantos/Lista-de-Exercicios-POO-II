package br.com.trabalhoPOO;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio9_Pedido_Pizzaria extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBoxSabores;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio9_Pedido_Pizzaria frame = new Exercicio9_Pedido_Pizzaria();
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
	public Exercicio9_Pedido_Pizzaria() {
		setTitle("Pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 376, 403);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(138, 43, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		/*
		 * ------------------------------Cabeçalhos-------------------------------------
		 * ----------
		 */

		JLabel lblNewLabelCabeçalho = new JLabel("Pedido");
		lblNewLabelCabeçalho.setForeground(Color.WHITE);
		lblNewLabelCabeçalho.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabelCabeçalho.setBounds(142, 13, 86, 35);
		contentPane.add(lblNewLabelCabeçalho);

		/*---------------------------Titulo Sabores-----------------------------------------------*/
		JLabel SaborOpcoes = new JLabel("Sabor da Pizza");
		SaborOpcoes.setForeground(Color.WHITE);
		SaborOpcoes.setFont(new Font("Arial", Font.BOLD, 16));
		SaborOpcoes.setBounds(36, 61, 306, 25);
		contentPane.add(SaborOpcoes);

		/*---------------------------Menu Acréscimos-----------------------------------------------*/

		JLabel NewLabelAcrescimos = new JLabel("Sele\u00E7\u00E3o Acr\u00E9scimos");
		NewLabelAcrescimos.setForeground(Color.WHITE);
		NewLabelAcrescimos.setFont(new Font("Arial", Font.BOLD, 16));
		NewLabelAcrescimos.setBounds(36, 192, 306, 25);
		contentPane.add(NewLabelAcrescimos);

		/*---------------------Seçao de Sabores Sabores----------------------------------------------*/
		comboBoxSabores = new JComboBox();
		comboBoxSabores.setForeground(new Color(138, 43, 226));
		comboBoxSabores.setBackground(Color.WHITE);
		comboBoxSabores.setFont(new Font("Arial", Font.BOLD, 13));
		comboBoxSabores.setEditable(true);
		comboBoxSabores.setBounds(36, 99, 290, 25);
		contentPane.add(comboBoxSabores);

		comboBoxSabores.addItem("A moda");
		comboBoxSabores.addItem("Calabreza");
		comboBoxSabores.addItem("Franco Catupiry");
		comboBoxSabores.addItem("Portuguesa");
		comboBoxSabores.setSelectedItem(null);

		comboBoxSabores.setSelectedItem("Sabores Disponiveis ");
		comboBoxSabores.setBackground(Color.WHITE);

		/*---------------------Seleção de Acréscimos---------------------------------------------------*/

		JCheckBox CheckBoxBacon = new JCheckBox("Bacon");
		CheckBoxBacon.setForeground(Color.WHITE);
		CheckBoxBacon.setBackground(new Color(138, 43, 226));
		CheckBoxBacon.setFont(new Font("Arial", Font.BOLD, 13));
		CheckBoxBacon.setBounds(36, 226, 133, 25);
		contentPane.add(CheckBoxBacon);

		JCheckBox CheckBoxQueijo = new JCheckBox("Queijo");
		CheckBoxQueijo.setForeground(Color.WHITE);
		CheckBoxQueijo.setBackground(new Color(138, 43, 226));
		CheckBoxQueijo.setFont(new Font("Arial", Font.BOLD, 13));
		CheckBoxQueijo.setBounds(36, 256, 133, 25);
		contentPane.add(CheckBoxQueijo);

		JCheckBox CheckBoxMolho = new JCheckBox("Molho");
		CheckBoxMolho.setForeground(Color.WHITE);
		CheckBoxMolho.setBackground(new Color(138, 43, 226));
		CheckBoxMolho.setFont(new Font("Arial", Font.BOLD, 13));
		CheckBoxMolho.setBounds(183, 226, 143, 25);
		contentPane.add(CheckBoxMolho);

		JCheckBox bordaRecheada = new JCheckBox("Borada Recheada");
		bordaRecheada.setForeground(Color.WHITE);
		bordaRecheada.setBackground(new Color(138, 43, 226));
		bordaRecheada.setFont(new Font("Arial", Font.BOLD, 13));
		bordaRecheada.setBounds(183, 256, 143, 25);
		contentPane.add(bordaRecheada);

		/*----------------------------------------------------------------------------------------------------*/

		/*--------------------Botão de Confirmação-------------------------------------------------------- */

		JButton ButtonConfirmar = new JButton("Confirmar ");
		ButtonConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String value = (String) comboBoxSabores.getSelectedItem();

				JOptionPane.showMessageDialog(contentPane, "Sabor selecionado:  " + value);

			}
		});
		ButtonConfirmar.setForeground(new Color(138, 43, 226));
		ButtonConfirmar.setFont(new Font("Arial", Font.BOLD, 13));

		ButtonConfirmar.setBounds(228, 154, 99, 25);
		contentPane.add(ButtonConfirmar);

		JButton Confim = new JButton("Confirma");
		Confim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String result = "";
				for (Component c : contentPane.getComponents()) {
					if (c.getClass().equals(JCheckBox.class)) {
						JCheckBox jck = (JCheckBox) c;
						if (jck.isSelected())
							result += jck.getText() + " ,";

					}
				}

				JOptionPane.showMessageDialog(null, "Acréscimos selecionado(s)" + result);
			}
		});
		Confim.setForeground(new Color(138, 43, 226));
		Confim.setFont(new Font("Arial", Font.BOLD, 13));
		Confim.setBounds(229, 290, 97, 25);
		contentPane.add(Confim);

	}
}
