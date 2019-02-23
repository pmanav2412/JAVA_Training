package com.marlabs.collectionExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListApiDemo3 {
	public static void main(String[] args) {
		
		
		///////////////////////////////////////////////////////////////////////
		
		List<String> list = new ArrayList<String>();
		list.add("India");
		list.add("Australia");
		list.add("USA");
		list.add("ENgland");
		list.add(null);
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String s= itr.next();
			
			if(s == null) {
				itr.remove();
			}
		}
		System.out.println(list);
		
		//////////////////////////////////////////////////////////
	
		List<String> list2 = new LinkedList<>();
	list2.add("India");
	list2.add("Australia");
	list2.add("Japan");
	list2.add("China");
	list2.add(null);
	System.out.println(list2);
	//list2.addAll(list);
	//System.out.println(list2);
	//list2.retainAll(list);
	//System.out.println(list2);
	list2.removeAll(list);
	System.out.println(list2);
	
	
//////////////////////////////////////////////////////////
	
	
}
}
