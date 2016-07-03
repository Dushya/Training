package com.ibm.office;

public class Employee implements Comparable <Employee>{
private String empId;
private String empName;
private String empDept;

public Employee(String empId,String empName,String empDept,int experience)
{
	this.empId=empId;
	this.empName=empName;
	this.empDept=empDept;
	this.experience=experience;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDept() {
	return empDept;
}
public void setEmpDept(String empDept) {
	this.empDept = empDept;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
private int experience;

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return (this.experience-o.getExperience());
}

}
