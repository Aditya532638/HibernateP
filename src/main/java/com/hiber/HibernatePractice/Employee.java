package com.hiber.HibernatePractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
	
	@Id
	private int EId;
	private String EName;
	private String EDepartment;
	private int ESalary;
	public int getEId() {
		return EId;
	}
	public void setEId(int eId) {
		EId = eId;
	}
	public String getEName() {
		return EName;
	}
	public void setEName(String eName) {
		EName = eName;
	}
	public String getEDepartment() {
		return EDepartment;
	}
	public void setEDepartment(String eDepartment) {
		EDepartment = eDepartment;
	}
	public int getESalary() {
		return ESalary;
	}
	public void setESalary(int eSalary) {
		ESalary = eSalary;
	}
	public Employee(int eId, String eName, String eDepartment, int eSalary) {
		super();
		EId = eId;
		EName = eName;
		EDepartment = eDepartment;
		ESalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [EId=" + EId + ", EName=" + EName + ", EDepartment=" + EDepartment + ", ESalary=" + ESalary
				+ "]";
	}
	
	 public Employee() {}
	

}
