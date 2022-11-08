package Arrays;

import java.util.Random;

public class Ex4_Matriz {
    public static void main(String[] args){
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < 4; i ++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = random.nextInt(30);
                System.out.println(matriz[j][i]);
            }
        }
        

    }
    
}
