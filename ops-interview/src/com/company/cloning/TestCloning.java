package com.company.cloning;

public class TestCloning {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address=new Address("Noida","India");
        Person person = new Person("Deeksha",address);

        Person clonePerson = (Person) person.clone();

        person.getAddress().setCity("Bareilly");

        System.out.println(person);
        System.out.println(clonePerson);



    }
}
