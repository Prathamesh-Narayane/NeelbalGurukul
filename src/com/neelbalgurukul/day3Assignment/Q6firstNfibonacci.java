package com.neelbalgurukul.day3Assignment;
import java.util.*;
public class Q6firstNfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int start= sc.nextInt();
		int comNum = num;
		int zero = 0;
		int first =1;
		int fib = 0;
		int count =0;
		for(int i=1;;i++) {
			fib = zero+first;
			if(fib>=start) {
				System.out.print(fib+" ");
				count++;
			}
			if (count == num)
				break;
			zero = first;
			first = fib;
		}
	 }
}