package exercicios_logica;

import java.util.Scanner;

public class ExercicioK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o dia: ");
		int dia1 = sc.nextInt();
		System.out.println("Digite o mes: ");
		int mes1 = sc.nextInt();
		System.out.println("Digite o ano: ");
		int ano1 = sc.nextInt();
		
		//Segunda Data
		System.out.println("Digite o dia: ");
		int dia2 = sc.nextInt();
		System.out.println("Digite o mes: ");
		int mes2 = sc.nextInt();
		System.out.println("Digite o ano: ");
		int ano2 = sc.nextInt();
		
		if(ano1 > ano2) {
			System.out.println("A data 1 é mais recente");
		}
		else if (mes1 > mes2 ){
			System.out.println("A data 1 é mais recente");
		}
		else if(dia1 > dia2) {
			System.out.println("A data 1 é mais recente");
		}
		else {
			System.out.println("A data 2 é mais recente");
		}
		sc.close();
		
	}

}

//Faça um programa que recebe duas datas distintas e exibe a mais recente. 
//Cada data deve ser fornecida como três valores inteiros, onde o primeiro representa o dia, o segundo o mês e o terceiro o ano. Dica: comece verificando pelo ano.