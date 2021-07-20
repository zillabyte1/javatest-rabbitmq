package com.javainuse.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class EmployeeTest {

	@Test
	void testCreate () {
		Employee emp = new Employee();
		assertNotNull(emp);
	}
	
	@Test
	void testGetAge() {
		Employee emp = new Employee();
		assertEquals(14,emp.getAge());
		
	}
	
}
