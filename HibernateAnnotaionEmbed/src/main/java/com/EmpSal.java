package com;

import javax.persistence.Embeddable;


@Embeddable
public class EmpSal {

	private int salary;
	private String joinYear;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getJoinYear() {
		return joinYear;
	}
	
	@Override
	public String toString() {
		return "EmpSal [salary=" + salary + ", joinYear=" + joinYear + "]";
	}
	public void setJoinYear(String joinYear) {
		this.joinYear = joinYear;
	}
	
	
}
