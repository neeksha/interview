package com.company.cloning;

public class MainImmutable {

    public static void main(String[] args){
        Address address=new Address("Noida","India");
        Employee employee=new Employee("Nimit",address);

        String name=employee.getName();

        Address address1=employee.getAddress();
        address1.setCountry("America");

        name="XYZ";

        System.out.println(employee);
    }
}
