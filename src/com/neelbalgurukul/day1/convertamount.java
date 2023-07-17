package com.neelbalgurukul.day1;
import java.util.*;

public class convertamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int amount = sc.nextInt();
		
		int digit1 = amount / 2000;
		 	amount= amount%2000;
		System.out.println(digit1 + "* 2000" +"="+ (digit1*2000));
		
		int digit2 = amount/500; 
		amount= amount%500;
		System.out.println(digit2 + "* 500" +"="+ (digit2*500));
		
		int digit3 = amount/200;
		amount= amount%200;
		System.out.println(digit3 + "* 200" +"="+ (digit3*200));
		
		int digit4 = amount/100;
		amount= amount%100;
		System.out.println(digit4 + "* 100" +"="+ (digit4*100));
		
		int digit5 = amount/50;
		amount= amount%50;
		System.out.println(digit5 + "* 50" +"="+ (digit5*50));
		
		int digit6 = amount/20;
		amount= amount%520;
		System.out.println(digit6 + "* 20" +"="+ (digit6*20));
		
		int digit7 = amount/10;
		amount= amount%10;
		System.out.println(digit7 + "* 10" +"="+ (digit7*10));
		
		int digit8 = amount/5;
		amount= amount%5;
		System.out.println(digit8 + "* 5" +"="+ (digit8*5));
		
		int digit9 = amount/2;
		amount= amount%2;
		System.out.println(digit9 + "* 2" +"="+ (digit9*2));
		
		int digit10 = amount/1;
		amount= amount%1;
		System.out.println(digit10 + "* 1" +"="+ (digit10*1));
		

	}

}
