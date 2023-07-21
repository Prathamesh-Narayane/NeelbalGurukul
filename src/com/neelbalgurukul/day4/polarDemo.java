package com.neelbalgurukul.day4;

class polar{
	private double r,th;
	polar(){
	}
		polar(double r,int th){
		
			void display() {
				System.out.print(r+""+th);
			}
	}
}
public class polarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polar a=new polar(5,50);
		polar b=new polar(6,50);
		polar c=new polar();
		double x=a.getX()+b.getX();
		double y=a.getY()+b.getY();
		c.setPolar(x,y);
		System.out.println(a);
		System.out.println(b);
		System.out.printlnn(c);
		
		

	}

}
