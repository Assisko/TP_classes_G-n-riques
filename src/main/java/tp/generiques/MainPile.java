package tp.generiques;

public class MainPile {
    public static void main(String[] args) {
        Pile<Integer> pile = new Pile<>();

        // Empiler 1, 2, 3, 4, 5
        pile.empiler(1);
        pile.empiler(2);
        pile.empiler(3);
        pile.empiler(4);
        pile.empiler(5);

        System.out.println("Pile : " + pile);          // [5  4  3  2 1]

        // Dépiler le sommet
        int val = pile.depiler();
        System.out.println("Dépiléé : " + val);        // 5
        System.out.println("Après dépilage : " + pile);// [4  3  2  1]

        // Pile inversée (originale non modifiée)
        Pile<Integer> inversee = PileUtils.inverser(pile);
        System.out.println("Inversée : " + inversee);  // [1  2  3  4]
        System.out.println("Originale : " + pile);     // [4  3  2  1]
    }
}