package com.Logical_Program;

import java.util.Scanner;
public class  Fibonacci_Series {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner=new Scanner(System.in);
		 int num=scanner.nextInt();
		 scanner.close();
		 int a=0, b=1,c;
		 for(int i=1; i<=num; i++) {
			 c=a+b;
			 System.out.print(c+ ", ");
			 a=b;
			 b=c;
		 }
		 
	}
	}


