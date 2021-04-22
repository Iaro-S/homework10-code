package ro.fasttrackit.homework10;

import java.util.List;

public class BasketMain {
    public static void main(String[] args) {
        Basket basket = new Basket (List.of (
                "mere",
                "pere",
                "struguri",
                "banana",
                "mere"
        ));
        System.out.println (basket.find ("struguri"));
        System.out.println (basket.find ("portocala"));

        System.out.println ("remove struguri " + basket.remove ("struguri"));
        System.out.println ("remove portocala " + basket.remove ("portocala"));
        System.out.println (basket.find ("struguri"));

        System.out.println (basket.getPosition ("pere"));
        System.out.println (basket.getPositions ("mere"));

        basket.add ("capsuni");
        System.out.println (basket);

        System.out.println (basket.distinct ());
        System.out.println (basket.distinct2 ());

        System.out.println (basket.count ());
    }
}
