package com.ShnatWorld.CRUDD;

import java.sql.*;
import java.util.Scanner;

public class App {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {

		try {
			int choice = 0;
			Student s = new Student();
			do {
				System.out.println("Select an operation \n 1- Registration \n  2- Delete a Record \n 3- Show All");
				Scanner choicein = new Scanner(System.in);
				choice = choicein.nextInt();
				switch (choice) {
				case 1:
					s.getStudentDetails();
					int r = s.insertStudent();
					System.out.println(r);
					break;
				case 2:
					int r1 = s.deleteStudentRecord();
					System.out.println(r1);
					break;
				case 3:
					s.show_All();
					break;

				case 4:
					break;
				default:
					System.out.println("Select the correct choice");
				}
			} while (choice != 4);
			System.out.println("thanks");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class Student {
	private String name;
	private String country;
	private int mark;

	public void getStudentDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your Name");
		name = input.nextLine();
		System.out.println("Enter your Country");
		country = input.nextLine();
		System.out.println("Enter the mark");
		mark = input.nextInt();

	}

	public void show_All() {
		try {
			dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/studentreg", "root",
					"Mysql@123");
			Connection con = dbmsconnect.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next()) {

				String name = rs.getString(1);
				String country = rs.getString(2);
				int mark = rs.getInt(3);
				System.out.println("Name: " + name + " Country: " + country + " Mark: " + mark);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public int insertStudent()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		int r = 0;
		try {
			dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/studentreg", "root",
					"Mysql@123");
			Connection con = dbmsconnect.getConnection();
			Statement stmt = con.createStatement();
			r = stmt.executeUpdate("insert into student values('" + name + "','" + country + "','" + mark + "')");
			System.out.println("Record  inserted successfully");
			dbmsconnect.closeConnection(con, stmt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return r;
	}
	public int deleteStudentRecord()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/studentreg", "root", "Mysql@123");
		Connection con = dbmsconnect.getConnection();
		System.out.println("Enter the Name of the Student");
		Scanner input = new Scanner(System.in);
		String inputname = input.nextLine();
		String sql = "delete from student where name = ?;";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, inputname);
		int i = stmt.executeUpdate();
		if (i > 0) {
			System.out.println("Record Deleted Successfully");
		} else {
			System.out.println("No Such Record in the Database");
		}
		dbmsconnect.closeConnection(con, stmt);
		return i;
	}

	class dbmsconnection {
		String url;
		String username;
		String password;

		public dbmsconnection(
				String url, String username, String password) {
			this.url = url;
			this.username = username;
			this.password = password;
		}
		public Connection getConnection()
				throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
			Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established Successfully");
			return con;
		}
		public void closeConnection(Connection con, Statement stmt) throws SQLException {
			stmt.close();
			con.close();
			System.out.println("The connection is closed");
		}
	}
}