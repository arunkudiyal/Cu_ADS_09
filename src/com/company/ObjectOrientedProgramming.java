package com.company;

// Class -> It's an independent entity.
// Class -> A template which helps you create real-life entities (object).
// Class -> It is nothing but a complex data-type
class Person {
    String name;
    int age;
    boolean isAdult;

    // Constructor --> Initialises (assigning value) the properties of the class
    // 2 types -> Default Constructors (which do not have arguments) 2. Parameterised Constructor
    Person(String name, int age, boolean isAdult) {
        // this.classProp = value;
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }
}

class ObjectOrientedProgramming {
    public static void main(String[] args) {
        // String str | Node head;
        // Reference Variable
        Person person;                      // declaration
        // person = new Person();              // initialization
        // System.out.println(person.name);

        // Create an Object
        // NOTE -> Name of the constructor & name of the class are same
        // Syntax --> ClassName objectName = new Constructor()

        // String str = "";
        Person person1 = new Person("Person - One", 23, true);
        // When you create an object, there are certain default values which are
        // assigned to the props by JVM.
        // short, byte, int, long = 0
        // float, double = 0.0
        // String, char = null
        // boolean = false
        System.out.println(person1.name + " " + person1.age + " " + person1.isAdult);   // null 0 false

        person1.name = "Person One";
        person1.age = 20;
        person1.isAdult = true;

        System.out.println(person1.name + " " + person1.age + " " + person1.isAdult);   // Person One 20 true
    }
}
