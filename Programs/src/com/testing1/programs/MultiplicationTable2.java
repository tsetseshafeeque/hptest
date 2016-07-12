package com.testing1.programs;

import java.util.Scanner;

public class MultiplicationTable2 {
	
	public static void main(String[] args) {
		int a,b,c,d;
		
		System.out.println("enter range of integers to print its multiplication table");
		Scanner sc = new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    
	    for(c=a;c<=b;c++){
	    	
	    	System.out.println("multiplication table between "+a+"&"+b);
	    	for(d=1;d<=10;d++){
	    		System.out.println(d+"*"+c+"="+(c*d));
	    	}
	    }
	    
	}

}
