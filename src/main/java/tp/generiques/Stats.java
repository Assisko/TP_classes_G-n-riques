package tp.generiques;

import java.util.List;

public class Stats<T extends Number> {

    private List<T> valeurs;

    public Stats(List<T> valeurs) {
        this.valeurs = valeurs;
    }
//moyenne
    public double moyenne() {
        double somme = 0;
        for (T v : valeurs) somme += v.doubleValue();
        return somme / valeurs.size();
    }
// pour min
    public T min() {
        T min = valeurs.get(0);
        for (T v : valeurs) {
            if (v.doubleValue() < min.doubleValue()) min = v;
        }
        return min;
    }
//pour max
    public T max() {
        T max = valeurs.get(0);
        for (T v : valeurs) {
            if (v.doubleValue() > max.doubleValue()) max = v;
        }
        return max;
    }
// l'equart type
    public double ecartType() {
        double moy = moyenne();
        double somme = 0;
        for (T v : valeurs) {
            double diff = v.doubleValue() - moy;
            somme += diff * diff;
        }
        return Math.sqrt(somme / valeurs.size());
    }

    // Méthode statique bornée : somme tous les éléments
    public static <T extends Number> double somme(List<T> liste) {
        double total = 0;
        for (T v : liste) total += v.doubleValue();
        return total;
    }
}