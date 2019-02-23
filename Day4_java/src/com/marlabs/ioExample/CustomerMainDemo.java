package com.marlabs.ioExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CustomerMainDemo {

	
	public static void Serializing(final Customer customer )  {
		FileOutputStream fileoutputstream = null;
		ObjectOutputStream objectoutputstream = null;
		try {
		fileoutputstream = new FileOutputStream("src/demo.txt");
		objectoutputstream = new  ObjectOutputStream(fileoutputstream);
		objectoutputstream.writeObject(customer);
		System.out.println("DAta Written Successfully");
		
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		 catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(fileoutputstream != null) {
					fileoutputstream.close();
				}
				if(objectoutputstream != null) {
					objectoutputstream.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
			
		}
	
		
	}
	
	public static Customer DeSerializing() {
		FileInputStream fileinputstream = null;
		ObjectInputStream objectinputstream = null;
		Customer customer = null;
		try {
			fileinputstream = new FileInputStream("src/demo.txt");
			objectinputstream = new ObjectInputStream(fileinputstream);
			Object object = objectinputstream.readObject();
			 customer = (Customer)object;
			
			
		}
		catch(ClassNotFoundException | FileNotFoundException  e) {
			e.printStackTrace();
		}
//		catch (FileNotFoundException e) 
//		{
//			e.printStackTrace();
//		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(fileinputstream != null) {
					fileinputstream.close();
				}
				if(objectinputstream != null) {
					objectinputstream.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
			
		}
		return customer;
		
	}
	
	public static void main(String[] args) {
		System.out.println("********************************************");
		
		System.out.println("1) Serializable");
		System.out.println("2) De-Serializable");
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Make A choise:");
		int Choise = scanner.nextInt();
		Customer customer = new Customer(21, "manav", "123@123", "Albany", 12203);
		switch(Choise) {
		case 1:
			
			Serializing(customer);
			break;
		
		case 2:
			Customer customer2 = DeSerializing();
			System.out.println(customer2);
			if(customer == customer2) {
				System.out.println("Same Memory");
			}
			else
			{
				System.out.println("Different Memory");
			}
		    break;
		    
		case 3:
			System.exit(0);
			break;
		
		}
		scanner.close();
		
		
		
		System.out.println("********************************************");
	}

}
