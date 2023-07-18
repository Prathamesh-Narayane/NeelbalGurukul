package com.neelbalgurukul.day2;
import java.util.*;

public class sum5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
				
		double s=0;
		double x=sc.nextDouble();
		x=Math.toRadians(x);
		double num=1;
		double f=1;
		for(int i=1;i<10;i++) {
			f=f*i;
			if(1%2!=0) {
				s=s+num/f;
				num=-num*x*x;
			}
		}
		System.out.print(s);
	}
	}


