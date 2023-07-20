package com.neelbalgurukul.day3Assignment;
import java.util.*;
public class Q21to0numberpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;

		for(int i=1;i<=6;i++) {
			for(int j=1; j<=6-i; j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++) {
				System.out.print(n);
				n++;
				if(n==10) {
					n=0;
				}
			}
			System.out.println();
		}
	}
		
	}	

