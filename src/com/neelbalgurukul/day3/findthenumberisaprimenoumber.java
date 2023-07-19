package com.neelbalgurukul.day3;
import java.util.*;
public class findthenumberisaprimenoumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		// TODO Auto-generated method stub
		int x=sc.nextInt();
		boolean isprime=true;
		for(int i=2;i<x;i++) {
			if(x%i==0 ) {
				isprime=false;
				break;
			}
		}
			if(isprime) 
				System.out.print(x+"no is prime");
			else
				System.out.print(x+"not prime");
				
		}
	}

