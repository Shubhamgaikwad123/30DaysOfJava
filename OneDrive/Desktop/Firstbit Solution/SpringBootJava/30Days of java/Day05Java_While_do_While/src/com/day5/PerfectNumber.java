package com.day5;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i < num) {
            if(num % i == 0)
                sum += i;
            i++;
        }

        if(sum == num)
            System.out.println(num + " is a Perfect Number");
        else
            System.out.println(num + " is Not a Perfect Number");

	}

}
