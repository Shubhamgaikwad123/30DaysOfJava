package com.day3;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println("Maximum: " + a);
        else if (b >= a && b >= c)
            System.out.println("Maximum: " + b);
        else
            System.out.println("Maximum: " + c);

	}

}
