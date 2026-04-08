package com.pluralsight;

import java.util.Scanner;

public class TheCalculator {
    public static void main(String[] args) {

        char add = 'A';
        char sub = 'S';
        char mul = 'M';
        char div = 'D';





        System.out.println("I am your personal Calculator!");
        System.out.println("====================================");

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int firstNumber = myScanner.nextInt();
        myScanner.nextLine();

        System.out.print("Please enter the second number: ");
        int secondNumber = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please type the first letter in capital of the operation you want to use so I can start calculating: ");
        String operation = myScanner.nextLine();

        /*if (operation.equals("A")) {
          System.out.println("Please enter the first number: ");
                    int firstNumber1 = myScanner.nextInt();
                    System.out.println("Please enter the second number: ");
                } else if (operation.equals("S")){
                    System.out.println("Please enter the first number: ");
                }*/

        }

    }
