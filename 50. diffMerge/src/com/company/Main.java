package com.company;

public class Main {
    public static void main(String[] args) {
    isLeapYear(-1600);
    isLeapYear(1600);
    isLeapYear(2017);
    isLeapYear(2000);
    }
    public static boolean isLeapYear(int year) {
        if(year <= 0 || year >= 10000) {
            System.out.println(false);
            return false;
        }
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.println(true);
                    return true;
                } else {
                    System.out.println(false);
                    return false;
                }
            } else {
                System.out.println(true);
                return true;
            }
        } else {
            System.out.println(false);
            return false;
        }
    }
}