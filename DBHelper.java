package com.rubal.controller;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.rubal.model.Customer;

public class DBHelper {
	Connection con;// Has-A Relation
	PreparedStatement pStmt; // Has-A Relation

	//When Object is created, Constructor is executed !!
	public DBHelper() {
	//Load the Driver 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> Driver Loaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void createConnection(){
		try {
			// Create Connection:
			String url = "jdbc:mysql://localhost/student";
			String user = "root";
			String password = "";

			con = DriverManager.getConnection(url,user,password);
			System.out.println(">> Connection Created");
		    } catch (Exception e) {
			e.printStackTrace();
		}
	}
	private Connection getConnection1() {
		   {
		       Connection con;
		       try {
		           con = DriverManager.getConnection("jdbc:mysql://localhost/student", "root","");
		           return con;
		       } catch (Exception e) {
		           e.printStackTrace();
		           return null;
		       }
		   }  
	}
	public int addCustomerInDB(Customer cRef){

		int i = 0;

		try {

			//Create SQL Statement
			String sql = "insert into Customer values(null, ?, ?, ?)";

			//Execute SQL Statement
            pStmt = con.prepareStatement(sql);
			// Substitute the data in SQL Statement
			pStmt.setString(1, cRef.name);
			pStmt.setString(2, cRef.phone);
			pStmt.setString(3, cRef.email);

			i = pStmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}return i;
	}
	
	 public void updateCustomerInDB(Customer cRef){
			try {

				// 4. Create SQL Statement
				String sql = "update Customer set  phone= ?,Address = ?,email = ? where name = ? ";

				// 5. Execute SQL Statement
	            pStmt = con.prepareStatement(sql);
				// Substitute the data in SQL Statement
				pStmt.setString(1, cRef.name);
				pStmt.setString(2, cRef.phone);
				
				int i = pStmt.executeUpdate();

				if(i>0){
					System.out.println(">> "+cRef.name+" Updated in Table");
				}else{
					System.out.println(">> "+cRef.name+" Not Updated in Table");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void deleteCustomerFromDB(String name){
			try {

				// 4. Create SQL Statement
				String sql = "delete from Customer where name = ? ";

				// 5. Execute SQL Statement

				pStmt = con.prepareStatement(sql);
				// Substitute the data in SQL Statement
				pStmt.setString(1,name);

				int i = pStmt.executeUpdate();

				if(i>0){
					System.out.println(">> "+name+" Deleted from Table");
				}else{
					System.out.println(">> "+name+" Not Deleted from Table");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void fetchCustomerFromDB(){
			try {

				String sql = "Select * from Customer";
				pStmt = con.prepareStatement(sql);

				// ResultSet is a data structure which will hold data retrieved from Table
				ResultSet rs = pStmt.executeQuery();

				while(rs.next()){
					Customer cref= new Customer();
					
					cref.name = rs.getString(1);
					cref.phone = rs.getString(2);
					cref.email= rs.getString(3);
					System.out.println(cref);
					System.out.println();
				}

			} catch (Exception e) {
				e.printStackTrace();
		}
	}

		   
    // Display Data In JTable
	public int ShowCustomerJTable(jTableDisplayCustomer tRef)
	{
		ArrayList<Customer> list = getCustomersList();
		Connection connection = getConnection1();
	       
	       String query = "SELECT * FROM customers` ";
	       java.sql.Statement st;
	       ResultSet rs;
	       
	       try {
	           st = connection.createStatement();
	           rs = st.executeQuery(query);
	           Customer cRef;
	           while(rs.next())
	           {
	               cRef = new Customer();
	               Customer.add(cRef);
	           }
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	       
	      
	       int getCustomersList = 0;
		   return getCustomersList;
	}
	
	// get a list of users from mysql database
	   public ArrayList<Customer> getCustomersList(){
		   
	   //int j=0;
	   try{
		   
	       ArrayList<Customer> CustomersList = new ArrayList<Customer>();
	       Connection connection = getConnection1();
	       
	       String query = "SELECT * FROM customers` ";
	       java.sql.Statement st;
	       ResultSet rs;
	       
	       try {
	           st = connection.createStatement();
	           rs = st.executeQuery(query);
	           Customer cRef;
	           while(rs.next())
	           {
	               cRef = new Customer();
	               CustomersList.add(cRef);
	           }
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	       return CustomersList;
	   }
	   finally
	   {
		   
	   }
	   }

	
	       public void ShowUsersInJTable()
	       {
	       ArrayList<Customer> list = getCustomersList();
	       DefaultTableModel model = (DefaultTableModel)jTableDisplayCustomer.getModel();
	       Object[] row = new Object[4];
	       for(int i = 0; i < list.size(); i++)
	       {
	           row[0] = list.get(i).getcid();
	           row[1] = list.get(i).getname();
	           row[2] = list.get(i).getphone();
	           row[3] = list.get(i).getemail();
	           
	           model.addRow(row);
	       }
	}

   public void closeConnection(){
	try {
		con.close();
		System.out.println(">> Connection Closed");
	} catch (Exception e) {
		e.printStackTrace();
	}
 }
}
