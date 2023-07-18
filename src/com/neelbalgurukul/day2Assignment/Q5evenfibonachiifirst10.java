package com.neelbalgurukul.day2Assignment;

public class Q5evenfibonachiifirst10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=0;
		int s=1;
		int tp=0;
		for(int i=1;;i++) {
				int t=f+s;
				f=s;
				s=t;
				if(t%2==0) {
					System.out.print(t+" ,");
					tp++;
				}
				if(tp>10)
					break;
//					System.out.print(t+",");
				
			
		}
		

	}

}
