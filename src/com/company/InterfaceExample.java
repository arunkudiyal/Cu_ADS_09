package com.company;

interface P1 {
    int p1 = 50;
    String p2 = "ParentOne";
    public void display();
}

interface P2 {
    int p3 = 100;
    String p4 = "Parent Two";
    public void display();
    // public void show();
}

//interface C extends P1, P2 {
//
//}

class C implements P1, P2 {
    char p5;
    public void display() {
        System.out.println("Printing from the Children");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

    }
}
