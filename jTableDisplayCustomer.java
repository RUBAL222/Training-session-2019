package com.rubal.controller;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class jTableDisplayCustomer implements ActionListener {
			
	JButton select;
	JButton delete;
	JButton Update;
	public JFrame detailsfr;
	JPanel pnlsButton, pnldButton,pnluButton;
	JPanel pnlAll;
			
	public int cid;
	public String name;
	public String phone;
	public String email;
	
	public jTableDisplayCustomer()
	{
		detailsfr=new JFrame("Showing Details");
		select=new JButton("SELECT");
		select.addActionListener(this);
		
		delete=new JButton("DELETE");
		delete.addActionListener(this);
	    
		Update=new JButton("UPDATE");
		Update.addActionListener(this);
	}
	public jTableDisplayCustomer(int cid,String phone,String name,String email)
	{
		this.cid=cid;
		this.name=name;
		this.phone=phone;
		this.email=email;
	}

	public static DefaultTableModel getModel() 
	{
		Connection con;
		Statement smt = null;
		ResultSet rs;
		return null;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
