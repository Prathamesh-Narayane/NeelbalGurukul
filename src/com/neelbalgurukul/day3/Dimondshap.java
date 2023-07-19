package com.neelbalgurukul.day3;

public class Dimondshap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5-i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int j=i-1;j<=1;j--)
				System.out.print(j);
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5-i;j++)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(k);
			for(int x=i-1;x>=1;x--)
				System.out.print(x);
			System.out.println();
				
		}
		

	}

}
