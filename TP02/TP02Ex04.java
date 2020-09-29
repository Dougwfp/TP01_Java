import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP02Ex04 {

	public static void main(String[] args) {
		
       Scanner read = new Scanner(System.in);
        int arrVal[][] = {{3,4,5},{3,5,6}};

        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arrVal[i][j]);
            }
            System.out.println("");
        }
	}

}
