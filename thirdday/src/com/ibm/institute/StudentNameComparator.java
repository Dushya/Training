package com.ibm.institute;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student>
{
	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return (arg0.getAge()-arg1.getAge());
	}
}
