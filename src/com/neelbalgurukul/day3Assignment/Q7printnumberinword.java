package com.neelbalgurukul.day3Assignment;
import java.util.*;

public class Q7printnumberinword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		int reverse=0;
		while(testcase!=0) {
			int digit =testcase%10;
			reverse=reverse*10+digit;
			testcase=testcase/10;
		}
		while(reverse!=0) {
			int digit=reverse % 10;
			switch(digit)
			{
			case 0:
				System.out.print("Zero");
				break;
			case 1:
				System.out.print("One");
				break;
			case 2:
				System.out.print("Two");
				break;
			case 3:
				System.out.print("Three");
				break;
			case 4:
				System.out.print("Four");
				break;
			case 5:
				System.out.print("Five");
				break;
			case 6:
				System.out.print("Six");
				break;
			case 7:
				System.out.print("Seven");
				break;
			case 8:
				System.out.print("Eight");
				break;
			case 9:
				System.out.print("Nine");
				break;
			}
			reverse=reverse/10;
		}
	}

}
