package com.company;

class TestOne {
    int temp;
    TestOne(int temp) { this.temp = temp; }
    public int square() {
        int sq = this.temp * this.temp;
        return sq;
    }
    public void square(String str) {
        System.out.println(str);
    }
    public void display(int demo, String str1) {
        System.out.println(demo);
        System.out.println(str1);
    }
    public void display(String str1, int demo) {
        System.out.println(demo);
        System.out.println(str1);
    }
}

class TestTwo extends TestOne {
    int temp2;
    TestTwo(int temp1, int temp2) {
        super(temp1);
        this.temp2 = temp2; }
    public int square() {
        int sq = this.temp2 * this.temp2;
        return sq;
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        //        TestOne one = new TestOne(10);
        //        System.out.println(one.square());           // 100
        //        one.square("This is a Test String");

        // Upcasting
        TestOne one = new TestTwo(5, 10);
        System.out.println(one.square());

    }
}
