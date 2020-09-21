import java.util.Scanner;

/*
13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
(em s) que serão digitados. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex13 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double vf, vi, a, t;
		
		System.out.println("Digite o valor da velocidade inicial: ");
		vi = read.nextDouble();
		
		System.out.println("Digite o valor da acelera��o: ");
		a = read.nextDouble();
		
		System.out.println("Digite o valor do tempo: ");
		t = read.nextDouble();
		
		vf = (vi + (a * t)) * 3.6;
		
		System.out.println("Velocidade final � igual a: " + vf);

	}

}
