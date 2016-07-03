package com.ibm.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumClass {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("a");
		v.add("b");
		v.add("c");
		
		Enumeration enumeration = v.elements();
		while(enumeration.hasMoreElements())
		{
			Object o = enumeration.nextElement();
			System.out.println(o);
		}
		
	}
}
