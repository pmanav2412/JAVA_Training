package com.demo.oca;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;


 class Chap1 {
     
	static int[] asd = new int[]{23,14,34};
	static String i="Hello";
	public static void main(String[] args) {
		
		/// reference variable
		Date date = new Date();
		String s = "Manav";
		System.out.println(s.toString() + " " + date);
		
		/// casting
		short a= (short)32769;
		System.out.println(a);
		short v=2,b=2;
		Date d = new Date();
		System.out.println(d instanceof java.util.Date);
		
		int m = 10;
		int mm = 10;
		//System.out.println(m.equals(mm) ^ m.equals(mm));
		
		String s1 = "manav1";
		System.out.println(s=s1);
		
		
		int x = 4;
		int y = 5;
		boolean z = (x>3) | (y++>5);
		System.out.println(y);
		
		int r = 20; while(r>0) {
			do {
			r -= 2;
			} while (r>5);
			r--; System.out.print(r+"\t");
			}
        x=5;
		System.out.println();
		System.out.println(x < 2 ? x == 4 ? 10 : 8 : 7);
		
//		for(int i=0; i<10 ; ) {
//			i=i++;
//			 System.out.println(i);
//			 System.out.println("Hello World");
//			 }
		
		boolean b1;
		System.out.println(b1=false);
		
		System.out.println("hello".startsWith("he") + "   bcukb");
		System.out.println("   nrir rvinv vrnv m nckl \r".trim());
		
		StringBuilder s2 = new StringBuilder("manav");
		System.out.println(s2.hashCode());
		
		 StringBuilder s3 = new StringBuilder("patel");
		System.out.println(s3.hashCode());
		
		s3 = s2.append("shah");
		System.out.println(s2 + "    " + s2.hashCode());
		System.out.println(s3 + "    " + s3.hashCode());
		 s3 = s3.append("f").append("g"); 
		 System.out.println("a=" + s2);
		 System.out.println("b=" + s3);
	     System.out.println(s2==s3);
	     
	     StringBuilder sb = new StringBuilder();
	     StringBuilder sb1 = new StringBuilder();
	     System.out.println(sb.equals(sb1));
	     
	     	
	     
	     Chap1 ch = new Chap1();
	    
	     
	     System.out.println(java.util.Arrays.toString(ch.asd));
	     String st[];
	     String[] st1 = new String[3]; 
	     System.out.println( " " + st1);
	     
	     

	     String[] strings = { "stringValue" };
	     Object[] objects = strings;
	     String[] againStrings = (String[]) objects;
//	     againStrings[0] = new StringBuilder(); 
	     System.out.println(java.util.Arrays.toString(strings) + "   " + java.util.Arrays.toString(objects) + "   " + java.util.Arrays.toString(againStrings));
	     
	      int[] numbers = new int[10];
	      for (int i = 0; i < numbers.length; i++) 
	    	 System.out.println(numbers[i] = i + 5); 
	      
	      int[] asd = new int[]{23,14,34};

	      int[] asd1 = new int[]{23,14,34};
	 
		  Arrays.sort(asd);
		  System.out.println(java.util.Arrays.toString(asd));
		  
		  ArrayList<Integer> al = new ArrayList(10);
		  ArrayList al1 = new ArrayList();
		  System.out.println(al.hashCode() + "   " +  al1.hashCode());
		  
		  
		  String[] array = { "hawk", "robin" };
		  List<String> list = Arrays.asList(array);
		  System.out.println(list.size());
		  list.set(1, "test");
		  array[0] = "new";
		  List<String> list1 = new ArrayList<String>(list);
		  list1.remove(0);
		  
		  LocalDate l =LocalDate.of(2015, Month.JANUARY, 3);
		  System.out.println(l);
		  al.add(null);
		  al.add(Integer.parseInt("5"));
		  System.out.println(al);
		  System.out.println(asd.equals(asd1));
		 
		  
	}
	 @Override
		public String toString() {
			return String.format("Chap1 [asd=%s, i=%s]", Arrays.toString(asd), i);
		}
	
	
}
 

	
