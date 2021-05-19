package com.demo.CDACAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Sortarray {

	public static void main(String[] args) {
		int i, j = 0, n,m,index=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		n = s.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) 
		{
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for(i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
		
		

	}

}
