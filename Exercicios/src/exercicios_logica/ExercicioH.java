package exercicios_logica;

import javax.swing.JOptionPane;

/// Desenvolva um programa que recebe a base e a altura de três triângulos e exibe a maior área. Lembre-se da fórmula: 𝐴 = 𝑏𝑎𝑠𝑒 ×𝑎𝑙𝑡𝑢𝑟𝑎 / 2
public class ExercicioH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Triangulo1
		 double base1 = Double.parseDouble (JOptionPane.showInputDialog("Digite a base: "));
		 double altura1 = Double.parseDouble (JOptionPane.showInputDialog("Digite a altura: "));
		 
		 //Triangulo 2
		 double base2 = Double.parseDouble (JOptionPane.showInputDialog("Digite a base do segundo triangulo: "));
		 double altura2 = Double.parseDouble (JOptionPane.showInputDialog("Digite a altura segundo triangulo: "));
		 
		 //Triangulo 3
		 double base3 = Double.parseDouble (JOptionPane.showInputDialog("Digite a base terceiro triangulo:: "));
		 double altura3 = Double.parseDouble (JOptionPane.showInputDialog("Digite a altura terceiro triangulo:: "));
		 
		 double triangulo1 = (base1 * altura1) / 2;
		 double triangulo2 = (base2 * altura2) / 2;
		 double triangulo3 = (base3 * altura3) / 2;
		 
		 if(triangulo1 > triangulo2 || triangulo1 > triangulo3) {
			 System.out.println("A área do primeiro triangulo é a maior: "+ triangulo1);
		 }
		 else if(triangulo2 > triangulo1 && triangulo2 > triangulo3) {
		 		System.out.println("A área do segundo triangulo é maior: " + triangulo2);
		 }
		 else if (triangulo3 > triangulo1 && triangulo3 > triangulo2) {
			 System.out.println("A área do terceiro triangulo é maior: " + triangulo3 + "cm");
		 }
	}

}
//else if (triangulo3 > triangulo1 && triangulo3 > triangulo2) {
//	 System.out.println("A área do terceiro triangulo é maior: " + triangulo3 + "cm");
//}