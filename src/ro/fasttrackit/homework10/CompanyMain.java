package ro.fasttrackit.homework10;

import java.util.List;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company ("Fasttrackit", List.of (
                new Person ("Florin", 40, "manager"),
                new Person ("Popescu Ana", 26, "hr"),
                new Person ("Darius", 40, "trainer"),
                new Person ("Ionescu Ana", 21, "secretary")
        ));

        System.out.println ("Manager: " + company.getManager ());
        System.out.println ("Older then: " + company.getPersonOlder (30));

        System.out.println ("People on position trainer: " + company.getProfession ("trainer"));

        System.out.println ("People with name Ana" + company.getPerson ("Ana"));
    }
}

