package com.demo.CDACAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class Sortstring {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string");
		String str = s.next();
		
		char[]charArray=str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));

	}

}
