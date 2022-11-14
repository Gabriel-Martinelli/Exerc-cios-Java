package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.sampled.SourceDataLine;

public class ex2_rainbow {
    public static void main(String[] args){
        //List<String> colors = List.of("Azul","Azul escuro","Verde","Vermelho", "Amarelo", "Laranja", "Roxo");

        Set<String> colors = new TreeSet<>(Arrays.asList("Azul","Azul escuro","Verde","Vermelho", "Amarelo", "Laranja", "Roxo"));

        System.out.println("Quantity:" + colors.size());
        System.out.println(colors);
        



    }
}
    

