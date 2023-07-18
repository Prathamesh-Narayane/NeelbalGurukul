package com.neelbalgurukul.day2Assignment;
import java.util.*;

public class Q6lowerbondandupperbond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int l=sc.nextInt();
		int u=sc.nextInt();
		int f=0;
		int s=1;
		int tp=0;
		for(int i=1;i<u;i++) {
				
				if(f>=l && f<u) {
					System.out.print(f+",");
				}
				int t=f+s;
				f=s;
				s=t;

	}

}
}
