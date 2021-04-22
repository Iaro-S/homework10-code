package ro.fasttrackit.homework10;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final String name;
    private final List<Person> employees;

    public Company(String name, Person manager) {
        this (name, List.of (manager));
    }

    public Company(String name, List<Person> employees) {
        this.name = name;
        this.employees = new ArrayList<> ();
        this.employees.addAll (employees);
    }

    public List getPerson(String filterName) {
        List result = new ArrayList ();
        for (Person person : employees) {
            if (person.getName ().contains (filterName)) {
                result.add (person);
            }
        }
        return result;
    }

    public Person getManager() {
        for (Person employee : employees) {
            if ("manager".equals (employee.getPosition ())) {
                return employee;
            }
        }
        return null;
    }

    public List getPersonOlder(int minAge) {
        List result = new ArrayList ();

        for (Person person : employees) {
            if (person.getAge () > minAge) {
                result.add (person);
            }
        }
        return result;
    }

    public List getProfession(String profession) {
        List result = new ArrayList ();
        for (Person person : employees) {
            if (person.getPosition ().equals (profession)) {
                result.add (person);
            }
        }
        return result;
    }
}
