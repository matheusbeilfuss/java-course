package application;

import java.util.Locale;
import java.util.Scanner;

import entitities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("How many employees will be registered? ");
		int n = sc.nextInt();
		
		Employee[] employees = new Employee[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("\nEmployee #" + (i+1));
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employees[i] = new Employee(id, name, salary);
		}
		
		System.out.printf("\nEnter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employee selectedEmployee = null;
		
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				selectedEmployee = employee;
			}
		}
		
		if (selectedEmployee == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.printf("Enter the percentage: ");
			double percentage = sc.nextDouble();
			selectedEmployee.increaseSalary(percentage);
		}
		
		System.out.println("\nList of employees: ");
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
		
		sc.close();
	}

}
