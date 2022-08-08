package org.example;

public class main {
    public static void main(String[] args) {


        Person diego = new Person("Diego Verdoodt", 38, "IT Support");
        Person aleix = new Person( "Aleix sdf", 32, "Product Manager");
        Person nadine = new Person( "Nadine Ayman", 29, "Sales Support");

        PersonList a = new PersonList(diego);


        a.findByName("Diego Verdoodt");



    }
}
