package com.neelbalgurukul.day1;
import java.util.*;

public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int salary = sc.nextInt();
		if(salary < 30000) 
			salary=(salary*5)/100 + salary;
//			salary = salary * 1.05;
			System.out.println(salary);
		

	}

}
