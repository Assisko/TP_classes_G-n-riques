package tp.generiques;

public class MainPaire {
    public static void main(String[] args)
    {

        // 1. Créer une paire (Alice, 42) et l'afficher
        Paire<String, Integer> p1 = new Paire<>("Alice", 42);
        System.out.println(p1);  // → (Alice, 42)

        // 2. Inverser et afficher
        Paire<Integer, String> p2 = Paire.inverser(p1);
        System.out.println(p2);  // → (42, Alice)

        // 3. Créer une paire (3.14, true) et afficher les types
        Paire<Double, Boolean> p3 = new Paire<>(3.14, true);
        System.out.println(p3.getPremier().getClass().getSimpleName()
                + " — "
                + p3.getSecond().getClass().getSimpleName());


    }
}