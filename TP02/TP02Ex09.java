import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP02Ex09 {

	public static void main(String[] args) {
			
       Scanner read = new Scanner(System.in);
        
        int tam1 = 0;
        int tam2 = 0;
        
        
        System.out.println("Digite um valor positivo e menor do que 10 para o tamanho 1");
        tam1 = read.nextInt();
        while(tam1 < 0 && tam1 >= 10){
            System.out.println("Digite um valor positivo e menor do que 10 para o tamanho 1");
            tam1 = read.nextInt();
        }
        
        System.out.println("Digite um valor positivo e menor do que 10 para o tamanho 2");
        tam2 = read.nextInt();
        while(tam2 < 0 && tam2 >= 10){
            System.out.println("Digite um valor positivo e menor do que 10 para o tamanho 2");
            tam2 = read.nextInt();
        }
        
        int arrVal[][] = new int[tam1][tam2];
        int arrVal2[][] = new int[tam2][tam1];
        
        for(int i = 0; i < tam1; i++){
            for(int j = 0; j < tam2; j++){
                System.out.println("digite o valor da posição " + i + " " + j);
                arrVal[i][j] = read.nextInt();
            }
        }
        
        for(int i = 0; i < tam2; i++){
            for(int j = 0; j < tam1; j++){
                arrVal2[i][j] = arrVal[j][i];
            }
        }
        
        for(int i = 0; i < tam1; i++){
            for(int j = 0; j < tam2; j++){
                System.out.print(arrVal[i][j]);
            }
            System.out.println("");
        }
        
        for(int i = 0; i < tam2; i++){
            for(int j = 0; j < tam1; j++){
                System.out.print(arrVal2[i][j]);
            }
            System.out.println("");
        }
        
        
        
	}

}
