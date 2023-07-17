package com.neelbalgurukul.day1;
import java.util.*;

public class conversion {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
//		double m,cm,i,f;
		long km= sc.nextLong();
		long m = 1000*km;
		long cm = 100*m;
		double i = cm/2.54;
		double f = i/12;
		
		System.out.println("m"+"="+m);
		System.out.println("cm" + "=" + cm);
		System.out.println("in"+ "="+ i);
		System.out.println("FEET" + "=" + f);
		
		

	}

}
