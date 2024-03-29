package com.javainuse.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Employee.class)
public class Employee {

	private String empName;
	private String empId;


	public int getAge() {
		return 14;
	}	
	
//	public String getEmpName() {
//		return empName;
//	}
//
//	public void setEmpName(String empName) {
//		this.empName = empName;
//	}
//
//	public String getEmpId() {
//		return empId;
//	}
//
//	public void setEmpId(String empId) {
//		this.empId = empId;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empName=" + empName + ", empId=" + empId + "]";
//	}	

}