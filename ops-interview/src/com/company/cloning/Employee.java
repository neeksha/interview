package com.company.cloning;

import java.util.List;

public final class Employee implements Cloneable{

    private final String name;
    private final Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress()  {
        Address newAddress=new Address();
        newAddress.setCountry(this.address.getCountry());
        newAddress.setCity(this.address.getCity());
        return newAddress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}


