package com.neelbalgurukul.day2Assignment;
import java.util.*;

public class Q4findquadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>0 && y>0)
			System.out.println(x +" & "+ y +" in the first quadrant ");
		
		else if(x<0 && y>0)
			System.out.println(x +" & "+ y +" in the second quadrant ");
		
		else if(x<0 && y<0)
			System.out.println(x +" & "+ y +" in the third quadrant ");
		
		else if(x>0 && y<0)
			System.out.println(x +" & "+ y +" in the fourth quadrant ");
		else
			System.out.println(x +" & "+ y +"origin");
	}

}
