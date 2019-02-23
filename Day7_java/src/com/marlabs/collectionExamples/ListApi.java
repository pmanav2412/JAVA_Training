package com.marlabs.collectionExamples;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class ListApi {
	public static void main(String[] args) {
		System.out.println("Main Method Starts...");
		
		List  list = new ArrayList<>();
		int size = list.size();
		boolean isEmpty = list.isEmpty();
		//System.out.println(size +" "+ isEmpty);
		
		list.add("manav");
		list.add(3);
		list.add(new Date());
		System.out.println(list);
		System.out.println(list.add(3));
		// System.out.println(list.contains("manav"));
		System.out.println(list);
		Object object[] = list.toArray();
		System.out.println(object);
		for(Object o : object) {
			System.out.println(o);
		}
		
		System.out.println(list);
	
	}
}
