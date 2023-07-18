package com.neelbalgurukul.day2;

import java.util.Scanner;

public class sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double n=sc.nextInt();
		double value=0;
		double f=1;
		for( double i=1;i<=n;i++) {
			f=f*i;
			value=value+(1/f+i);
//			value=f;
		}
		System.out.println(value);
		

	}

}
