package Methods;
public class be_Polite {
    public static void time(int hour){
        if(hour >= 6 & hour < 12){
            System.out.println("Good morning!");
        }

        if(hour > 12 & hour <= 18){
            System.out.println("Good afternoon!");
        }

        if(hour > 18 & hour < 24 | hour < 6){
            System.out.println("Good night!");
        }
    }

    public static void main(String[] args){
        time(3);
    }
}
