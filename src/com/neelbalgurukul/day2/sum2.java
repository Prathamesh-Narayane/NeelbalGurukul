package com.neelbalgurukul.day2;

import java.util.*;
public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double n=sc.nextInt();
		double value=0;
		for( double i=1;i<=n;i++) {
			
			value=value+(1/Math.pow(i, 2));
			
		}
		System.out.println(value);
		
	}

}
