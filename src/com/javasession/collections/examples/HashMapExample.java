package com.collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		Map<String, List<Employee>> employeDetails = new HashMap<String, List<Employee>>();

		List<Employee> emps = new ArrayList<>();

		Employee emp = new Employee();
		emp.setId(123);
		emp.setName("Abcd");
		emps.add(emp);

		Employee emp1 = new Employee();
		emp1.setId(1233);
		emp1.setName("Abcdd");

		emps.add(emp1);
		employeDetails.put("CSE", emps);

		for (Entry<String, List<Employee>> entry : employeDetails.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}
