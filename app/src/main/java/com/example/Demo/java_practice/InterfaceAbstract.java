package com.example.Demo.java_practice;

interface DemoInterface {
    void displayName();
}
public class InterfaceAbstract implements DemoInterface {
    public void displayName() {
        System.out.println("Helllooo");
    }

    public static void main(String[] args) {
        InterfaceAbstract ib = new InterfaceAbstract();
        ib.displayName();
    }
}
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class A7 implements Printable,Showable{
    public void print() {
        System.out.println("Hello");
    }
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}

