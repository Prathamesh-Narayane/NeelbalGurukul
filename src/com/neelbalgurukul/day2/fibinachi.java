package com.neelbalgurukul.day2;

public class fibinachi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		for(int i=1;i<=10;i++) {
			System.out.println(f);
			int t=f+s;
			f=s;
			s=t;
		}
		
	}

}
