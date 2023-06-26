package exercicios_logica;

import java.util.Scanner;

/*b) Tendo como entrada a altura e o sexo de uma pessoa, construa um programa que exibe o peso ideal para ela, em quilos. Use as seguintes fórmulas (adote ℎ como a altura e em metros):
• Homens: 72,7 × ℎ − 58
• Mulheres: 62,1 × ℎ − 44,7*/
public class ExercicioB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a altura: ");
		double h = sc.nextFloat();
		
		System.out.println("Digite o sexo da pessoa: ");
		String sexoPessoa = sc.next();
		
		double pesoIdealH, pesoIdealM;
		
		if(sexoPessoa.equals("Homem")) {
			pesoIdealH = 72.7 * h - 58;
			System.out.printf("O peso ideal para homens é %.2f kg\n", pesoIdealH);
		}
		else if (sexoPessoa.equals("Mulher")){
			pesoIdealM =  62.1 * h - 44.7;
			System.out.printf("O peso ideal para mulheres é %.2f kg\n", pesoIdealM);
		}
		 else {
	            System.out.println("Sexo inválido!");
	        }
		sc.close();
	}

}

/*Olá visitante, faço o curso de Análise e Desenvolvimento de Sistemas na Universidade São Judas Tadeu e estou no primeiro semestre do curso. 

Busco uma oportunidade de estágio na área de tecnologia. Fiz alguns cursos livres para adquirir conhecimentos básicos em HTML, CSS, JavaScript. Também tenho conhecimento em Metodologia Scrum e método Kanban. Eu quero aprender novas linguagens de programação,  novos frameworks e quero desenvolver novas soft-skills.

Email: gustavoev.cardoso@gmail.com*/