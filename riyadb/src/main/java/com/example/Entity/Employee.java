package com.example.Entity;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@Table(name = "EMPLOYEE")
	
	public class Employee {
	 
	     
	    @Id
	
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	    @SequenceGenerator(name = "emp_seq", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
	    private int empId;
	      
	    @Column(name="firstName")
	    private String firstName;
	      
	    @Column(name="lastName")
	    private String lastName;
	      
	    @Column(name="email", nullable=false, length=200)
	    private String email;
	//generate getters and setters

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
					+ email + "]";
		}
	    
	}

