package com.ibm.institute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StudentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set studentSet = new TreeSet();
		studentSet.add(new Student("z",90,20,45));
		studentSet.add(new Student("a",60,3,56));
		studentSet.add(new Student("x",100,2,65));
for(Object student : studentSet)
{
	Student student2 = (Student) student;
	System.out.println(student2.getName() + " " + student2.getScore()+ " "+student2.getAge());
}
 Set studentNameSet = new TreeSet(new StudentNameComparator());
 studentNameSet.addAll(studentSet);
 for (Object student : studentNameSet)
 {
	 Student student2 = (Student) student;
	 System.out.println(student2.getName() + " " + student2.getScore()+ " " +student2.getAge());
 }
 
 Set studentRollSet = new TreeSet(new StudentRollComparator());
 studentRollSet.add(new Student ("a",120,22,3));
 studentRollSet.add(new Student ("b",120,2,1));
 studentRollSet.add(new Student ("c",120,20,9));
 
 for (Object student : studentRollSet)
 {
	 Student student2 = (Student) student;
	 System.out.println(student2.getName() + " " + student2.getScore()+ " " +student2.getRollno()+ " " +student2.getAge());
 }	
 
List studentList = new ArrayList();
studentList.add(new Student("d",34,56,7));
studentList.add(new Student("p",45,34,2));
studentList.add(new Student("d",23,65,2));
studentList.add(new Student("d",23,65,2));

Collections.sort(studentList, new StudentRollComparator());
for(Object student : studentList)
{
	Student student3 =(Student) student;
	System.out.println(student3.getName()+" "+student3.getScore());
}

	
}

}
