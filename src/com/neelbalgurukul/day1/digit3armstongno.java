package com.neelbalgurukul.day1;
import java.util.*;

public class digit3armstongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();
		int a=value%10;
		int b=(value/10)%10; 
		int c=value/100;
		
//		a=Math.pow(a, 3);
//		b=Math.pow(b, 3);
//		c=Math.pow(c, 3);
		int x=a*a*a;
		int y=b*b*b;
		int z=c*c*c;
		
		
		int main=x+y+z;
		System.out.print(main);
		if(value==main) {
			System.out.println(value+" is not Armstrong Number");
		}
		else {
			System.out.println(value +" is on Armstrong Number");
		}
		
		

	}

}
