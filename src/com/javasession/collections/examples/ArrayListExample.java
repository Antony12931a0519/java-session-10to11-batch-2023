package com.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<Employee> employess = new ArrayList<Employee>();

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
