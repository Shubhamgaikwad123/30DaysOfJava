package com.day5;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();
	        int original = num, rev = 0;

	        while(num != 0) {
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num /= 10;
	        }

	        if(rev == original)
	            System.out.println("Palindrome number");
	        else
	            System.out.println("Not a palindrome");

	}

}
