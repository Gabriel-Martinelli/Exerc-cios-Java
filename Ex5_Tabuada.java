import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num;
        int i = 1;
        int mult;

        System.out.println("Digite um numero");
        num = scan.nextInt();

        while(i <= 10){
            mult = i * num;
            System.out.println(mult);
            i++;
        }
    }
    
}
