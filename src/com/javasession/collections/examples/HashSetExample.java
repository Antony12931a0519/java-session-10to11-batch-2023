package com.collections.list;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<Employee> employess = new HashSet<Employee>();

		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Abc");

		employess.add(emp);

		Employee emp1 = new Employee();
		emp1.setId(1031);
		emp1.setName("Abcd");
		employess.add(emp1);

		for (Employee employee : employess) {
			// System.out.println("Hello");
			System.out.println(employee);
		}

	}
}
