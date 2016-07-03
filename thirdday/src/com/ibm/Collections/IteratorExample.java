package com.ibm.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(1);
		c.add("A");
		c.add(4.5F);
		System.out.println(c.size());
		Iterator iterator = c.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(c.size());
	
	iterator = c.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	}
}
