package Arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args){
        
        int[] vetor = {1, 2, 3, 4, 5, 6};
        System.out.println(vetor);
        
        int count = 0;
        while(count < vetor.length){
            System.out.println(vetor[count] + " ");
            count++;
        }
        System.out.println("\n");
        for(int i = (vetor.length - 1); i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }


    
}
