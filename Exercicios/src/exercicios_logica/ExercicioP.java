package exercicios_logica;

import java.util.Scanner;

public class ExercicioP {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double bonus = 0.2;
			double bonus2 = 0.25;//25/100
		    double salarioH;
		    double salarioM;
		    
		    Scanner sc = new Scanner (System.in);
		    
		    System.out.println("Digite o sexo: ");
		    String sexo = sc.next();
		    
		    System.out.println("Digite o tempo(Anos)de casa: ");
		    int tempo = sc.nextInt();
		    
		    System.out.println("Digite o salario: ");
		    double salario = sc.nextInt();
		  
		    if (sexo.toUpperCase().equals("HOMEM") && tempo > 15){
		        salarioH = (salario * bonus) + salario;
		          System.out.println("O valor total que recebera no Natal é $ " + salarioH);
		    }
		    else if (sexo.toUpperCase().equals("MULHER") && tempo > 10){
		    	salarioM = (salario * bonus2) + salario;
		    	System.out.println("O valor total que recebera no Natal é $ " + salarioM);
		    }
		    else {
		    	System.out.println("O valor total que recebera no Natal é $ " + (salario + 200));
		    }
		    sc.close();
		    
	}

}
