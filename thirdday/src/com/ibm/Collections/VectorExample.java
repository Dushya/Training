package com.ibm.Collections;

import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector v=new Vector(3,2);
		System.out.println("initial size:"+v.size());
		System.out.println("initial capacity"+v.capacity());
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println(v.size());
		System.out.println("final capacity"+v.capacity());
		
		
	}

}
