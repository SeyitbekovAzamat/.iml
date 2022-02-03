package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i = i + 1) {
            System.out.println("Java " + i);
        }
        for (int i = 1; i <= 10; i++) { // i = i + 1 => i++ инкрементация
            System.out.println("5 x " + i + " = " + 5 * i);
        }
        System.out.println("__________________");
        for (int i = 10; i >= 1; i--) { // i = i - 1 => i-- декрементация
            System.out.println("9 x " + i + " = " + 9 * i);
        }
        System.out.println("__________________");
        for (int i = 10; i >= 1; i = i - 2) { // i = i - 2 => i-=2, i = i * 9 => i*=9
            System.out.println("7 x " + i + " = " + 7 * i);
        }

        String str = "#";
        while (str.length() < 5) { // str.length() - кол-во символов строки
            System.out.println(str);
            str = str + "#";
        }
        int a = 1;
        while (a <= 3) {
            System.out.println(a);
            a++;
        }

        String[] robots = new String[7];
        System.out.println(Arrays.toString(robots));
        for (int i = 0; i < robots.length; i++) {
            robots[i] = "Robot00" + (i + 1);
        }
        System.out.println(Arrays.toString(robots));

        String[] students = {"John", "Jack", "Julie"};
        for (String element : students) {
            System.out.println("Hi " + element);
        }
        int[] digits = {90, -16, 88, -32, 461};
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 0) {
                break; // экстренно прекращает работу цикла
            }
            System.out.println(digits[i]);
        }
        System.out.println("+++++++++++++++");
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < 0) {
                continue; // экстренно прекращает текущий круг
            }
            System.out.println(digits[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Внешний цикл " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("Внутренний цикл " + j);
            }
        }
    }
}
