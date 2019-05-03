package com.demo.oca;

import com.demo.ch4.Cha4;

public class hjh {
	 int counter=0;
	public static void main(String[] args) {
//		String a=Chap1.i;
//		Chap1 ch = new Chap1();
//		System.out.println(ch.i);
//		ch= null;
//		System.out.println(ch.asd);
        
		hjh h = new hjh();
		hjh h1 = new hjh();
		hjh h2 = new hjh();
		System.out.println(h2.hjh() + " " +h2.hjh());
		
		Cha4 c4 = new Cha4();
		
		
	}



	public int hjh(){
		counter++;
		return counter;
	}

	protected int a;

	protected void cricker() {
		System.out.println("I am Cricket!");
	}

}
