package com.demo.CDACAssignment;

import java.util.Scanner;

public class Arraysqrt {

	public static void main(String[] args) {
		int n,i,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of array elements ");
		n= s.nextInt();
		double[]arr=new double[n];
		System.out.println("Enter the array elements");
		for (i = 0; i < n; i++) 
		{
			arr[i] = s.nextInt();
		}
		
		System.out.println("Array elements are");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the choice 1.double the numbers 2.square the numbers 3.square root 4.exit");
		c= s.nextInt();
		switch (c)
		{
		case 1:
			double[]arrDouble=new double[n];
			System.out.println("double of array element is");
			for(i=0;i<n;i++) 
			{
				arrDouble[i]=arr[i]*2;
				System.out.println(arrDouble[i]+" ");
			}
			break;
		case 2:
			double[]arrsquare=new double[n];
			System.out.println("square of array element is");
			for(i=0;i<n;i++) 
			{
				arrsquare[i]=arr[i]*arr[i];
				System.out.println(arrsquare[i]+" ");
			}
			break;
		case 3:
			double[]arrsquarert=new double[n];
			System.out.println("square of array element is");
			for(i=0;i<n;i++) 
			{
				arrsquarert[i]=(Math.sqrt(arr[i]));
				System.out.println(arrsquarert[i]+" ");
			}
			break;
			
		case 4:
			System.out.println("exit");
			break;
		default:
			 System.out.println("invalid input");
			 break;
		
		}

	}

}
