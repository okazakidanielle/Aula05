import java.util.Scanner;


public class Exerc�cio2 {
	
public static void main (String[] args) {
		
	
		Scanner leitor = new Scanner(System.in);
		
		double media;
		double nota;
		int totalInferior=0, totalSuperior=0;
		
		
		
		System.out.println("Por favor, informe a m�dia de notas dessa turma:");
		media = leitor.nextDouble();
			
		
		
		for (int i=0;i<50;i++) {
			
			System.out.println("Por favor, informe a nota do " + (i+1) + "� aluno");
			nota= leitor.nextDouble();
			
			
			if (nota>=media) {
				
				totalSuperior = totalSuperior + 1;
			}else {
				
				totalInferior = totalInferior + 1;
			}
			
					
		}
				System.out.println("Para a turma informada, um total de " + totalSuperior + " alunos obtiveram nota igual ou acima da m�dia, enquanto um total de " + totalInferior + " alunos obtiveram nota abaixo da m�dia.");
		
		leitor.close();

	}

}