/*rite a program that removes duplicates in a sorted array 
in place (do not use a 2nd Array).*/

package com.demo.assignment4;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		int i, j = 0, n;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		n = s.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}
		arr[j] = arr[n - 1];

		for (i = 0; i < j; i++) {
			arr[i] = arr[i];
		}

		for (i = 0; i < j; i++) {
			System.out.println(arr[i]);
		}

	}

}
