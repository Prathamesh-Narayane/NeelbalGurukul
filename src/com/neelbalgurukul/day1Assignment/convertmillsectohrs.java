package com.neelbalgurukul.day1Assignment;

public class convertmillsectohrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int millsec =7000234;
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
