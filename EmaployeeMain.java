package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmaployeeMain {
     
	//filter it by group by name
	public static void main(String[] args) {
		List<Employee> employeeList = createEmployeeList();
		Map<String, List<Employee>> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getName));
		map.forEach((name,employeeListTemp)->
		System.out.println("name :"+name+"=>"+employeeListTemp));
		
	}

	public static List<Employee> createEmployeeList() {

		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("John", 21);
		Employee e2 = new Employee("Martin", 19);
		Employee e3 = new Employee("Mary", 31);
		Employee e4 = new Employee("Mary", 18);
		Employee e5 = new Employee("John", 26);

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		return list;

	}

}
