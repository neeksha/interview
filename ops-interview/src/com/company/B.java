package com.company;

public class B extends A {

    int x=1;
    public B(){
        System.out.println("Hi constructor B");
    }
    {
        System.out.println("Hi init block ");
    }
    {
        System.out.println("Hi init2 block ");
    }
    static {
        System.out.println("Hi static init block  ");
    }
    static {
        System.out.println("Hi static init 2block  ");
    }

    public int getX() {
        return x;
    }

    @Override
    public void display() {
        System.out.println("Hello B ");
    }
}
