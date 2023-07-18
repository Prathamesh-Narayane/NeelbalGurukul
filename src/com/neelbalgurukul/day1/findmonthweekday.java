package com.neelbalgurukul.day1;
import java.util.*;

public class findmonthweekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int days = 1020;
		int year=1020/365;
//		System.out.println(year);
		int month=days %365;
		month=month/30;
//		System.out.println(month);
		 days = days- (30*month + year*365);
		 int week = days/7;
//		 System.out.println(week);
		 int day = days%7;
//		 System.out.println(day);
		 
		 System.out.print(year +"Years"+" : "+month+"Months"+" : "+week+"Weeks"+" : "+day+"Days");
		 
	}

}
