package com.Assessment;

class Emp{
	private String empName;
	private String jobTitle;
	private Double Salary;
	
	public Emp(String empName, String jobTitle, Double salary) {
		this.empName = empName;
		this.jobTitle = jobTitle;
		this.Salary = salary;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	
    public void calculateRaise(double percentage) {
    	
        double incAmount = (Salary * percentage) / 100;
        Salary += incAmount;
        System.out.println("New salary after "+ percentage +"% raise: " + Salary);
    }
	public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + empName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " +Salary);
    }

	
}


public class AssSix {
	static public void main(String args[]) {
		
		Emp e1 = new Emp("Raja","SFtr",1000.0);
		
		e1.displayEmployeeDetails();
		
		e1.calculateRaise(10);
		
		//e1.displayEmployeeDetails();
		
	}

}
