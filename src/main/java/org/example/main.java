package org.example;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {


        Person diego = new Person("Diego Verdoodt", 38, "IT Support");
        Person aleix = new Person( "Aleix sdf", 32, "Product Manager");
        Person nadine = new Person( "Nadine Ayman", 29, "Sales Support");

        PersonList a = new PersonList(diego);


        //a.findByName("Diego Verdot");


        Person aleix2 = aleix.clone();

        aleix.equals(aleix, aleix2);

        aleix2.toFile(aleix);

    }
}
