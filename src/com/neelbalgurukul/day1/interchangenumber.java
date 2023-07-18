package com.neelbalgurukul.day1;
import java.util.*;

public class interchangenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int digit1=number%100;
		int digit2=number/100;
		System.out.print(digit1);
		System.out.print(digit2);
	}

}
