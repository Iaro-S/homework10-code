package ro.fasttrackit.homework10;

import java.util.*;

public class Flowers {
    public static void main(String[] args) {

        System.out.println (bouquet);
        addFlower ("Rose");
        addFlower ("Gladiolus");
        System.out.println (bouquet);
        removeFlower ("Gladiolus");
        removeFlower ("Anemone");
        System.out.println (bouquet);
        addFlower ("Anemone");
        System.out.println (bouquet);
        System.out.println ("get all: " + getAll ());
    }

    static Collection<String> bouquet = new ArrayList<> (List.of ("Tulip ",
            "Orchid",
            "Hyacinth ",
            "Gladiolus"));

    private static void addFlower(String flower) {
        if (!bouquet.contains (flower)) {
            bouquet.add (flower);
        } else {
            System.out.println ("The flower is already in bouquet!");
        }
    }

    private static Collection<String> getAll() {
        return bouquet;
    }

    private static void removeFlower(String flower) {
        if (!bouquet.contains (flower)) {
            bouquet.remove (flower);
        } else {
            System.out.println ("Flower not found in bouquet,nothing to remove!");
        }
    }
}