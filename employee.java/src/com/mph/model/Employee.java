package com.mph.model;

import java.util.Comparator;

import java.io.Serializable;
public class Employee implements Serializable {
	
	//public static Comparator nameComparator;
	private int eid;
	private String ename;
	private Salary salary;
	//private String dept;
	public Employee() {
		System.out.println("From Emp constr...");
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getEid() {
		return eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}	

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}
	/*public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}*/

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary  + "]";
	}
   public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
	 @Override 
   public int compare(Employee e1, Employee e2) {
		return (e1.getEname().compareTo(e2.getEname()));
	}

};
}
	