package Arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args){
        Random random = new Random();

        int[] vetorAleatorio = new int[20];

        for(int i = 0; i < vetorAleatorio.length; i++){
            int numero = random.nextInt(100);
            vetorAleatorio[i] = numero;

        }
        for (int numero : vetorAleatorio) {
            System.out.println(numero);
        }

        System.out.println("Antecessores: ");
        for (int numero : vetorAleatorio) {
            System.out.println(numero - 1);
        }

        System.out.println("Sucessores: ");
        for (int numero : vetorAleatorio) {
            System.out.println(numero + 1);            
        }
    }
    
}
