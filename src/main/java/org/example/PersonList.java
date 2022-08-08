package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PersonList {

    private List<Person> personList = new ArrayList<>();
    public PersonList(Person person){
        personList.add(person);
    }

    public Person findByName(String name){
        for (Person p : personList) {
            if (name.equals(p.getName())){
                System.out.println("El nombre buscado esta en la lista");
               return p;
            } else {
                return null;
            }
        }
    return null;
    }
}
