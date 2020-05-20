package com.company;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      inputThenPrintSumAndAverage();
   }

   public static void inputThenPrintSumAndAverage() {

      Scanner sc = new Scanner(System.in);
      boolean numbersOnly = true;
      int sum = 0;
      long average = 0;
      int currentInt = 0;
      int count = 0;

      while (numbersOnly) {
         if (!sc.hasNextInt()) {
            System.out.println("SUM = " + sum + " AVG = " + average);
            return;
         }

         count++;
         currentInt = sc.nextInt();
         sum += currentInt;

         average = Math.round((double) sum / (double) count);
      }
      sc.close();
   }
}