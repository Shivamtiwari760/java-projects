package com.ShnatWorld.testNG;
import java.net.ServerSocket;
import java.sql.SQLException;
import java.io.*;
import java.net.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	Apptest p1 = new Apptest();
	 public AppTest( String testName ) {
		 
	 }
	 @Test
		public void testinsertStudent() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	    {
	    s1.getStudentDetails();
	    int m =s1.insertStudent();
	    Assert.assertEquals(m, 1);
	    }

	
	
}
