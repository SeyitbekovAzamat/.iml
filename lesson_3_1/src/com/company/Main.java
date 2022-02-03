package com.company;

public class Main {
    public static int globalNumber = 999;

    public static void test(int num) {
        System.out.println(num);
        //System.out.println(a);
        int a = 8;
        System.out.println(a);
        if (a > 0) {
            System.out.println(a);
            int b = 7;
            System.out.println(b);
            System.out.println(globalNumber);
        }
        //System.out.println(b);
        System.out.println(globalNumber);
    }


    public static void main(String[] args) {
        //System.out.println(num);
        System.out.println(globalNumber);
    }
}
