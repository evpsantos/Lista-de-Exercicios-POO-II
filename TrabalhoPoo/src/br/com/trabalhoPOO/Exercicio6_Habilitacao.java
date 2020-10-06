package br.com.trabalhoPOO;

import javax.swing.JOptionPane;

public class Exercicio6_Habilitacao {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog(" Entre com o seu nome  ");
		String n2 = JOptionPane.showInputDialog("\nEntre com a sua Idade  ");

		int Idade = Integer.parseInt(n2);

		if (Idade < 18) {

			JOptionPane.showMessageDialog(null,
					"Olá; " + n1 + " \n\nIdade mínima permitida para CNH é 18 anos!!!" + " \n\n***Idade não Permitida***  ",
					" Detran MG ", JOptionPane.ERROR_MESSAGE);
		} else {

			JOptionPane.showMessageDialog(null,
					"Olá, " + n1 + "\n\n Você possui idade mínima permitida para" + " tirar a CNH!!! ", " Detran MG ",
					JOptionPane.PLAIN_MESSAGE);

		}
	}

}


