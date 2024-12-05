package com.day2;

class Mobile{
	String brandName;
	double price;
	Mobile(String bName,double rup)
	{
		this.brandName=bName;
		this.price=rup;
		}
void display() {
		
		System.out.println("Brand Name =  " + brandName);
		System.out.println("Amount =  " + price);
	}
}


public class ClsObjtwo {
	public static void main(String[] args) {
		Mobile a = new Mobile("OnePlus",100000);
		a.display();
		
		
	}

	
}
