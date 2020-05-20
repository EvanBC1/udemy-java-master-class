package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      System.out.println("This program will to 10 numbers that you enter and then return the sum of those numbers");
       Scanner sc = new Scanner(System.in);
       int sum = 0;
      for(int i = 0; i < 3; i++) {
         System.out.println("Enter integer " + (i + 1) + " below:");
         if(sc.hasNextInt()) {
            sum += sc.nextInt();
         } else {
            System.out.println("Invalid input");
            i--;
         }
         sc.nextLine();
      }
      System.out.println(sum);

      sc.close();


    }

}