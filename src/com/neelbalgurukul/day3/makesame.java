package com.neelbalgurukul.day3;

import java.util.Scanner;

public class makesame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int ans=0;
		while(x!=0) {
			if(x%2!=0);
			ans=ans+y;
			x=x>>1;
			y=y<<1;
			
		}

		System.out.print(ans);
	}

}
