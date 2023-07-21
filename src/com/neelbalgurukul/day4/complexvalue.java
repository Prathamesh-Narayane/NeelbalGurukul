package com.neelbalgurukul.day4;

public class complexvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex x=new Complex(3,4);
        Complex y=new Complex(4,5);
        Complex a=x.add(y);
        Complex s=x.sub(y);
        Complex m=x.mul(y);
        Complex d=x.div(y);
        System.out.println(x); 
        System.out.println(y);
        System.out.println(a);
        System.out.println(s);
        System.out.println(m);
        System.out.println(d);

	}

}
