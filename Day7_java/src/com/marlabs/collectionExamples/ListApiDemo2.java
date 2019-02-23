package com.marlabs.collectionExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// List Iterator
public class ListApiDemo2 {
public static void main(String[] args) {
	System.out.println("I am from Main Method...........");
	List<String> list = new ArrayList<String>();
	List<Object> list1 = new ArrayList<Object>();
	list.add("manav");
	list.add("snck");
	list.add("bcek");
	list.add("bcfeuiahflwo");
	list.add("patel");
	list.add("bqvdwy");
	list.add("w/nf");
	Collections.sort(list);
	list1.add("Manav");
	list1.add("snck");
	list1.add(new Date());
	list1.add(new Date());
	list1.add(123);
	list1.add(23);
	list1.add(9);
	System.out.println(list);
	
	System.out.println("Iterators..... Interface");
	Iterator<Object> itr = list1.iterator();
			while(itr.hasNext()) {
				
				if(itr.next() instanceof Integer) {
					int d = (Integer) itr.next();
					System.out.println(d);
				}
				System.out.println(itr.next());
				
			}
			
			
}
}
