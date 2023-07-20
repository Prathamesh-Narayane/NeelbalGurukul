package com.neelbalgurukul.day3Assignment;

import java.util.Scanner;

public class Q41010pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int i=0;
		int j=0;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) 
                	
                    System.out.print(1 + " ");
                else 
                    System.out.print(0 + " ");
            } 
            System.out.println();
        }
	}
	}

