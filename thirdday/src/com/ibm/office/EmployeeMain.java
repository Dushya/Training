package com.ibm.office;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ibm.institute.Student;
import com.ibm.institute.StudentRollComparator;

public class EmployeeMain {

	
	public static void main(String[] args) {
		  List employees = new ArrayList();
		  employees.add(new Employee("123","dush","software",5));
		  employees.add(new Employee("456","sham","sales",4));
		  employees.add(new Employee("789","jp","marketing",3));
		  for(Object o: employees)
			  if(o instanceof Employee)
			  {
				  Employee employee = (Employee)o;
				  System.out.println(employee.getEmpName()+" "+employee.getEmpId()+" "+employee.getEmpDept()+" "+employee.getExperience());
			  }
		  Collections.sort(employees);
		  for(Object o: employees)
			  if(o instanceof Employee)
			  {
				  Employee employee = (Employee)o;
				  System.out.println(employee.getEmpName()+" "+employee.getEmpId()+" "+employee.getEmpDept()+" "+employee.getExperience());
			  }
		  Set EmployeeDeptSet = new TreeSet(new EmployeeDeptComparator());
		  EmployeeDeptSet.add(new Employee ("123","dush","software",5));
		  EmployeeDeptSet.add(new Employee("7474","djf","marketng",6));
		  EmployeeDeptSet.add(new Employee("76","jidjf","testing",9));
		  for (Object employee : EmployeeDeptSet)
		  {
		 	 Employee employee2 = (Employee) employee ;
		 	 System.out.println(employee2.getEmpName() + " " + employee2.getEmpId()+ " " +employee2.getEmpDept()+ " " +employee2.getExperience());
		  }	
	}

}
