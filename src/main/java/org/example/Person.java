package org.example;

public class Person {

    private int id = 0;
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        setId(id);
        setName(name);
        setAge(age);
        setOccupation(occupation);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id +1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name.split(" ").length < 2){
            throw new IllegalArgumentException("El nombre debe estar formado por el nombre y el apellido");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age < 0){
            throw new IllegalArgumentException("La edad no puede ser menor de 0");
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

    public Person clone (Person person){

        person.

        return result;
    }
}
