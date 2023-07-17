package com.neelbalgurukul.day1;
import java.util.*;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		long tri = sc.nextLong();
		double side = (Math.sqrt(3)*Math.pow(tri, 2))/4;
		System.out.println("sides of triangle"+"="+side);

	}

}
