import java.util.Scanner;

/*
15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$). 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex15 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double cotacao, dolares, dolreal;
		
		System.out.println("Digite o valor da cota��o do d�lar: ");
		cotacao = read.nextDouble();
		
		System.out.println("Digite o valor da quantidade em d�lares: ");
		dolares = read.nextDouble();
		
		dolreal = cotacao * dolares;
		
		System.out.println("Digite o valor da quantidade em d�lares: " + dolreal);
		
		
	}

}
