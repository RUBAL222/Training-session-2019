

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class connection extends JFrame implements ActionListener
{
Connection con;
Statement st;
JButton b1=new JButton("DELETE");
public connection()
{
	this.setVisible(true);
	this.setLayout(null);
	this.setSize(600,600);
	b1.setBounds(10,20,100,20);
	add(b1);
	b1.addActionListener(this);
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
		st=con.createStatement();
		JOptionPane.showMessageDialog(null,"connection is done");
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"connection is not established");
	}
}
public static void main(String args[])
{
	connection c=new connection();
}
public void actionPerformed(ActionEvent e)

{
	if(e.getSource()==b1)
	{
		try
		{
			st.executeUpdate("delete from training where id=1");
			JOptionPane.showMessageDialog(null,"delete done successfully");
		
		}
		catch(Exception e1)
		{
			JOptionPane.showMessageDialog(null,"delete unsuccessfully");
		}
	
	}
}
	
}	

