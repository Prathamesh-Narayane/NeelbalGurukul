package com.neelbalgurukul.day3;
import java.util.*;

public class gcd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		int y =sc.nextInt();
		int r=0;
		r=x%y;
		while(r!=0) {
			x=y;
			y=r;
			r=x%y;
		}
		if(r==0)
		System.out.print(y);
	}
	}


