package exercicios_logica;

import java.util.Scanner;

public class ExercicioJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int delta;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o coeficiente A: ");
		int a = sc.nextInt();
		System.out.println("Digite o coeficiente B: ");
		int b = sc.nextInt();
		System.out.println("Digite o coeficiente C: ");
		int c = sc.nextInt();
		
		delta = (int) (Math.pow(b,2) - (4*a*c));
		
		if(delta > 0) {
			System.out.println("a equação possui duas raízes reais e distintas." + delta);
		}
		else if (delta == 0) {
			System.out.println("uma única raiz real e distinta." + delta);
		}
		else {
			System.out.println("nenhuma raiz real." + delta );
		}
		sc.close();
	}

}






//Δ=b2−4ac
//∆ > 0: a equação possui duas raízes reais e distintas.
//∆ = 0: uma única raiz real e distinta.
//∆ < 0: nenhuma raiz real.