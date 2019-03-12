package com.marlabs.tostring;

public class TraineeDemo {
	public static void main(String args[]) {
		System.out.println("main methode starts......");
		
		MarlabsTrainee t = new MarlabsTrainee(12, "Manav", "NJ", "NY", "JAVA");
		System.out.println(t.toString());
		MarlabsTrainee t1 = new MarlabsTrainee(23, "Ravi");
		System.out.println(t1);
     
      System.out.println();
      System.out.println();
		System.out.println("main methode ends......");
	}

}
