package com.neelbalgurukul.day2Assignment;

import java.util.Scanner;

public class Q1day2polar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r1 = sc.nextDouble();
		double r2 = sc.nextDouble();
		double a1 = sc.nextDouble();
		double a2 = sc.nextDouble();
		
		a1=Math.toRadians(a1);
		a2=Math.toRadians(a2);
		double x1=r1*Math.cos(a1);
		double x2=r2*Math.cos(a2);
		double y1=r1*Math.sin(a1);
		double y2=r2*Math.sin(a2);
		
		double x3=x1+x2;
		double y3=y1+y2;
		double r3=Math.sqrt(Math.pow(x3, 2)+Math.pow(y3, 2));
		
		double th3=Math.atan2(y3, x3);
		th3=Math.toDegrees(th3);
		System.out.println("r ="+r3+"  th ="+th3);
		
		
	}

}
