package com.neelbalgurukul.day3;
import java.util.*;

public class primenumbers1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		boolean isprime=true;
		for(int n=2;n<=1000;n++) {
			isprime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0 ) {
				isprime=false;
				break;
			}
		}
			if(isprime) 
				System.out.println(n+"no is prime");
		}
	}

}
