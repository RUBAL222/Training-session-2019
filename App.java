package com.rubal.main;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.rubal.controller.DBHelper;

import com.rubal.model.Customer;
import com.rubal.view.AddCustomerWindow;

public class App {
	
	// main method : represent main thread !!
	// Execution of Program begins here !!
	public static void main(String[] args) {
	AddCustomerWindow window = new AddCustomerWindow();
	window.showWindow();
	

	}
}	

	 