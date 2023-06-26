package exercicios_logica;

import java.util.Scanner;

public class ExercicioF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro numero: ");
		int a = sc.nextInt();
		
		System.out.println("Segundo numero: ");
		int b =  sc.nextInt();
		
		System.out.println("Terceiro numero:");
		int c = sc.nextInt();
		
		if (a < b && b < c) {
			System.out.printf("Ordem Crescente: %d %d %d \n",+ a,b,c);
		}
		else if (a < c && c < b ) {
			System.out.printf("Ordem Crescente: %d %d %d \n", + a,c,b);
		}
		else if(b < a && a < c) {
			System.out.printf("Ordem Crescente: %d %d %d \n", + b, a, c);
		}
		else if(b < c && c < a) {
			System.out.printf("Ordem Crescente: %d %d %d \n", + b, c, a);
		}
		else if (c < a && a < b) {
			System.out.printf("Ordem Crescente: %d %d %d \n", + c, a, b);
		}
		sc.close();
	}

}
