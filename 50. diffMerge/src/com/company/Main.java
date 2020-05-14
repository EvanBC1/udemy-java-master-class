package com.company;

public class Main {
    public static void main(String[] args) {
      calcFeetAndInchesToCentimeters(3,5);
      calcFeetAndInchesToCentimeters(3,13);
      calcFeetAndInchesToCentimeters(4);
      calcFeetAndInchesToCentimeters(445);
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
       if(feet < 0 || inches < 0 || inches > 12) {
          System.out.println(-1);
          return -1;
       }
       double centimeters = ((feet * 12) + inches) * 2.54;
       System.out.println(centimeters);
       return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
       if(inches < 0 || inches > 12) {
          System.out.println(-1);
          return -1;
       }
       double centimeters = inches * 2.54;
       System.out.println(centimeters);
       return centimeters;
    }

}