package tp.generiques;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Pile<T> {

    private List<T> elements = new ArrayList<>();

    // j'ajoute un élément au sommet
    public void empiler(T element) {
        elements.add(element);
    }

    // Retire et je  retourne le sommet il ya erreur si vide
    public T depiler() {
        if (estVide()) throw new NoSuchElementException("Pile vide !");
        return elements.remove(elements.size() - 1);
    }

    // Lit le sommet sans le retirer
    public T sommet() {
        if (estVide()) throw new NoSuchElementException("Pile vide !");
        return elements.get(elements.size() - 1);
    }

    public boolean estVide() { return elements.isEmpty(); }

    public int taille() { return elements.size(); }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = elements.size() - 1; i >= 0; i--) {
            sb.append(elements.get(i));
            if (i > 0) sb.append(" | ");
        }
        sb.append("]");
        return sb.toString();
    }
}