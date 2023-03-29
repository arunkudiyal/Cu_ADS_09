package com.company;

abstract class Demo {
    int temp;
    Demo(int temp) { this.temp = temp; }
    public abstract int square();
    public void show() {
        System.out.println(this.temp);
    }
}

class Demo2 extends Demo {
    Demo2() {
        super(100);
    }
    public int square() {
        return 200;
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        //        Demo test = new Demo(100) {
        //            public int square() {
        //                return 200;
        //            }
        //        }
    }
}
