package com.company.designpatern;

import com.company.designpatern.singleton.PrimeMinistor;

public class MainFactoryPattern {

    public static void main(String[] args) {
//        Person person = FactoryPerson.getPerson("student");
//        person.getName();
        PrimeMinistor primeMinistor= PrimeMinistor.getPrimeMinistor();
    }
}
