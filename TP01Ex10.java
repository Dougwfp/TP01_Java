import java.util.Scanner;

/*
10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex10 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double cel, fah;
		
		System.out.println("Digite o valor da temperatura em Celsius: ");
		cel = read.nextDouble();
		
		fah = (cel * (9/5)) + 32;
		
		System.out.println("Valor da temperatura em Fahrenheit � igual a: " + fah);
		
	}

}
