import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP02Ex08 {

	public static void main(String[] args) {
		
       Scanner read = new Scanner(System.in);
        int arrVal[][] = new int[3][4];
        int arrVal2[][] = new int[3][4];
        int mult = 0;
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("digite o valor da posição " + i + " " + j);
                arrVal[i][j] = read.nextInt();
            }
        }
        System.out.println("digite o valor do multiplicador ");
        mult = read.nextInt();
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                arrVal2[i][j] = arrVal[i][j] * mult;
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arrVal[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arrVal2[i][j]);
            }
            System.out.println("");
        }
        
	}

}
