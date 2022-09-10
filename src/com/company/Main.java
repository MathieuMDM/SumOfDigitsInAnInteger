package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 1000:");

        int number = scanner.nextInt();

        int numberOne = number % 10;
        int numberTwo = (number/10) % 10;
        int numberThree = (number/100) % 10;

        int all = numberOne + numberTwo + numberThree;

        System.out.println("The sum of the given digits is " + all);

    }
}
