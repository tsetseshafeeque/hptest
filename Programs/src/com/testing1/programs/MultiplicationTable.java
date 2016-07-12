package com.testing1.programs;

import java.util.Scanner;

public class MultiplicationTable {
	
	
	public static void main(String[] args) {
		int c,n;
		System.out.println("enter an integer to print its multiplication table");
		Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
	    
	    System.out.println("here is the multiplicationn table for "+n);
	    for (c=1;c<=10;c++){
	    	System.out.println(c+"*"+n+"="+(n*c));
	    }
	    
	}

}
