package tp.generiques;

public class MainPaire {
    public static void main(String[] args) {
        // 1. Crée une paire et l'affiche
        Paire<String, Integer> p1 = new Paire<>("Alice", 42);
        System.out.println(p1); // (Alice, 42)

        // 2. Inverse et affiche
        Paire<Integer, String> p2 = Paire.inverser(p1);
        System.out.println(p2); // (42, Alice)

        // 3. Paire (3.14, true) avec les types
        Paire<Double, Boolean> p3 = new Paire<>(3.14, true);
        System.out.println(p3.getPremier().getClass().getSimpleName()); // Double
        System.out.println(p3.getSecond().getClass().getSimpleName());  // Boolean
    }
}