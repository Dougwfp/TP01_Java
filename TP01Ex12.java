import java.util.Scanner;

/*
12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex12 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double altura, raio, volume;
		
		System.out.println("Digite o valor da altura do cone: ");
		altura = read.nextDouble();
		
		System.out.println("Digite o valor do raio do cone: ");
		raio = read.nextDouble();
		
		volume = (3.14 * (raio * raio) * altura) / 3;
		
		System.out.println("O volume do cone � igual a: " + volume);

	}

}
