package com.company;

// 4 Pillars of OOPs
// 1. Encapsulation :- All the properties & methods in a class should be wrapped in a single unit, called CLASS.
// 2. Inheritance :-

// PARENT CLASS -> The class properties which are inherit
class A {
    // properties
    int prop1;
    String prop2;
    // constructor :- way to assign values to the class properties
    A(int prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
    // method
    public void display() {
        System.out.println(this.prop1 + "  " + this.prop2);
    }
}

// Example :- If I want to create a complex data (class) -> 1 int, 1 string, 1 byte, 1 float.
// If we extend a class to another class, then you can access all the properties, the constructor & the methods of the
// inherited class.

// CHILD CLASS -> The class inheriting the properties of the other class.
class B {
    char prop3;
    float prop4;
    // constructor
    B(char prop3, float prop4) {
        // parent class' constructor can be accessed and used -> keyword -> super()
        // super(prop1, prop2);
        this.prop3 = prop3;
        this.prop4 = prop4;
    }
    // method
    public void display() {
        // parent class' properties can be accessed
        // System.out.println(this.prop1 + " " + this.prop2 + " " + this.prop3 + " " + this.prop4);
    }
}

//class C extends A, B {
//
//}

//class C extends A {
//    C();
//}



public class InheritanceExample {
    public static void main(String[] args) {
        // When we construct an object --> Memory Allocated in the Heap Memory --> RUN-TIME

        A objA = new A(100, "Object-A");
        objA.display();                                 // 100 Object-A

        // when you are creating the object of the child class, you are also providing the values of the parent class.
        // B objB = new B(10, "Object-B", 'A', 3.14f);
        // objB.display();                                 // 10 Object-B A 3.14
    }
}
