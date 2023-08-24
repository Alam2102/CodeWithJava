package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, 29, "Raj", new Address("street1", 201));
		Employee e2 = new Employee(4, 25, "Ayan", new Address("street3", 301));
		Employee e3 = new Employee(3, 21, "Sunena", new Address("street4", 101));
		Employee e4 = new Employee(5, 18, "Rohit", new Address("street2", 501));
		Employee e5 = new Employee(2, 50, "Boss", new Address("street5", 401));

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		// System.out.println(list);

		Collections.sort(list, new AgeComparator());
		// System.out.println("compare based on age" + list);

		Collections.sort(list, new NameComparator());
		//System.out.println("compare based  on name" + list);

		Collections.sort(list, new AddresssComparator());
		System.out.println("compare based on pincode" + list);

	}

}
