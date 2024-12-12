package com.day4;
 
class Employee {
	static private Employee emp = null;
 
	private Employee() {
		System.out.print("hi");
	}
 
	public static Employee getEmployee() {
		if (emp == null) {
			emp = new Employee();
		} else {
			emp = null;
 
		}
		return emp;
	}
 
	public void display() {
		System.out.println(" VSPR");
	}
}
 
public class SingleTon {
 
	public static void main(String[] args) {
		Employee emp = Employee.getEmployee();
		emp.display();
 
		System.gc(); // this refers garbage collection
 
	}
 
}