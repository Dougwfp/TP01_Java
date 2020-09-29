import java.util.Scanner;

/*
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP02Ex03 {

	public static void main(String[] args) {
		
        Scanner read = new Scanner(System.in);
        char conf = 'S';      
        int tamanho = 0;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int media = 0;
        float positivo = 0.0f;
        float negativo = 0.0f;
        
        while(conf == 'S'){
        tamanho = 0;
        maior = 0;
        menor = 0;
        soma = 0;
        media = 0;
        positivo = 0.0f;
        negativo = 0.0f;
        System.out.println("Digite um valor positivo e menor do que 20 para o tamanho ");
        tamanho = read.nextInt();
        while(tamanho < 0 && tamanho >= 20){
            System.out.println("Digite um valor positivo e menor do que 20 para o tamanho ");
            tamanho = read.nextInt();
        }

        int arrVal[] = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite um valor positivo para posição " + i);
            arrVal[i] = read.nextInt();
            
        }
        
        for(int i = 0; i < tamanho; i++){
            if(i == 0){
                menor = arrVal[i];
            }
            if(arrVal[i] < menor){
                menor = arrVal[i];
            }
            if(arrVal[i] < 0){
                negativo++;
            }
            if(arrVal[i] > 0){
                positivo++;
            }
            soma += arrVal[i];
            if(arrVal[i] > maior){
                maior = arrVal[i];
            }
        }
        media = soma / tamanho;
        positivo = positivo/tamanho;
        negativo = negativo/tamanho;
        System.out.println("o maior valor é:  " + maior);
        System.out.println("o menor valor é:  " + menor);
        System.out.println("a soma dos valores é:  " + soma);
        System.out.println("a media dos valores é:  " + media);
        System.out.println("a pocentagem de valores positivos é:  " + positivo);
        System.out.println("a pocentagem de valores negativos é:  " + negativo);
            
        System.out.println("Deseja Repetir S/N ? ");
        conf = read.next().charAt(0);
        }
        
	}

}
