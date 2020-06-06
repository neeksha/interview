package com.company.designpatern;

public class FactoryPerson {

    public static Person getPerson(String name) {
        Person person = null;
        switch (name) {
            case "student":
                person = new Student();
                break;

            case "employee":
                person = new Employee();
                break;
        }

        return person;
    }
}
