package exercicios_logica;

import java.util.Scanner;

/* Faça um programa que recebe o valor de três arestas e exibe uma mensagem indicando se podem formar um triângulo. Em caso afirmativo, 
 * indique se ele é equilátero, isósceles ou escaleno. 
 * Lembre-se: Para que um triângulo exista, a medida de qualquer um dos lados deve ser menor que a soma das medidas dos outros dois.
   
 */
public class ExercicioI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor da primeira aresta:");
	        double a = scanner.nextDouble();

	        System.out.println("Digite o valor da segunda aresta:");
	        double b = scanner.nextDouble();

	        System.out.println("Digite o valor da terceira aresta:");
	        double c = scanner.nextDouble();
	
		        if (verificarTriangulo(a, b, c)) {
		            if (a == b && b == c) {
		                System.out.println("É um triângulo equilátero.");
		            } else if (a == b || b == c || a == c) {
		                System.out.println("É um triângulo isósceles.");
		            } else {
		                System.out.println("É um triângulo escaleno.");
		            }
		        } else {
		            System.out.println("Não é possível formar um triângulo com as medidas fornecidas.");
		        }
		    }
	
		    public static boolean verificarTriangulo(double a, double b, double c) {
		        return (a < b + c) && (b < a + c) && (c < a + b);
		    }
		}


