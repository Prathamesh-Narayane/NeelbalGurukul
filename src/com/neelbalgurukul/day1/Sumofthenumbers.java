package com.neelbalgurukul.day1;
import java.util.*;

public class Sumofthenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int number = sc.nextInt();
		int digit1 = number % 10; //7
		int digit2 = (number/10)%10; //74 4
		int digit3 = number/100; //
		int sumofthenumber = digit1+digit2+digit3;
		int reverse = (digit1 * 100) + (digit2* 10) + digit3;
		int sum = number + reverse;
	
		System.out.println(sumofthenumber);
		System.out.println(reverse);
		System.out.print(sum);
		
	}

}
