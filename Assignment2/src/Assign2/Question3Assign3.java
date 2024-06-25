package Assign2;

import java.util.Arrays;

class Employee
{
	private double salary;
	private String name;
	private int id;
	
	
	public Employee()
	{
		
	}
	
	public Employee(double salary, String name, int id) {
		super();
		this.salary = salary;
		this.name = name;
		this.id = id;
	}

	public static void sortSalary(Employee[] employeeSalary)
	{				
		 Employee temp;
		 int j;

		for(int i=1; i < employeeSalary.length; i++)
		{	
			j= i-1;
			temp = employeeSalary[i];
			while(j>=0 && employeeSalary[j].salary > temp.salary)
			{
				employeeSalary[j+1] = employeeSalary[j];
				j--;
			}
			employeeSalary[j+1] = temp;
		}
	}
	
	// sorting of salary in descinding order
	
	public static void sortDescSalary(Employee[] employeeSalary)
	{
		
		Employee temp;
		int j;
		
		for(int i=1; i< employeeSalary.length; i++)
		{
			j = i-1;
			temp = employeeSalary[i];
			
			while(j >= 0 && employeeSalary[j].salary < temp.salary)
			{
				employeeSalary[j+1]= employeeSalary[j];
				j--;
			}
			employeeSalary[j+1] = temp;
		
		}
	}

	@Override
	public String toString() {
		return "\nEmployee [salary=" + salary + ", name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}



public class Question3Assign3 {
	
	int temp;
	int j;
	
	public static void main(String[] args) {
		
		Employee employeeSalary[] = 
		{		
				new Employee(7500, "Abhishek", 5),
				new Employee(5000, "jayant", 7),
				new Employee(4000, "shorya", 10),
				new Employee(15000, "Vishal", 9),
				new Employee(20000, "Vedant", 7),
				new Employee(17000, "Pratap", 7)
		};
		
		//e1.sortSalary(employeeSalary);
		
		System.out.println("Before Sort Salary");
		
		System.out.println(Arrays.toString(employeeSalary));
		
	//	Employee.sortSalary(employeeSalary);
		
		Employee.sortDescSalary(employeeSalary);
		System.out.println("After Sort");
		
		System.out.println(Arrays.toString(employeeSalary));

		
		
	}

}
