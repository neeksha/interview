package com.company.cloning;

import javax.print.DocFlavor;

public class Person implements Cloneable {
    String name;
    Address address;

    public Person() {
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Address address = (Address) this.address.clone();
        Person person = (Person) super.clone();

        person.setAddress(address);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
