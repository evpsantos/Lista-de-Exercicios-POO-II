package br.com.trabalhoPOO;

import javax.swing.JOptionPane;

public class Exercicio6_Habilitacao {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog(" Entre com o seu nome  ");
		String n2 = JOptionPane.showInputDialog("\nEntre com a sua Idade  ");

		int Idade = Integer.parseInt(n2);

		if (Idade < 18) {

			JOptionPane.showMessageDialog(null,
					"Ol�; " + n1 + " \n\nIdade m�nima permitida para CNH � 18 anos!!!" + " \n\n***Idade n�o Permitida***  ",
					" Detran MG ", JOptionPane.ERROR_MESSAGE);
		} else {

			JOptionPane.showMessageDialog(null,
					"Ol�, " + n1 + "\n\n Voc� possui idade m�nima permitida para" + " tirar a CNH!!! ", " Detran MG ",
					JOptionPane.PLAIN_MESSAGE);

		}
	}

}


