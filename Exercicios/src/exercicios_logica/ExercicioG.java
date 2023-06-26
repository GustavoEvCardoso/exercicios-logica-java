package exercicios_logica;

import java.util.Scanner;

import javax.swing.JOptionPane;

/* Faça um programa que mostre um menu com as opções "adição", "subtração", "multiplicação" e "divisão", recebe dois valores reais,
 *  a operação escolhida pelo usuário e exibe o resultado da operação sobre os valores
 */
public class ExercicioG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Operadores Aritméticos------");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação ");
		System.out.println("4 - Divisão");
		System.out.println("\nDigite uma opção:  ");
		int opcao = sc.nextInt();
		

		
		System.out.println("Digite um numero: ");
		double x = sc.nextInt();
		
		System.out.println("Digite outro numero:  ");
		double y = sc.nextInt();
		
		double adicao,subtracao,multiplicacao,divisao;
		
		switch (opcao) {
		case 1:
			adicao = x + y;
			System.out.println("Resultado adição: "  + adicao );
			break;
			
		case 2: 
			subtracao = x - y;
			System.out.println("Resultado subtracao: "  + subtracao);
			break;
		case 3:
			multiplicacao = x * y;
			System.out.println("Resultado Multiplicação:  "  + multiplicacao);
			break;
		case 4:
			divisao = x / y;
			System.out.println("Resultado Divisão:  " + divisao);
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
		}	


		sc.close();
	}
}
//		String menu =JOptionPane.showInputDialog("-------Operadores Aritméticos------"
//				+ "\n1 - Adição"
//				+ "\n2 - Subtração"
//				+ "\n3 - Multiplicação"
//				+ "\n4 - Divisão"
//				+ "\nDigite uma opção: ");
//		int opcao = Integer.parseInt(menu);
//		