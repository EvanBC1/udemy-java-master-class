package com.company;

public class Main {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.1755);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
       num1 = num1 * 1000;
       num2 = num2 * 1000;

       num1 = (int) num1;
       num2 = (int) num2;

        if(num1 == num2) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}