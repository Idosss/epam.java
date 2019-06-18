package kz.epam.gabdollin.practice.lectionTasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTest{

    @Test
    public void shouldReturnHelloWorld() {
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus() {
        Person person = new Person();
        assertEquals("Hello World", person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(2,person2.numberOfPersons());
    }




}