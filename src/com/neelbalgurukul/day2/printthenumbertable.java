package com.neelbalgurukul.day2;


import java.util.Scanner;

public class printthenumbertable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number =sc.nextInt();
		for(int i=1;i<=10;i++) {
			int sum=number*i;
			System.out.println(number +" x "+ i+" = "+  sum);
		}

	}

}
