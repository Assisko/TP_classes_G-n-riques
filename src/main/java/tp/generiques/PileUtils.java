package tp.generiques;
/**
 * Retourne une nouvelle pile qui est l'inversion de la pile donnée.
 * La pile d'origine ne doit PAS être modifiée.
 */
public class PileUtils {

    // Retourne une nouvelle pile inversée SANS modifier l'originale
    public static <T> Pile<T> inverser(Pile<T> source) {
        Pile<T> temp    = new Pile<>();
        Pile<T> resultat = new Pile<>();

        // Vider source dans temp (inverse une fois)
        Pile<T> copie = copierPile(source);
        while (!copie.estVide()) {
            temp.empiler(copie.depiler());
        }
        // Vider temp dans resultat (inverse une deuxième fois = ordre original inversé)
        while (!temp.estVide()) {
            resultat.empiler(temp.depiler());
        }
        return resultat;
    }

    // Copie une pile sans la modifier
    private static <T> Pile<T> copierPile(Pile<T> source) {
        Pile<T> temp   = new Pile<>();
        Pile<T> copie  = new Pile<>();
        Pile<T> clone  = new Pile<>();

        // Vider dans temp
        Pile<T> tmp2 = new Pile<>();
        // On recrée une copie proprement
        //  on utilise toString...
        // On empile dans temp en vidant source dans temp
        // Puis on remet dans source ET dans copie
        while (!source.estVide()) {
            T val = source.depiler();
            temp.empiler(val);
        }
        while (!temp.estVide()) {
            T val = temp.depiler();
            source.empiler(val);  // remet dans source
            copie.empiler(val);   // copie aussi
        }
        // Maintenant source et copie sont dans le bon ordre
        // Mais on a vidé copie dans le mauvais ordre, on réinverse
        while (!copie.estVide()) {
            clone.empiler(copie.depiler());
        }
        return clone;
    }
}