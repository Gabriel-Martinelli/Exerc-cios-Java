package Methods;

public class Loan {
    
    public static int getTwoPortion(){

        return 2;
    }

    public static int getThreePortion(){
        
        return 3;
    }

    public static double getFeeTwo(){

        return 0.3;
    }

    public static double getFeeThree(){

        return 0.45;
    }

    public static void calculate(double value, int portion){
        
        if(portion == 2){
            double finalValue1 = value + (value * getFeeTwo());
            System.out.println("Total: " + finalValue1);
        }

        if(portion == 3){
            double finalValue2 = value + (value * getFeeThree());
            System.out.println("Total: " + finalValue2);
        }
        else{
            System.out.println("Portion number invalid.");
        }
    }

    public static void main(String[] args){
        calculate(100.30,3);
    }
}
