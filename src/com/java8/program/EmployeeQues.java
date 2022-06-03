package com.java8.program;
import java.util.*;
import java.util.stream.Collectors;

import jdk.javadoc.internal.doclets.toolkit.util.Comparators;
public class EmployeeQues {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
        //https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		questiononEmployee(employeeList);

	}

	private static void questiononEmployee(List<Employee> employeeList) {
	//Q1 How many Male and female employee in the company
		//howManyMaleAndFemale(employeeList);
	
	//Q2 Print the name of all departments in the organization?
	//getNameOfDepartments(employeeList);
	
	//q3 .What is the average age of male and female employees?
	//MaleandFemaleAverage(employeeList);
	
	//q4-Get the details of highest paid employee in the organization?
//	getHighestPaidSalaryEmployee(employeeList);
	
	//q5.Query 3.5 : Get the names of all employees who have joined after 2015?
	//getNameEmployeeAfter2015(employeeList);
		
	//q6Count the number of employees in each department?
	//numberOfEmployeeEachDepartment(employeeList);
		
	//q7 Query 3.7 : What is the average salary of each department?
	//averageSalaryOfEachDepartment(employeeList);
	
	//q8. Get the details of youngest male employee in the product development department?
		//getYoungestMaleEmployeeObject(employeeList);
		
	//q9. Who has the most working experience in the organization?
	// mostExperienceWorkingPersonInGroup(employeeList);
	
	//q10. List down the names of all employees in each department?
	//nameOfEmployeeInEachDepartment(employeeList);
		
	//q11. What is the average salary and total salary of the whole organization?
	//summarizeDouble on EmployeeSalary which will return the max, min,average,total
		//averageSalaryandtotalSalary(employeeList);
		
	//q12.	
	}

	private static void averageSalaryandtotalSalary(List<Employee> employeeList) {
		DoubleSummaryStatistics i=	employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(i.getMax());
		System.out.println(i.getSum());
		System.out.println(i.getAverage());
		System.out.println(i.getCount());
	}

	private static void nameOfEmployeeInEachDepartment(List<Employee> employeeList) {
		Map<String,List<Employee>> oo=employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(oo);
	}

	private static void mostExperienceWorkingPersonInGroup(List<Employee> employeeList) {
		Optional<Employee> oo=  	employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));
			System.out.println(oo.get().getName());
			
		//Method 2
		Optional<Employee>	ii=		employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();	
			System.out.println(ii.get().getName());
		//method 3	
		Optional<Employee> ooo=employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
		System.out.println(ooo.get().getName());
	}

	private static void getYoungestMaleEmployeeObject(List<Employee> employeeList) {
		Optional<Employee>a=employeeList.stream().filter(x->x.getGender().equals("Male") && x.getDepartment().equals("Product Development")).collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		System.out.println(a.get().getName());
		
		//Method 2
		Optional<Employee> aa=	employeeList.stream().filter(x->x.getGender().equals("Male") && x.getDepartment().equals("Product Development")).min(Comparator.comparing(Employee::getAge));
		System.out.println(aa.get().getName());
	}

	private static void averageSalaryOfEachDepartment(List<Employee> employeeList) {
		Map<String, Double> aa=	employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
			System.out.println(aa);
	}

	private static void numberOfEmployeeEachDepartment(List<Employee> employeeList) {
		Map<String,Long> a=	employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
			System.out.println(a);
	}

	private static void getNameEmployeeAfter2015(List<Employee> employeeList) {
		List<String> a=	employeeList.stream().filter(x->x.getYearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());
			System.out.println(a);
	}

	private static void getHighestPaidSalaryEmployee(List<Employee> employeeList) {
		Optional<Employee>a=   employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(a.get().getName());
	}

	private static void MaleandFemaleAverage(List<Employee> employeeList) {
		Map<String,Double> jj	=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
			jj.entrySet().forEach(x->{
				System.out.println(x.getKey()+"  "+x.getValue());
			});
	}

	private static void getNameOfDepartments(List<Employee> employeeList) {
		List<String> a=	employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
			System.out.println(a);
	}

	private static void howManyMaleAndFemale(List<Employee> employeeList) {
		Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		collect.entrySet().forEach(x->{
			System.out.println(x.getKey()+"  "+x.getValue());
		});
	}

}
