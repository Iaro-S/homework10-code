package ro.fasttrackit.homework10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Flowers {
    public static void main(String[] args) {
        getAll ();
        Collection<String> bouquet = new ArrayList<> ();

        bouquet.add ("trandafir");
        bouquet.add ("lalele");
        bouquet.add ("crizanteme");
        bouquet.add ("trandafir");
        bouquet.add ("trandafir");
        System.out.println (bouquet);

        bouquet.remove ("trandafir");
        System.out.println (bouquet);

    }

    private static void getAll() {
    }
}
/*
2) Create an objects that model buquet of flowers. Each flower has to be unique. We don't care how the flowers are ordered

- getAll(): Collection<String>  - returns all the flowers

- add(String)    - adds a flower (remember to keep them unique)

- remove(String) - removes a flower
 */