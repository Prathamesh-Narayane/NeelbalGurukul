package com.neelbalgurukul.day3;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y =12;
		while(x!=y) {
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		System.out.print(x);
	}

}
