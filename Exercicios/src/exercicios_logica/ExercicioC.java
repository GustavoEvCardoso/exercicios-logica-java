package exercicios_logica;

import java.text.DecimalFormat;
import java.util.Scanner;

//Faça um programa que recebe dois números inteiros distintos e exibe o maior.
public class ExercicioC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double primeiroNumero = sc.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		double segundoNumero = sc.nextDouble();
		
		DecimalFormat df = new DecimalFormat (".00");
		
		if( primeiroNumero > segundoNumero) {
			System.out.println(df.format(segundoNumero) + " é maior");
		}
		else {
			System.out.println(df.format(segundoNumero) + " é maior");
		}
		
		sc.close();
	}

}
