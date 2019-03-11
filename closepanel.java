
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class closepanel extends Frame implements ActionListener
{
Panel P=new Panel();
Panel P1=new Panel();
Button b1=new Button ("click");
Button b2=new Button ("exit");
public static void main(String args[])
{
	closepanel P=new closepanel();	
}
public closepanel()
{
this.setVisible(true);
this.setLayout(null);
P.setVisible(true);
P.setBackground(Color.red);
P.setBounds(50,40,500,200);

P1.setVisible(true);
P1.setBackground(Color.cyan);
P1.setBounds(50,40,500,200);

this.add(P);
this.add(P1);
P.setLayout(null);
P1.setLayout(null);

P.add(b1);
b1.setBounds(80,60,200,50);
b1.addActionListener(this);

P1.add(b2);
b2.setBounds(100,120,200,50);
b2.addActionListener(this);

}

public void actionPerformed(ActionEvent r)
{
	if(r.getSource()==b1)
	 {
		 P.setVisible(false);
	 }
	 if(r.getSource()==b2)
	 {
		System.exit(0);
		 
	 }
}
}