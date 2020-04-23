package com.company;

public class Main {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            System.out.println("false");
            return false;
        }
        if ((hourOfTheDay < 8 || hourOfTheDay > 22) && barking) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}