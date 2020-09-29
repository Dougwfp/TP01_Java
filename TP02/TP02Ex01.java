import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP02Ex01 {

	public static void main(String[] args) {
		
        Scanner read = new Scanner(System.in);
        
        int val1;
        int val2;
        
        System.out.println("Digite o primeiro valor: ");
        val1 = read.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        val2 = read.nextDouble();
        
        while(val2 < val1){
            System.out.println("O segunda valor deve ser maior do que o primeiro: ");
            System.out.println("Digite o segundo valor: ");
            val2 = read.nextDouble();
        }
        
        System.out.printf("Os valores são: " + val1 + " e " + val2);
		
	}

}
