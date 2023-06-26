package exercicios_logica;

import java.util.Scanner;

public class ExercicioO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota da primeira prova de 0 a 10: ");
		double prova1 = sc.nextDouble();
		
		System.out.println("Digite a nota da segunda prova de 0 a 10: ");
		double prova2 = sc.nextDouble();
		
		System.out.println("Digite a nota do primeiro trabalho de 0 a 10: ");
		double trabalho1 = sc.nextDouble();
		
		System.out.println("Digite a nota do segundo trabalho de 0 a 10: ");
		double trabalho2 = sc.nextDouble();
		
		System.out.println("Digite a nota do terceiro trabalho de 0 a 10: ");
		double trabalho3 = sc.nextDouble();
		
		double mediaFinal;
		mediaFinal = (prova1 + prova2 + trabalho1 + trabalho2 + trabalho3) / 5;
		
		if ( mediaFinal >= 6 && mediaFinal <= 10) {
			System.out.println("Aluno aprovado!" + "\r\nSua media foi: " + mediaFinal);
		}
		else if (mediaFinal >= 4 && mediaFinal < 6) {
			System.out.println("Aluno em exame!" + "\r\nSua media foi: " + mediaFinal);
		}
		else {
			System.out.println("Aluno reprovado!" + "\r\nSua media foi: " + mediaFinal);
		}
		sc.close();
	}

}


//) Desenvolva um programa que, com base em duas notas de provas e três notas de trabalhos dadas pelo usuário,
//exibe uma mensagem indicando se o aluno foi aprovado, reprovado ou se fará o exame.
//• 6 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 ≤ 10, 𝑎𝑝𝑟𝑜𝑣𝑎𝑑𝑜
//• 4 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 6, 𝑒𝑥𝑎𝑚𝑒
//• 0 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 4, 𝑟𝑒𝑝𝑟𝑜𝑣𝑎𝑑𝑜
//• Considere que 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 = A1 (até 3 pontos) + A2 (até 3 pontos) + A3 (até 4 pontos)