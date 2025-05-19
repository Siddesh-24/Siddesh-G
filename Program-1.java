/*  
Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string*/

package com.siddesh;

import java.util.Scanner;

public class SmallCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        double a = sc.nextDouble();

        System.out.print("Enter number b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (Addition / Subtraction / Multiplication  / Division ): ");
        String op = sc.next();

        double result = 0;

        if (op.equals("Addition")) {
            result = a + b;
        } else if (op.equals("Subtraction")) {
            result = a - b;
        } else if (op.equals("Subtraction")) {
            result = a * b;
        } else if (op.equals("Division")) {
            if (b != 0)
                result = a / b;
            else
                System.out.println("Cannot divide by zero.");
        } else {
            System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);
    }
}
