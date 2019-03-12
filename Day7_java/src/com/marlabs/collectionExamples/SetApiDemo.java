package com.marlabs.collectionExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 *   Set Interface Doesnt Allow Duplicate values.
 *   Random Order.
 *   Allows Only one Null values.
 */
public class SetApiDemo implements Comparable<SetApiDemo> {

	String Name;
	String LatName;
	String City;
	String ID;

	/**
	 * @param name
	 * @param latName
	 * @param city
	 */
	public SetApiDemo(String name, String latName, String city, String id) {
		Name = name;
		LatName = latName;
		City = city;
		ID = id;
	}

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		Set<String> linkedset = new LinkedHashSet<String>();
		set.add("India");
		set.add("Australia");
		set.add("Japan");
		set.add("China");
		linkedset.add("India");
		linkedset.add("Australia");
		linkedset.add("Japan");
		linkedset.add("China");
		System.out.println(set);
		System.out.println(linkedset);

		////////// tree Set
		Set<String> s = new TreeSet<>();
		s.add("Manav");
		s.add("Ravi");
		s.add("Niyanta");
		s.add("DAtshan");
		// s.add(null);
		s.add("Manav");
		s.add("Pooja");
		System.out.println(s);

		////////// Constructor (own Object)

		Set<SetApiDemo> s2 = new LinkedHashSet<SetApiDemo>();
		Set<SetApiDemo> s1 = new TreeSet<SetApiDemo>();
		Set<SetApiDemo> s3 = new HashSet<SetApiDemo>();

		SetApiDemo d1 = new SetApiDemo("Manav", "Patel", "Bharuch", "P100");
		SetApiDemo d2 = new SetApiDemo("Ravi", "Parikh", "Bharuch", "P101");
		SetApiDemo d3 = new SetApiDemo("Abhishek", "Shah", "Bharuch", "P321");
		SetApiDemo d4 = new SetApiDemo("Aj", "Solanki", "Bharuch", "P345");
		SetApiDemo d5 = new SetApiDemo("Kaushik", "Vasava", "Bharuch", "P097");
		SetApiDemo d6 = new SetApiDemo("Deep", "Makwana", "Bharuch", "E437");
		SetApiDemo d7 = new SetApiDemo("Himashu", "Kashwala", "Bharuch", "F954");
		SetApiDemo d8 = d1;
		s1.add(d1);
		s1.add(d2);
		s1.add(d3);
		s1.add(d4);
		s1.add(d5);
		s1.add(d6);
		s1.add(d7);
		s1.add(d8);

		for (SetApiDemo c1 : s1) {
			System.out.println(c1);
		}
		System.out.println(s1);

		////////
		Set<SetApiDemo> s4 = new TreeSet<SetApiDemo>();

		s4.addAll(s1);
		System.out.println(s4);

	}

	@Override
	public String toString() {
		return String.format("SetApiDemo [Name=%s, LatName=%s, City=%s, ID=%s]", Name, LatName, City, ID);
	}

	public String getName() {
		return Name;
	}

	public String getLatName() {
		return LatName;
	}

	public String getCity() {
		return City;
	}

	public String getID() {
		return ID;
	}

	@Override
	public int compareTo(SetApiDemo o) {
		// System.out.println("This Is CompareTo MEthod..");
		return this.ID.compareTo(o.ID);
	}

	@Override
	public int hashCode() {
		System.out.println("This Is hashcode MEthod..");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((City == null) ? 0 : City.hashCode());
		result = prime * result + ((LatName == null) ? 0 : LatName.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("This Is Equals MEthod..");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SetApiDemo other = (SetApiDemo) obj;
		if (City == null) {
			if (other.City != null)
				return false;
		} else if (!City.equals(other.City))
			return false;
		if (LatName == null) {
			if (other.LatName != null)
				return false;
		} else if (!LatName.equals(other.LatName))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}
}
