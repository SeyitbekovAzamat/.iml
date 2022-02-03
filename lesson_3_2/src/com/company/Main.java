package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {71, 8, -19, 41, 90};
        System.out.println(numbers[2]);
        numbers[2] = 47;
        System.out.println(numbers[2]);
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        //numbers[7] = 888;
        System.out.println(Arrays.toString(numbers));
        double[] digits = new double[3];
        System.out.println(Arrays.toString(digits));
        digits[0] = 5.14;
        System.out.println(Arrays.toString(digits));

        digits = new double[5];
        System.out.println(Arrays.toString(digits));

        int[][] table2D = new int[4][3];
        table2D[1][2]=36;
        System.out.println(Arrays.deepToString(table2D));
        String[][] names = {{"Aziza", "Adina"}, {"Aibek", "Azamat"}};
        System.out.println(Arrays.deepToString(names));
    }
}
