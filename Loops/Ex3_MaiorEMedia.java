package Loops;
import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int soma = 0;
        int maior = 0;

        int i = 0;
        while(i < 5){
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;

            if(numero > maior) maior = numero;

            i = i + 1;

        }

        float media = soma / 5F;

        String mensagem = String.format("O maior número é %d, e a média é %f", maior, media);
        System.out.println(mensagem);
    }
}
