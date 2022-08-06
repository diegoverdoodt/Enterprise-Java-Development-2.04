package org.example;

public class Person {

    private String id;
    private String name;
    private int age;
    private String occupation;

    public Person(String id, String name, int age, String occupation) {
        setId(id);
        setName(name);
        setAge(age);
        setOccupation(occupation);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 0){
            throw new IllegalArgumentException("La edad no puede ser menor de 0");
        } else if (age == Integer.parseInt("")){
            throw new NumberFormatException("La edad debe de ser un número");
        }else {
            this.age = age;
        }
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
