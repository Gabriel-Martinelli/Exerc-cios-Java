import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float nota;
        

        System.out.println("Digite a nota: ");
        nota = scan.nextFloat();

        while(nota < 0 | nota > 10){
            System.out.println("Valor incorreto, digite novamente: ");
            nota = scan.nextFloat();
        }
        if(nota >= 0 & nota <= 10){
            String mensagem = String.format("A nota do aluno é: %f", nota);
            System.out.println(mensagem);
        }
    }
}
