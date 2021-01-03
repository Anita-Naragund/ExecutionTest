package com.xworkz.aptitude.pattern;

import java.util.Scanner;

public class TrianglePattern {
	public static void main(String[] args) {
		int i, j;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of rows you want enter");
		int number = scanner.nextInt();
		for (i = 1; i <= number; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
		for (i = number - 1; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print(j + "");
			}
			System.out.println();
		}
		scanner.close();
}
}
