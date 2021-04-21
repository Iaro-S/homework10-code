package ro.fasttrackit.homework10;

import java.util.*;

public class Basket {
    public static void main(String[] args) {
        System.out.println ("Basket content:" + fruits);
        System.out.println ("Fruit found in basket: " + findFruits ("pere"));
        System.out.println ("Fruit found in basket: " + findFruits ("cirese"));

        System.out.println ("\n" + fruits);
        System.out.println ("Fruit is on position: " + position ("prune"));
        System.out.println ("Fruit is on position: " + position ("cirese"));

        System.out.println ("\n" + "Fruit found an removed from basket: " + removeFruits ("pere"));
        System.out.println ("Fruit found an removed from basket: " + removeFruits ("cirese"));
        System.out.println ("Basket content after removal: " + fruits);

        addFruits ("banane");
        System.out.println ("\n" + "Basket content after addition: " + fruits);
        addFruits ("struguri");
        addFruits ("banane");
        System.out.println ("\n" + "Basket content" + fruits);
        System.out.println ("Unique basket content" + distinct (fruits));

        System.out.println ("\n" + "Basket contains " + countFruits () + " fruits.");
        System.out.println ("\n" + "Basket contains " + customCountFruits () + " fruits.");
    }

    private static final List<String> fruits = new ArrayList<> (List.of ("mere",
            "pere",
            "prune",
            "struguri",
            "zmeura",
            "mere",
            "capsuni",
            "pere"));

    public static boolean findFruits(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals (myFruit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeFruits(String fruit) {
        if (findFruits (fruit)) {
            fruits.remove (fruit);
            return true;
        }
        return false;
    }

    public static int position(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals (myFruit)) {
                return fruits.indexOf (fruit);
            }
        }
        return -1;
    }

    public static Set<String> distinct(Collection<String> fruits) {
        Set<String> distinctBasket = new HashSet<> ();
        for (String myFruit :
                fruits) {
            distinctBasket.add (myFruit);
        }
        return distinctBasket;
    }

    public static String addFruits(String fruit) {
        fruits.add (fruit);
        return String.valueOf (fruits);
    }

    public static int countFruits() {
        return fruits.size ();
    }

    public static int customCountFruits() {
        int count = 0;
        for (String myFruit : fruits) {
            count++;
        }
        return count;
    }
}
