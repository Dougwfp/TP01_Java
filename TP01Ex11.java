import java.util.Scanner;

/*
11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex11 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double diametro, raio, area;
		
		System.out.println("Digite o valor do di�metro do c�rculo: ");
		diametro = read.nextDouble();
		
		raio = diametro / 2;
		
		area = 3.14 * (raio * raio);
		
		System.out.println("O valor do di�metro � igual a: " + area);

	}

}
