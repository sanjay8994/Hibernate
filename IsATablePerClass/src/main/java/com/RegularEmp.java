package com;
import javax.persistence.*;

@Entity
@Table(name="regEmp102")

@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="name"))
	})

public class RegularEmp extends Employee {

	private float salary;
	
	public RegularEmp(float salary, int bonus) {
		super();
		this.salary = salary;
		this.bonus = bonus;
	}
	private int bonus;
	
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public RegularEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
