package com.neelbalgurukul.day2;
import java.util.*;
public class calculatethepowerofsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		int sum=1;
		for(int i=1;i<=power;i++) {
			 sum=base*sum;
			
		}
		System.out.println(sum);
			

	}

}
