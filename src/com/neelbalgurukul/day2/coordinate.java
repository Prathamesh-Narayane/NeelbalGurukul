package com.neelbalgurukul.day2;
import java.util.*;


public class coordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		
		double x,y;
		x=r*(Math.sin(Math.toRadians(t)));
		y=r*(Math.cos(Math.toRadians(t)));
		
		System.out.println(x +"   "+y);

	}

}
