package lab303;

import java.util.Scanner;

public class ForLoopDemo {
	public static void main(String[] args) {
		loopDemoOne();
		sumOfNaturalNumbers();
		palindrome();
		pyramidExample();
	}

	public static void loopDemoOne() {
		System.out.println("1. loopDemoOne");
		int n = 5;
		// for loop
		for (int i = 1; i <= n; ++i) {
			System.out.println("Java is fun");
		}
	}

	public static void sumOfNaturalNumbers() {
		System.out.println("\n2. sumOfNaturalNumbers");
		int sum = 0;
		int n = 1000;
		// for loop
		for (int i = 1; i <= n; ++i) {
			// body inside for loop
			sum += i; // sum = sum + i
		}
		System.out.println("Sum = " + sum);
	}

	public static void palindrome() {
		System.out.println("\n3. panlindrome");
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse)) {
			System.out.println("Entered string/number is a palindrome.");
		} else {
			System.out.println("Entered string/number isn't a palindrome.");
		}
		in.close();
	}

	public static void pyramidExample() {
		System.out.println("\n4. pyramidExample");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}

	}

}
