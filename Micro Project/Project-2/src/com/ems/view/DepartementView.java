package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;

public class DepartementView {

	static Scanner sc = new Scanner(System.in);
	static int dno;
	static String dname;

	public static Department insertDepartmentView() {

		System.out.println("Enter Department-name ,Department-no");

		dname = sc.next();
		dno = sc.nextInt();

		return new Department(dno,dname);

	}

	public static int deleteDepartmentView() {

		System.out.println("Enter department id = ");

		return sc.nextInt();

	}

	public static Department updateDepartmentView() {

		System.out.println("for Update Enter new  dno, dName");
		
		dno = sc.nextInt();
		dname = sc.next();
		
		return new Department(dno,dname);

	}

	public static int findDepartmentView() {
		System.out.println("Enter Department id = ");
		return sc.nextInt();

	}

}
