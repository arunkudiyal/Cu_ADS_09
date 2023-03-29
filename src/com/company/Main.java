package com.company;

class Node {
    int key;
    float num = 3.14f;
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int value = 100;

        // Comparable
        String name1 = "Hello";
        String nameTwo = "Hello";

        // Serializable
        String name2 = new String("Bye");
        Node myNode = new Node();

        // CharSequence
        char[] name3 = {'O', 'K'};

        System.out.println(name2);
        System.out.println(myNode);
        //        System.out.println(name1 + " " + name2 + " " + name3);
        //        System.out.println(name3[0] + "" + name3[1]);
        //
        //        name3[0] = 'H';
        //        name3[1] = 'i';
        //        System.out.println(name3[0] + "" + name3[1]);

        // System.out.println(name1[0]);
    }
}