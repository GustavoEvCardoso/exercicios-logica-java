package exercicios_logica;



import javax.swing.JOptionPane;

public class ExercicioL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome,nome2;
		int ano1,mes1,dia1;
		int ano2,mes2,dia2;
		
		nome = JOptionPane.showInputDialog("Digite o primeiro nome");
		dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro nome"));
		mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
		ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
		
		nome2 =  JOptionPane.showInputDialog("Digite o primeiro nome");
		dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro nome"));
		mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
		ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
		
		if(ano1 > ano2) {
			System.out.println(nome + "é a mais velha");
		}
		else if (mes1 > mes2 ){
			System.out.println(nome + "é a mais velha");
		}
		else if(dia1 > dia2) {
			System.out.println(nome + "é a mais velha");
		}
		else {
			System.out.println(nome2 + "é a mais velha");
		}
		
	}

}
