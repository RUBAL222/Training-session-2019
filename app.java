package com.rkb.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.rkb.model.student;
/* link jar file to your project
 * download file
 * load driver
 * create connections
 * write sql statement
 * Execute sql statements
 * 
 */
public class app 
{
	//main method
  public static void main(String args[])
  {
	 student s1=new student();
	
	 s1.setId(1);	 
	 s1.setName("canny");
	 s1.setAge(23);
	 s1.setAddress("sarabha nagr");
	 s1.setPhone("9864647477");
	 
	 student s21=new student(2,"jony",23,"sarbha nagr","864647477") ;

     System.out.print("s1 is:"+s1);
     System.out.print("s21 is:"+s21);
     
     try
     { 
    	 // load the driver
		Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("*****Driver loaded");
	    //connection
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
	    System.out.println("connection created");
	    
	    // write SQL statement
	    String sql = "insert into student1 values(null,'"+s1.getName()+"','"+s1.getPhone()+"','"+s1.getAddress()+"',"+s1.getAge()+")";
	    
	   //execute SQL statement
	    Statement stmt=con.createStatement();
	    int i=stmt.executeUpdate(sql);
	    
	    if(i>=0)
	    {
	    	System.out.println("**"+s1.getName()+" Inserted in table");
	    }
	    else {
	    	System.out.println("+s1.getName()+");
	    	
	    	System.out.println("+s1.getName()+" );
	 
	    }
	    con.close();
	    System.out.println("coonection close");
	    
	  
	} catch (Exception e) {
	e.printStackTrace();

	}
 }
}
