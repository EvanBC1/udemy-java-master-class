package com.company;

public class Main {

    public static void main(String[] args) {

        double val1 = 20.00;
        double val2 = 80.00;
        double val3 = (val1 + val2) * 100.00;
        System.out.println(val3);
        double val4;
        val4 = val3 % 40.00;
        System.out.println(val4);
        boolean val5 = false;
        val5 = val4 == 0 ? true : false;
        System.out.println(val5);
        if (!val5) {
            System.out.println("Got some remainder");
        }

    }
}
