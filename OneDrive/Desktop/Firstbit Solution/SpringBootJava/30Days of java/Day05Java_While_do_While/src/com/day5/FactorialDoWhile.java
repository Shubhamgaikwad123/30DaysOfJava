package com.day5;

import java.util.Scanner;

public class FactorialDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int i = 1, fact = 1;

        do {
            fact *= i;
            i++;
        } while(i <= n);

        System.out.println("Factorial = " + fact);

	}

}
