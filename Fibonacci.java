package day6;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci sequence is when a number is the sum of the two numbers that preceeds it
		//Eg 0 1 1 2 3 5 8 13 21 ...
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter term to generate ");
		int term = scanner.nextInt();
		int a=0, b=1;
		
		System.out.println("Fibonacci sequence for "+ term + " is : ");
		for(int i =1; i<=term; i++)
		{
			
			System.out.println(a);
			int next = a+ b;
			a=b;
			b=next;
			
		}
		scanner.close();

	}

}
