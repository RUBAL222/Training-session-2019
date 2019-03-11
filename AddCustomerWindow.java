package com.rubal.view;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.rubal.controller.DBHelper;
import com.rubal.controller.jTableDisplayCustomer;
import com.rubal.model.Customer;


public class AddCustomerWindow implements ActionListener{

	// Declaration of Reference Variables
	JFrame fr;
	
	JLabel lblTitle, lblName, lblPhone, lblEmail;
	JTextField txtName, txtPhone, txtEmail;
	JButton btnAddCustomer,btnShowCustomers;
	JPanel pnlTitle, pnlName, pnlPhone, pnlEmail, pnlButton,pnlButton1, pnlAll;

	public AddCustomerWindow(){
		// Object Construction for Components of GUI

		//fr = new JFrame("Add Customer");
		fr = new JFrame();
		fr.setTitle("Add Customer");

		lblTitle = new JLabel("Enter Customer Details");
		lblName = new JLabel("Enter Customer Name");
		lblPhone = new JLabel("Enter Customer Phone");

		lblEmail = new JLabel();
		lblEmail.setText("Enter Customer Email");

		txtName = new JTextField(16);
		txtPhone = new JTextField(16);
		txtEmail = new JTextField(16);

		btnAddCustomer = new JButton("Add Customer");
		//btnAddCustomer.setText("Add Customer");
		btnShowCustomers = new JButton("Show Customers");

		btnAddCustomer.addActionListener(this);
		btnShowCustomers.addActionListener(this);

		pnlTitle = new JPanel();
		pnlName = new JPanel();
		pnlPhone = new JPanel();
		pnlEmail = new JPanel();
		pnlButton = new JPanel();
		pnlButton1 = new JPanel();
		pnlAll = new JPanel();
	}

	public void showWindow(){

		pnlTitle.add(lblTitle);

		pnlName.add(lblName);
		pnlName.add(txtName);

		pnlPhone.add(lblPhone);
		pnlPhone.add(txtPhone);

		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);

		pnlButton.add(btnAddCustomer);
		pnlButton1.add(btnShowCustomers);

		pnlAll.add(pnlTitle);
		pnlAll.add(pnlName);
		pnlAll.add(pnlPhone);
		pnlAll.add(pnlEmail);
		pnlAll.add(pnlButton);
		pnlAll.add(pnlButton1);

		GridLayout layout = new GridLayout(6,1);
		pnlAll.setLayout(layout);

		fr.add(pnlAll);

		fr.setSize(400, 400);
		fr.setVisible(true); // show the frame to user

	}
	//@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAddCustomer){
			Customer cRef = new Customer();
			cRef.name = txtName.getText();
			cRef.phone = txtPhone.getText();
			cRef.email = txtEmail.getText();
			System.out.println(cRef);

			DBHelper db = new DBHelper();
			db.createConnection();
			int i = db.addCustomerInDB(cRef);
			db.closeConnection();

			if(i>0){
				System.out.println(">> "+cRef.name+" Added in Database");
				txtName.setText("");
				txtPhone.setText("");
				txtEmail.setText("");
			}
			else{
				System.out.println(">> "+cRef.name+" Not Added in Database");
			}

		}
	
		if(e.getSource() == btnShowCustomers)
		{
			jTableDisplayCustomer tRef =new jTableDisplayCustomer ();
			tRef.name = txtName.getText();
			tRef.phone = txtPhone.getText();
			tRef.email = txtEmail.getText();
			
			DBHelper db = new DBHelper();
			db.createConnection();
			int i = db.ShowCustomerJTable(tRef);
			db.closeConnection();
			
			fr.setVisible(false);
			tRef.detailsfr.setVisible(true);
		}
		}
	}
