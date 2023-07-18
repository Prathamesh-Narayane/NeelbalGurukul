package com.neelbalgurukul.day2;
import java.util.*;

public class findtheshapeofarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		Scanner sc=new Scanner(System.in);
		int area=sc.nextInt();
		switch(area) {
		case 1:
			a=sc.nextDouble();
			System.out.println(Math.pow(a, 2));
			break;
		case 2:
			
			System.out.println(3.14*Math.pow(area, 2));
			break;
		case 3:
			System.out.println(Math.sqrt(3)*Math.pow(area, 2));
		}
	}

}
