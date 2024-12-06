package com.day3;

// Java bean or Model class or POJO class
class Emp{
	private int edi;
	private String ename;
	
	public Emp(int edi, String ename) {
		super();
		this.edi = edi;
		this.ename = ename;
	}

	public int getEdi() {
		return edi;
	}

	public void setEdi(int edi) {
		this.edi = edi;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Emp a = new Emp(1,"raja");
		System.out.println(a.getEdi());
		System.out.println(a.getEname());
		a.setEname("Praveen");
		System.out.println(a.getEdi());
		System.out.println(a.getEname());
		
		
	

	}

}
