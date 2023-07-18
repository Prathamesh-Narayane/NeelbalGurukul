package com.neelbalgurukul.day1Assignment;
import java.util.*;

public class convertmillsectohrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		7000234
		int millsec =sc.nextInt();
		int seconds = millsec/1000;
			
			
		int minute= seconds/60;
			
		int hour = minute/60;
//			System.out.println(hour); 
			
			minute=minute%60;
			
			
//			System.out.println(minute); 
			seconds=seconds%60;
//			System.out.println(seconds); 
			System.out.println(hour+":"+minute+":"+seconds);
		
	}

}
