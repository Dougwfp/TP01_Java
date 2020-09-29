import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP02Ex02 {

	public static void main(String[] args) {
		
        Scanner read = new Scanner(System.in);
        int arrVal[] = new int[10];
        int maior = 0;
        int soma = 0;
        int media = 0;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um valor positivo para posição " + i);
            arrVal[i] = read.nextInt();
            while(arrVal[i] < 0){
                System.out.println("Digite um valor positivo para posição " + i);
                arrVal[i] = read.nextInt();
            }
        }
        
        for(int i = 0; i < 10; i++){
            soma += arrVal[i];
            if(arrVal[i] > maior){
                maior = arrVal[i];
            }
        }
        media = soma / 10;
        System.out.println("o maior valor é:  " + maior);
        System.out.println("a soma dos valores é:  " + soma);
        System.out.println("a media dos valores é:  " + media);
	}

}
