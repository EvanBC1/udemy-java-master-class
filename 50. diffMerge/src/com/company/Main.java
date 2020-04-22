package com.company;

public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int kiloBytesRemaining;

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        megaBytes = Math.round(kiloBytes / 1024);
        kiloBytesRemaining = kiloBytes % 1024;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloBytesRemaining + " KB");
    }
}