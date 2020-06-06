package com.company;

public class Main {

    public static void main(String[] args) {
        B b=new B();
        A a=new A();
        A ab=new B();


//        System.out.println(a.x);//10
//        System.out.println(ab.x);//10
//        System.out.println(b.x);//1

        System.out.println(a.getX());//10
        System.out.println(b.getX());//1
        System.out.println(ab.getX());//1

//        a.display();//A display
//        ab.display();//b.display
//        b.display();//B display
    }
}
