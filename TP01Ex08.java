import java.util.Scanner;

/*
8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros. 
Douglas Willian cb3005348
João Vitor Gino cb3005488
*/
public class TP01Ex08 {
    
        public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        double milha1;
        double km;
        double milha2=1852;
        
        System.out.println("Digite a quantidade de milhas marítimas a serem convertidas: ");
        milha1 = read.nextDouble();
        
        km = milha1*milha2;
        
        System.out.println("Em quilômetros, " + milha1 + "milhas marítimas equivalem à " + km + " Km");
    }
}