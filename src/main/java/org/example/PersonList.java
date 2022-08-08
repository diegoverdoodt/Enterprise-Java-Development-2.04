package org.example;

import java.util.HashMap;
import java.util.List;

public class PersonList {

    private List<Person> personList;
    public PersonList(Person person){
        personList.add(person);
    }

    public Person findByName(String name){
        for (Person p : personList) {
            if (name.equals(p.getName())){
               return p;
            } else {
                return null;
            }
        }
    return null;
    }
}
