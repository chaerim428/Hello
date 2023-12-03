package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 //Enter an integer(0 ~ 9) : 12345678
		//Sum of digits = 36
		Scanner scanner = new Scanner(System.in);
		long num = 0;
		long answer = 0;
		
		
		//9876543210
		System.out.print("Enter an integer(0 ~ 9) : ");
		num = scanner.nextInt();
		scanner.close();
		
		while(num > 0) {
			answer += (num % 10);
			num /= 10;
		}
		System.out.println("Sum of digits = " + answer);

	}

}
