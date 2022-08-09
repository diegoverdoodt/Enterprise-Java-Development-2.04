package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PersonListTest {
    Person diego = new Person( "Diego Verdoodt", 38, "IT Support");
    PersonList a = new PersonList(diego);

    @BeforeEach
    public void setup() {
        Person diego = new Person( "Diego Verdoodt", 38, "IT Support");
        PersonList a = new PersonList(diego);

    }

    @DisplayName("Nombre en la lista")
    @Test
    public void testPersonListSearchOk(){
        PersonList a = new PersonList(diego);
        assertEquals(diego, a.findByName("Diego Verdoodt"));
    }

    @DisplayName("Nombre no coincide")
    @Test
    public void testPersonListFailSearch(){
        PersonList a = new PersonList(diego);
        Assertions.assertThrows(IllegalArgumentException.class, ()-> a.findByName("Diego ve"));
    }




}
