package com.company;

public class Main {

   private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
       System.out.println(isCatPlaying(true, 10));
       System.out.println(isCatPlaying(false, 36));
       System.out.println(isCatPlaying(false, 35));

    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
      int minTemperature = 25;
      int maxTemperature = 35;
       if (summer) {
          maxTemperature += 10;
       }
       if (temperature >= minTemperature && temperature <= maxTemperature) {
          return true;
       }
       return false;
    }

}