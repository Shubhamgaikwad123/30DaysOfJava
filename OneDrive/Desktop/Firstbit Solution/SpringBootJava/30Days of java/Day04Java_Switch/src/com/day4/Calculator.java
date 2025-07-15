package com.day4;

import java.util.Scanner;

public class Calculator {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = sc.nextDouble();
	        System.out.print("Enter second number: ");
	        double num2 = sc.nextDouble();
	        System.out.print("Choose operation (+, -, *, /): ");
	        char op = sc.next().charAt(0);

	        switch (op) {
	            case '+' -> System.out.println("Result: " + (num1 + num2));
	            case '-' -> System.out.println("Result: " + (num1 - num2));
	            case '*' -> System.out.println("Result: " + (num1 * num2));
	            case '/' -> {
	                if (num2 != 0)
	                    System.out.println("Result: " + (num1 / num2));
	                else
	                    System.out.println("Cannot divide by zero!");
	            }
	            default -> System.out.println("Invalid operator.");
	        }
	    }

}
