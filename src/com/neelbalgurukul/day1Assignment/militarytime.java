package com.neelbalgurukul.day1Assignment;
import java.util.*;

public class militarytime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int number=sc.nextInt();
		int hour = number/100;
		System.out.println(hour);
		int min=number%100;
		System.out.print(min);
		hour=hour % 12;
		System.out.println(hour);
	}

}
