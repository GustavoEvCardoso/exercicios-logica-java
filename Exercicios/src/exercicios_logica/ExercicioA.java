package exercicios_logica;

import java.util.Scanner;

/*a) Faça um programa que recebe duas notas, exibe a média aritmética das notas e uma mensagem indicando se o aluno foi aprovado ou reprovado. A média para aprovação deve ser maior que seis
 */
public class ExercicioA {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeiro nota: ");
		float primeiraNota = sc.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float segundaNota = sc.nextFloat();
		
		float media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 6) {
			System.out.println("Vc passou inteligente! \nSua media: " + media);
		}
		else {
			System.out.printf("Voce foi reprovado! \nSua media: " + media);
		}
		
		sc.close();
	}
	
}
