package com.neelbalgurukul.day2;
import java.util.*;
public class sum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double s=0;
		double num=1;
		double f=1;
		for(int i=1;i<10;i++) {
			f=f*i;
			if(1%2!=0) {
				s=s+num/f;
				num=-num;
			}
		}
		System.out.print(s);
	}

}
