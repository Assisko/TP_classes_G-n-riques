package tp.generiques;

import java.util.Arrays;
import java.util.List;

public class MainStats {
    public static void main(String[] args)
    {
        // list de notes
        List<Integer> notes = Arrays.asList(10, 14, 18, 12, 16);
        Stats<Integer> stats = new Stats<>(notes);

        System.out.println("Moyenne   : " + stats.moyenne());   // 14.0
        System.out.println("Min       : " + stats.min());       // 10
        System.out.println("Max       : " + stats.max());       // 18
        System.out.println("Écart-type: " + stats.ecartType()); // ~2.97
        System.out.println("Somme     : " + Stats.somme(notes));// 70.0

        // Stats<String> s = new Stats<>(...); // ERREUR de compilation : String n'est pas Number
    }
}