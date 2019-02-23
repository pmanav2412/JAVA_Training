package com.marlabs.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class PracticeExample {
	public static void main(String[] args) {
		// LinkedList<Integer> obj = new LinkedList<Integer>();
		// obj.add(1);
		// obj.add(7);
		//
		// PriorityQueue<Integer> q = new PriorityQueue<>();
		// for (int i = 10; i > 0; i--) {
		// q.add(i);
		//
		// }
		// System.out.println(q);
		// System.out.println(q.peek());
		// System.out.println(q.poll());

		// legacy/ normal

		HashSet<String> s = new HashSet<>();
		TreeSet<String> l = new TreeSet<>();

		l.add("Manav");
		l.add("Harshini");
		s.add("Manav");
		s.add("RAvi");
		s.add("DArshan");
		s.add("Pranav");
		l.add("Manav");
		l.add("RAvi");
		l.add("DArshan");
		l.add("Pranav");

		System.out.println(s);
		System.out.println(l);

		for (String p : s) {
			System.out.println(p);
		}

		Iterable<String> o = new ArrayList<String>();
		ArrayList<String> a = new ArrayList<>();
		o.iterator();
		a.iterator();

	}

}
