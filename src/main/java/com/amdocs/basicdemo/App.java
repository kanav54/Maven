package com.amdocs.basicdemo;

/**
 * Hello world!
 *
 */

class Employee{
	String name;
	double salary;
	int id;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public Employee(String name,Double salary,int id) {
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	
}


public class App 
{
	
    public static void main( String[] args )
    {
        Employee emp=new Employee("Kanav",2000.00,101);
        System.out.println(emp.getId()+"-"+emp.getName()+"-"+emp.getSalary());
        emp.setId(102);
        emp.setName("Brajesh");
        emp.setSalary(10000.00);
        System.out.println(emp.getId()+"-"+emp.getName()+"-"+emp.getSalary());
        
    }
}
