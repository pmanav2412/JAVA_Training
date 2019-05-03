package com.demo.ch4;

import java.util.ArrayList;

import com.demo.oca.hjh;

public class Cha4 extends hjh{
	
	static int a=8;
	int c =0;
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("manav");
		cha5 c5 = new cha5(sb);
		sb.append(" patel");
//		System.out.println(c5.getBuilder());
		String sb1 = c5.getBuilder();
		Cha4 c4 = new Cha4();
//		Cha4 c44 = null;
		 c4.hello(9);
//		System.out.println(sb1.concat(" anitbhai"));
		
		int b =34;
		b= a+b;
	     a= a+b;
		System.out.println(a);
	
	
			
	}
	public static void hello(int a) {
		System.out.println("Hello manav");
		Cha4 c44 = new Cha4();
		c44.a =a;
		System.out.println(a);
	}
	
//	{
//		System.out.println("hello block");
//	}
	
}
