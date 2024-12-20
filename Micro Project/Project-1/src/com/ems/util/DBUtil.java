package com.ems.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;

/**
 * @author Praveen_Raja_S
 * @version 1.0
 * It is a Temporary DataBase AS (List and MAP)
 */

public class DBUtil {

	private static List<Employee> list = new LinkedList<>();
	private static Map<Integer,Employee> map = new HashMap<>();
	/**
	 * @return List
	 * Creating New List
	 */

	public static List<Employee> getListDBInstance() {
		/*
		 * if (list == null) { list = new LinkedList<>(); } else { list = null; list =
		 * new LinkedList<>(); }
		 */
		return list;
	}
	/**
	 * @return Map
	 * Creating New Map to Store Data
	 */
	public static Map<Integer, Employee> getMapDBInstance(){
		return map;
	}
}
