package com.neelbalgurukul.day2Assignment;
import java.util.*;

public class Q2calculatecosine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		double degree = sc.nextDouble();
		degree = Math.toRadians(degree);

		int nu = sc.nextInt();
		double sum = 1, fact = 1;
		double num = -(Math.pow(degree,  2));
		for(int i=1; i<= nu; i++) {

			fact = fact*i;
			if(i%2==0) {
				sum = sum + (num/fact);
				num = -num*degree*degree;
			}
		}
		System.out.println(sum);

	}
	}

