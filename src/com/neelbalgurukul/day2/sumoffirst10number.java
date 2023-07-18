package com.neelbalgurukul.day2;
import java.util.*;

public class sumoffirst10number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number;i++) 
			sum=sum+i;
			System.out.println(sum);
		
	}

}
