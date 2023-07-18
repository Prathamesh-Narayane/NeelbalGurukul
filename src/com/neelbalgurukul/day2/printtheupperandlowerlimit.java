package com.neelbalgurukul.day2;
import java.util.*;

public class printtheupperandlowerlimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int uppr=sc.nextInt();
		int lower=sc.nextInt();
		for(int i=uppr;i<=lower;i++) {
			char ch=((char)i);
			System.out.println(ch+"-"+i);
		}
	}

}
