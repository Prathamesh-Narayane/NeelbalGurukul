package com.neelbalgurukul.day2;
import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int year=sc.nextInt();
		if((year%4==0) || (year%400==0) && (year%100!=0)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}

	}

}
