package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMaxxIntValue = 2147483647;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted min Value = " + (myMinIntValue - 1));

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;

        System.out.println(myMaxlongValue );
        System.out.println(myMinlongValue );

        long myLongValue = 100L;

        System.out.println(myLongValue);

        long bigLong = 2_147_483_647_234L;

        short bigShort = 32767;

    }
}
