package com.company;

public class Main {
    public static void main(String[] args) {
     String answer = getDurationString(223324);
     System.out.println(answer);
    }
    public static String getDurationString(int minutes, int seconds) {
      if (minutes < 0 || seconds < 0 || seconds > 59) {
         return "Invalid value";
      }
      int hours = 0;
      while (minutes > 59) {
         hours++;
         minutes -= 60;
      }
      return hours + "h " + minutes + "m " + seconds + "s ";
    }
    public static String getDurationString( int seconds) {
      if (seconds < 0) {
         return "Invalid value";
      }
      int minutes = seconds / 60;
      seconds = seconds % 60;

      return getDurationString(minutes, seconds);
    }

}