package com.demo.CDACAssignment;

import java.util.Scanner;

public class FindIndex {

	public static void main(String[] args) {
		int i, j = 0, n,m,index=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements");
		n = s.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Enter element you want to search in an array");
		m=s.nextInt();
		for(i=0;i<n;i++) 
		{
			if(arr[i]==m) 
			{
				index=i;
			}
			
		}
		System.out.println("The element present at "+index+" position");

	}

}
