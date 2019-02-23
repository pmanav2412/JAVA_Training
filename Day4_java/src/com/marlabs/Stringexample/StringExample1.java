package com.marlabs.Stringexample;

public class StringExample1 {
   public static void main(String[] args) {
	System.out.println("main starts..... ");
	String[] s = {"wbud76","gudyw34yh","234cdb"};
	
	String s12 = StringExample1.mirroImage("POOJA");
	int a = StringExample1.Count(s);
	System.out.println(a);
	
	System.out.println("main ends..");
}
   
   ///////////
   
   public static Integer Count(String[] s) {
	   int Total_Sum = 0;
	   for(String s1:s) {
		   char[] cha= s1.toCharArray();
		   System.out.println(s1);
		   for(char c:cha) {
			   if(Character.isDigit(c)) {
				   Total_Sum = Total_Sum + Character.getNumericValue(c);
			   }
			   System.out.println(c);
		   }
	   }
	   return Total_Sum;
	   
   }
   
   public static String mirroImage(String input) {
	   StringBuffer s = new StringBuffer(input);
	   s.reverse();
	 
	   String s1= input + "||" + s;
	  
	   
	  
	   
	   return s1.toString();
   }
   
   
}
