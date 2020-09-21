import java.util.Scanner;

/*
14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex14 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		double aresta, raio, volume;
		
		System.out.println("Digite o valor aresta do quadrado: ");
		aresta = read.nextDouble();
		
		System.out.println("Digite o valor do raio da esfera: ");
		raio = read.nextDouble();
		
		volume = (aresta * aresta * aresta) - ((4/3) * 3.14 * (raio * raio * raio));
		
		System.out.println("Espa�o livre � igual a: " + volume);
		
	}

}
