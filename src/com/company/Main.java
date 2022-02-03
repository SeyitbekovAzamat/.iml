package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] num = {6.2, -34.11, -48.45, 68.11, -32.48, -145.32, 31.459, -245.21, -14.0, 58.1, -107.21, 66.12, -12.1, 55.9, -8.8};
        int quantity = 0;
        double totalSum = 0;
        boolean check = false;
        for (double number : num){
            if (number < 0){
                check = true;
            }
            if (number > 0 && check){
                totalSum = number + totalSum;
                quantity++;
            }
        }
        double average = totalSum / quantity;

        System.out.println("Среднее число : " + average);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < num.length; i++) {
                if (num[i] < num[i-1]) {
                    double temp = num[i];
                    num[i] = num[i-1];
                    num[i-1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
