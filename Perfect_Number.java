package com.Logical_Program;

import java.util.Scanner;
public class Perfect_Number {

		public static int total =0;
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number to check whether it is perfect or not");
	        int num =sc.nextInt();

	        for (int i=1;i<num;i++) {
	            if (num % i == 0) {
	                total = total + i;
	            }

	        }
	        if(total == num)
	            System.out.println("The number "+num+" is a perfect number.");
	        else
	            System.out.println("The number "+num+" is not a perfect number.");
	}

}
