package com.marlabs.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class StatementInterfaceDemo {
	public static void main(String[] args) {
		System.out.println("MAin MEthod Starts.....");
		StatementApiExample statementApiExample = new StatementApiExample();
		Scanner scanner = new Scanner(System.in);
		try {
			// statementApiExample.getEmployeeSetails();
			// statementApiExample.getDatabaseMetaDataInformation();
			// statementApiExample.InsertEmpDetails("Jimit", "bhangiyo", "Winthrop", 12222,
			// "E114");
			// statementApiExample.CommitMultiplequery();
			for (int i = 0; i < 10; i++) {
				System.out.println("Enter Name");
				String name = scanner.nextLine();
				System.out.println("Enter Last name");
				String Lname = scanner.nextLine();
				System.out.println("Enter Address");
				String Add = scanner.nextLine();
				System.out.println("Enter pin");
				long pin = scanner.nextLong();
				System.out.println("Enter ID");
				String ID1 = scanner.nextLine();
				String ID = scanner.nextLine();
				statementApiExample.preparedStatement(name, Lname, Add, pin, ID);
			}
			scanner.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Main Method Ends..........");
	}
}
