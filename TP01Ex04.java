import java.util.Scanner;

/*
4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex04 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        double base;
        double altura;
        double area;
        
        System.out.println("Digite o valor da base do triângulo: ");
        base = read.nextDouble();
        
        System.out.println("Digite o valor da altura do triângulo: ");
        altura = read.nextDouble();
        
        area = (base*altura)/2;
        
        System.out.printf("A área do triângulo é: " + area);
    }
}