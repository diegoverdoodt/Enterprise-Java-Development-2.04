package org.example;


import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    private Person instance;

    @BeforeEach
    public void setup () { instance =  new Person("Diego Verdoodt", 38, "IT Support");}

    @DisplayName("Entrada de años OK")
    @Test
    public void testsetAgeOk(){
        int age = instance.getAge();
        Assertions.assertEquals(38, age);
    }

    @DisplayName("menos de 0 años")
    @Test
    public void testsetAgeNegativo(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> instance.setAge(-38));
    }

    @DisplayName("sin numero")
    @Test
    public void testsetAgeSinNumero(){
        Assertions.assertThrows(NumberFormatException.class, ()-> instance.setAge(Integer.parseInt("")));
    }

    @DisplayName("Solo un nombre")
    @Test
    public void testSetNadName(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> instance.setName("diego"));
    }



}


