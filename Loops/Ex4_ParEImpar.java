package Loops;
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int quantidade;
        int countPar = 0;
        int countImpar = 0;

        System.out.println("Digite a quantidade de números para análise: ");
        quantidade = scan.nextInt();
        
        int i = 0;
        while(i < quantidade){

            if(i == 0) i = i + 1;

            if(i % 2 == 0) countPar++;
        
            else countImpar++;

            i = i + 1;

        }
        System.out.println("Quantidade de pares: " + countPar);
        System.out.println("Quantidade de ímpares: " + countImpar);
    }
    
}
