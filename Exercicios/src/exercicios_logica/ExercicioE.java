package exercicios_logica;

import java.util.Scanner;

//e) Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se ele é par ou ímpar
//(use o operador % para obter o resto de uma divisão inteira).
public class ExercicioE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Primeiro numero: ");
		int firstNumber = sc.nextInt();
		
		
		if ((firstNumber % 2) == 0) {
			System.out.println("O numero é par");
		}
		else {
			System.out.println("O numero é impar");
		}
		
		sc.close();
	}

}
