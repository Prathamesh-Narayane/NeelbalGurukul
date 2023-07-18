package com.neelbalgurukul.day2;
import java.util.*;

public class bitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int x=sc.nextInt();
		int n=sc.nextInt();

		System.out.println((x>>(n-1)&1));
	}

}
