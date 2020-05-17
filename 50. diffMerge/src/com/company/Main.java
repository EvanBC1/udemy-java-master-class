package com.company;

public class Main {

   private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
      printYearsAndDays(525600);
      printYearsAndDays(1051200);
      printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
      if(minutes < 0) {
         System.out.println(INVALID_VALUE_MESSAGE);
      }
      long days = minutes / 1440;
      minutes = minutes % 1440;
      long years = days / 365;
      days = days % 365;
      System.out.println(years + "y " + days + "d " + minutes + "m ");
    }

}