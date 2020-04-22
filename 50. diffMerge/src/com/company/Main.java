package com.company;

public class Main {
    public static void main(String[] args) {
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        long milesPerHour = Math.round(kilometersPerHour /  1.609);
        System.out.println(milesPerHour);
        return milesPerHour;
    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        long milesPerHour = Math.round(kilometersPerHour /  1.609);
        System.out.println(kilometersPerHour + " km/h " + milesPerHour + " mi/h");
    }
}