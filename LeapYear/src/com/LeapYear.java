package com;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your year :");
	
	int year = sc.nextInt();
	
    if((year % 4 == 0 && year % 100 != 0 )|| (year % 400 == 0))
    {
    System.out.println("Leap year");
    
	}
    else {
    	System.out.println(" not a leap year");
    }
}
}
	
