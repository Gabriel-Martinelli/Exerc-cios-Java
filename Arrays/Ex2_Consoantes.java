package Arrays;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ex2_Consoantes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int countconsoantes = 0;

        int count1 = 0;
        while(count1 < (consoantes.length)){
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                    countconsoantes++;
                    count1++;
                }else{
                    count1++;
                }

        }
        System.out.println("A quantidade de consoantes é: " + countconsoantes);
    }
}