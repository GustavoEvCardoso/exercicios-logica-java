package exercicios_logica;

import java.util.Scanner;

//Faça um programa que recebe a idade de um nadador e exibe a categoria que ele pertence. Sendo o critério:
//• Infantil (0 a 10 anos);
//• Junior (11 a 14 anos);
//• Adolescente (15 a 20 anos);
//• Jovem (21 a 35 anos) e
//• Máster (> 35 anos).

public class ExercicioN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Idade nadador: ");
		int idade = sc.nextInt();
		String categoria;
		
		if (idade <=10) {
			categoria = "Infantil";
		}
			
		else if(idade >= 11 && idade <= 14 ) {
			categoria = "Junior";
		}
		
		else if(idade >= 14 && idade <= 20) {
			categoria = "Adolescente";
		}
		else if (idade >= 21 && idade <= 35) {
			categoria = "Jovem";
		}
		else {
			categoria = "Master";
		}
		System.out.println("Categoria que pertence : " + categoria );
		sc.close();
	}

}











