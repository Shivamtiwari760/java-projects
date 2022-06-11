package com.cdac;
import java.util.Scanner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FirstJdbc {

	public static void main(String[] args) {
		int choice=0;
		do {
		System.out.println("1-registration \n 2-delete record\n 3-show all");
		Scanner inp=new Scanner(System.in);
		 choice=inp.nextInt();
		
		switch(choice){
		case 1:
			register();
			break;
		case 2:
			delete();
			break;
		case 3:
			showall();
			break;
		case 4:
			break;
		default:
			System.out.println("enter valid number");
			}
		}
		while(choice !=4);
		
			
			
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter your name");
//		String name = sc.next();
//		System.out.println("enter your email");
//		String email = sc.next();
		
//		try {
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/psa_db", "root", "Mysql@123");
//			System.out.println(con);
//			Statement stmnt = con.createStatement();
//			stmnt.executeUpdate("delete from registration where name='" + name + "' && email='" + email + "'");
//			System.out.println("deleted successfully");
//			con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("error");
//		}
	}
		public static void delete( ) {
			String name;
			try {
				//getClass().forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentreg", "root", "Mysql@123");
				//System.out.println(con);
				Statement stmnt = con.createStatement();
				Scanner inp=new Scanner(System.in);
				System.out.println("enter name");
				name=inp.nextLine();
				stmnt.executeUpdate("delete from student where name='" + name + "'");
				System.out.println("deleted successfully");
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("error");
			}
		}
		public  static void register() {
			String name;
			String country;
			String mark;
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentreg", "root", "Mysql@123");
				Statement stmnt = con.createStatement();
				Scanner inp=new Scanner(System.in);
				System.out.println("enter your name");
				name=inp.nextLine();
				System.out.println("enter your country");
				country=inp.nextLine();
				System.out.println("enter your mark");
				mark=inp.nextLine();
				stmnt.executeUpdate("insert into student values('"+name+"','"+country+"','"+mark+"')");
				System.out.println("record saved");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		public static void showall() {
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentreg", "root", "Mysql@123");
				Statement stmnt = con.createStatement();
				ResultSet result=stmnt.executeQuery("select * from student");
				while(result.next()) {
					System.out.print(result.getString(1)+" ");
					System.out.print(result.getString(2)+" ");
					System.out.print(result.getString(3));
					System.out.println();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}