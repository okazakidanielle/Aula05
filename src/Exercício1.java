import java.util.Scanner;
public class Exerc�cio1 {
	
	public static void main (String[] args) {
		
		/*receba um n�mero inteiro do usu�rio e calcule e exiba a tabuada deste n�mero*/
		
		int numero, resultado;
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Por favor, digite o valor para o qual voce deseja obter a tabuada ?");
		numero = leitor.nextInt();
		
		for (int i=1; i <=10; i++) {
			
		
		resultado = numero * i;
		
		System.out.println(numero + " X " + i + " = " + resultado);
		
		}
	
		leitor.close();
	}
	
	

}
