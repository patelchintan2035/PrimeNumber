package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        boolean isPrimeNumber = false;
        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                isPrimeNumber = true;
                break;
            }
        }
        if (!isPrimeNumber) {
            System.out.println("Enter number " + number + " is prime number.");
        }
        else {
            System.out.println("Enter number " + number + " is not prime number.");
        }
    }
}
