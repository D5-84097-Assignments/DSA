package com.sunbeam;

class Emp 
{
	private int empid;
	private String name;
	private float salary;
	
	public Emp(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public float getSalary() {
		return salary;
	}		

}

public class SearchEmp {
	
		public static void main(String[] args) {
		Emp arr[] = new Emp[3];
		
		arr[0] = new Emp(101,"Amit",5000);
		arr[1] = new Emp(102,"Mahesh",9000);
		arr[2] = new Emp(103,"Queen",12000);
		
		int idfind = 102;
		String namefind = "Mahesh";
		float salaryfind = 12000;
		
		Emp foundbyid = findbyid(arr,idfind);
		Emp foundbyname = findbyname(arr, namefind);
		Emp foundbysalary = findbysalary(arr,salaryfind);
		
		if(foundbyid != null)
		{
			System.out.println("Employee found by id" + foundbyid.getEmpid() + "," + foundbyid.getName() + "," + foundbyid.getSalary());
		}
		else
		{
			System.out.println("Employee not found by id");
		}
		
		if(foundbyname != null)
		{
			System.out.println("Employee found by name" + foundbyname.getEmpid() + "," + foundbyname.getName() + "," + foundbyname.getSalary());
		}
		else
		{
			System.out.println("Employee not found by name");
		}
		
		if(foundbysalary != null)
		{
			System.out.println("Employee found by salary" + foundbysalary.getEmpid() + "," + foundbysalary.getName() + "," + foundbysalary.getSalary());
		}
		else
		{
			System.out.println("Employee not found by salary");
		}

	}

		private static Emp findbysalary(Emp[] arr, float salaryfind) {
			for(Emp e:arr)
			{
				if(e != null && e.getSalary() == salaryfind)
				{
					return e;
				}
			}
			return null;
		}

		private static Emp findbyname(Emp[] arr, String namefind) {
			for(Emp e:arr)
			{
				if(e != null && e.getName() == namefind)
				{
					return e;
				}
			}
			return null;
		}

		private static Emp findbyid(Emp arr[], int idfind) {
			for(Emp e:arr)
			{
				if(e != null && e.getEmpid() == idfind)
				{
					return e;
				}
			}
			return null;
		}

}
