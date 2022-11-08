package Loops;
import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num;
        int mult = 1;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        while(num > 1){
            mult = mult * num;
            num--;

                if(num == 1){
                System.out.println("O fatorial é: " + mult);
                }
            }
        }
    }

