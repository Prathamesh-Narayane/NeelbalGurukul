package com.neelbalgurukul.day3;

public class usingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<5) {
			int j=1;
			while(j<=i) {
				System.out.print(" ");
				j++;
			}
			int y=1;
			while(y>=i) {
				System.out.print(y);
				y++;
			}
			int z=2;
			while(z<=i) {
				System.out.print(z);
				z++;
			}
			i++;
			
		}
		
	}
	System.out.println();

}
