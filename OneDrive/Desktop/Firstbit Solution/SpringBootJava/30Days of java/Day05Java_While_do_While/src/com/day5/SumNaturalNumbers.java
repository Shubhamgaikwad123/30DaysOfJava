package com.day5;

import java.util.Scanner;

public class SumNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N:");
		int n= sc.nextInt();
		
		int sum=0,i=1;
		while(i<=n) {
			sum+=i;
			
			i++;
		}
		
		System.out.println("Sum= "+sum);

	}

}
