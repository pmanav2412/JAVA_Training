package com.marlabs.collectionExamples;

import java.util.Comparator;

public class NameComparator  implements Comparator<SetApiDemo>{

	@Override
	public int compare(SetApiDemo o1, SetApiDemo o2) {
		
//		System.out.println("This is Compare Method...");
		return o1.getID().compareTo(o2.getID());
		
		
	}

}
