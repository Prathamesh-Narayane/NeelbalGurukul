package com.neelbalgurukul.day1;

import java.util.Scanner;

public class divide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double number;
		if(num1 > num2) 
			 number=num1/num2;
		
		else 
			number=num2/num1;
		
		System.out.print(number);
	}

}
