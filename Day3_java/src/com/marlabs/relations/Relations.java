package com.marlabs.relations;

public class Relations {
	public static void main(String[] args) {

	}

}

class Demo {
	protected int i;
}

class Demo1 extends Demo {

}

class Demo2 extends Demo1 {
	{
		i = 20;
	}

	void Display() {
		System.out.println(i);
	}
}
