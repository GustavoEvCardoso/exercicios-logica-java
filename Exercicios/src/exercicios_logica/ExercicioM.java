package exercicios_logica;

import java.util.Scanner;

public class ExercicioM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Quantidade de cilindradas: " + "cc");
		int qtdCilindradas = sc.nextInt();
		
		if(qtdCilindradas <= 120 ) {
			System.out.println("Sub Production");
		}
		else if(qtdCilindradas <= 240){
			System.out.println("Production");
		}
		else {
			System.out.println("Super Production");
		}
		sc.close();
	}

}

/*Faça um programa que recebe a quantidade de cilindradas (cc) de um veículo de competição e exibe a categoria a qual ele pertence, sendo:
*• De 0cc a 120cc: “Sub Production”;
*• De 121cc a 240cc: “Production”;
*• Acima de 240cc: “Super Production”. */
