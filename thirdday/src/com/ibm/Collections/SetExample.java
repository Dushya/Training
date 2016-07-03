package com.ibm.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
public static void main(String[] args) {
	int[] i={5,4,3,2,1};
	Set hashSetCollection = new HashSet();
	Set linkedSetCollection = new LinkedHashSet();
	Set treeSetCollection = new TreeSet();
	
	
	for(int index=0;index<i.length;index++)
	{
		hashSetCollection.add(new Integer(i[index]));
		linkedSetCollection.add(new Integer(i[index]));
	    treeSetCollection.add(new Integer(i[index]));
	  
	}
System.out.println(hashSetCollection.size());
System.out.println(linkedSetCollection.size());
System.out.println(treeSetCollection.size());

System.out.println(hashSetCollection);
System.out.println(linkedSetCollection);
System.out.println(treeSetCollection);
}
}

