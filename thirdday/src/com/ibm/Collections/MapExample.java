package com.ibm.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {
 public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("2", "one");
	map.put("1","two");
	System.out.println(map.size());
	System.out.println(map.get("1"));
	Set keys = map.keySet();
	for(Object o : keys)
	{
		System.out.println(o);
	}
	Map<String, String> treeMapExample = new TreeMap<String, String>(map);
	keys = treeMapExample.keySet();
	for(Object o : keys)
	{
		System.out.println(o);
	}
	
}
}
