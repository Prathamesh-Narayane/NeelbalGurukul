package com.neelbalgurukul.day1;
import java.util.*;

public class incometax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int salary = sc.nextInt();
		double tax=0;
		if(salary>=1500000) 
			tax=0.3*salary;
		
		else if(salary>=150000)
			tax = 0.2*salary;
		
		else if(salary >= 750000)
			tax = 0.1*salary;
		
			System.out.println(salary);
			System.out.println(tax);
			System.out.println(salary - tax);
			
		
	}

}
