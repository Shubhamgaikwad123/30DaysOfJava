package com.day3;

import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");

	}

}
