package org.example;

public class Person {

    private int id;
    private static int idx = 1;
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        setId(idx);
        setName(name);
        setAge(age);
        setOccupation(occupation);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        idx++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (name.toLowerCase().split(" ").length < 2){
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

    public Person clone (){
        Person result = new Person (name, age, occupation);
        result.setIdNew(id);
        return result;
    }

    public void setIdNew(int id) {
        this.id = id + 200;
        idx++;
    }

    //@Override
    public void equals (Person person1, Person person2){
        if (person1.getName() == (person2.getName()) && person1.getAge() == (person2.getAge()) && person1.getOccupation() == person2.getOccupation()){
            System.out.println("Los usuarios son iguales.");
        }
    }
}
