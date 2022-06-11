package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlJDBC {
    private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/psa_db","root", "Mysql@123");
		   System.out.println("enter the choice");
			System.out.println("delete record from the table");
			int choice =Integer.parseInt(sc.nextLine());
			Statement stmnt=con.createStatement();
		     String query= "select* from registration";
		     ResultSet rs=stmnt.executeQuery(query);
		     while(rs.next()) {
		    	 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		     }
		    	 con.close();
		} catch (SQLException e) {
		    System.out.println("error");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public void deleteRecord()

}
