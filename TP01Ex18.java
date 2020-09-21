import java.util.Scanner;

/*
18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex18 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, dinheiro, troco;
		
		System.out.println("Digite o valor do produto 1: ");
		p1 = read.nextDouble();
		
		System.out.println("Digite o valor do produto 2: ");
		p2 = read.nextDouble();
		
		System.out.println("Digite o valor do produto 3: ");
		p3 = read.nextDouble();
		
		System.out.println("Digite o valor do produto 4: ");
		p4 = read.nextDouble();
		
		System.out.println("Digite o valor do produto 5: ");
		p5 = read.nextDouble();
		
		System.out.println("Digite o valor do dinheiro: ");
		dinheiro = read.nextDouble();
		
		troco = dinheiro - (p1 + p2 + p3 + p4 + p5);
		
		System.out.println("Troco em reais: " + troco);

	}

}
