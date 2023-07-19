package com.neelbalgurukul.day3;

import java.util.Scanner;

public class sumofagivennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0) {
			int add=0;
			add=n%10;
			
			
			sum=sum+add;
			n=n/10;
		}
		System.out.println(sum);

	}

}
