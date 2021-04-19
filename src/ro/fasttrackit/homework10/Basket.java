package ro.fasttrackit.homework10;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    public static void main(String[] args) {
        System.out.println (fruits);
        System.out.println (find ("pere"));
        System.out.println (find ("cirese"));

        fruits.add ("portocale");
        System.out.println (fruits);

        System.out.println (position ("prune"));
        System.out.println (position ("cirese"));

        fruits.remove ("pere");
        System.out.println (fruits);
    }

    private static final List<String> fruits = new ArrayList<> (List.of ("mere",
            "pere",
            "prune",
            "struguri",
            "zmeura",
            "mere",
            "capsuni",
            "pere"));

    public static int position(String fruit) {
        return fruits.indexOf (fruit);
    }

    public static boolean find(String fruit) {
        for (String myFruit : fruits) {
            if (fruit.equals (myFruit)) {
                return true;
            }
        }
        return false;
    }
}
