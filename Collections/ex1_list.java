package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1_list {
    public static void main(String[] args){
        List<Double> temperature = new ArrayList<Double>();
        List<String> months = List.of("January", "February", "March", "April", "May", "June");
        Scanner scan = new Scanner(System.in);

        
        int i = 0;
        while(i < 6){
            System.out.println("Type an average temperature, in Celsius Degrees: ");
            double num = scan.nextInt();
            temperature.add(num);
            i++;
        }

        System.out.println(temperature);

        double sum_temperature = 0;
        int j = 0;
        while(j < 6){
            sum_temperature = sum_temperature + temperature.get(j);
            j++;
        }

        System.out.println("Average temperature: " + sum_temperature / 5);

        int k = 0;
        while(k < 6){
            if(temperature.get(k) > sum_temperature / 5){
                System.out.println("In " + months.get(k) + ", the temperature is above the average " + "("+ temperature.get(k) +").") ;
                k++;
            }
            else{
                k++;
            }
        }
    }
}
