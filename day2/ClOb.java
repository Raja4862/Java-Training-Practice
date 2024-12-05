package com.day2;


class Emp{
	int eId;
	String eName;
	double eSalary;
	
	Emp(int eid,String Name,float sal)
	{
		this.eId=eid;
		this.eName=Name;
		this.eSalary=sal;
	}
	
	void display() {
		
		System.out.println("Employee ID =  " + eId);
		System.out.println("Employee Name =  " + eName);
		System.out.println("Employee Salary =  " + eSalary);
	}
	
}

public class ClOb {
	public static void main(String[] args) {
		
		Emp a = new Emp(101,"praveen",100000);
		a.display();
		
		
	}

}
