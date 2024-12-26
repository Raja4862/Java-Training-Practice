package com.dms.view;

import java.util.Scanner;

import com.dms.model.Specialty;

/**
 * The SpecialtyView class provides methods to interact with the user via the
 * console for performing actions related to the Specialty entity. These actions
 * include inserting, deleting, updating, and finding Specialty records.
 * 
 * This class is responsible for taking user input and mapping it to
 * corresponding methods in the service layer for further processing. The input
 * is typically used to create or modify Specialty objects.
 * 
 * It also displays the result of operations such as insert, update, delete, and
 * find.
 * 
 * @author Praveen_Raja_S
 * @version 1.0
 */

public class SpecialtyView {

	static Scanner sc = new Scanner(System.in);
	static int specId;
	static String specName;
	static String specDescription;

	public static void printResult(String result) {
		System.out.println(result);
	}

	public static Specialty insertSpecialtyView() {

		System.out.println("Enter SpecId,SpecName,SpecDescription");

		specId = sc.nextInt();
		specName = sc.next();
		specDescription = sc.nextLine();

		return new Specialty(specId, specName, specDescription);

	}

	public static int deleteSpecialtyView() {

		System.out.println("Enter Specialty id = ");

		return sc.nextInt();

	}

	public static Specialty updateSpecialtyView() {

		System.out.println("For Update enter exists Id and New specName, specDescription");

		specId = sc.nextInt();
		specName = sc.next();
		specDescription = sc.nextLine();

		return new Specialty(specId, specName, specDescription);

	}

	public static int findSpecialtyView() {
		System.out.println("Enter Specialty id = ");
		return sc.nextInt();

	}

}
