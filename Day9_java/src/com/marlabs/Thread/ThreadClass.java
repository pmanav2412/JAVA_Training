package com.marlabs.Thread;

public class ThreadClass {
	public static void main(String[] args) {
		Thread MainThread = Thread.currentThread();
		System.out.println("Main Thread= "+ MainThread);
		MainThread.setName("FIrst Thread");
		System.out.println("to String"+ MainThread.toString());
		System.out.println("Name "+MainThread.getName());
		System.out.println("max P "+ MainThread.MAX_PRIORITY );
		System.out.println("max P "+ MainThread.MIN_PRIORITY );
		System.out.println("max P "+ MainThread.NORM_PRIORITY );		
		System.out.println(MainThread.isAlive());
		MainThread.setPriority(10); 
	}

}
