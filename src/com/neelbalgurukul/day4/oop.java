package com.neelbalgurukul.day4;

public class oop {
	class Employee{
	private String name;
	private int id;
	public long salary;
	private String department;
	
	Employee(String name,int id,long salay,String department){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.department=department;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a =new Employee("prashan",1,50000,"IT");
		Employee b =new Employee("akash",2,55000,"IT");
		Employee c =new Employee("rajesh",3,45000,"IT");
		
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		
		
		
		if(a.getsalary()>b.getsalary()) {
			 
		
			System.out.print("salary of a is higher");
		}
		else {
			System.out.print("salary of b is higher");
		}
		if(a.getsalary()>c.getsalary) {
			System.out.print("salary of a is higher");
		}else {
			System.out.print("salary of c is higher");
		}
		if(b.getsalary()>c.getsalary) {
			System.out.print("salary of b is higher");
		}
		System.out.print("salary of c is higher");
	}
	
		a.setsalary(a.setsalary()+a.setsalary()2.0/100)
		
		

	}

}
