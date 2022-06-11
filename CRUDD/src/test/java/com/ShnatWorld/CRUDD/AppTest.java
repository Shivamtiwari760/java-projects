package com.ShnatWorld.CRUDD;

import org.testng.annotations.Test;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.AssertJUnit;


public class AppTest
{
   Student s1 = new Student();
    public AppTest( String testName )
    {
    	
    }
    
    @Test
	public void testinsertStudent() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
    s1.getStudentDetails();
    int m =s1.insertStudent();
    Assert.assertEquals(m, 1);
    }
    
    @Test(dependsOnMethods = {"testinsertStudent"})
	public void testdeleteStudent() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
    int m =s1.deleteStudentRecord();
    Assert.assertEquals(m, 1);
    }
  
//    @Test
//	public void testShowAll()
//    {
//    }
    @Test
	public void testApp()
    {
        AssertJUnit.assertTrue( true );
    }
}
