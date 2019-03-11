package practice;
class Table
{
	void printTable(int num)
	{
		for(int i=0;i<=10;i++)
		 {
			System.out.println(num+" "+i+"'s are "+(num*i)) ;
		 }	
	}
 
}
class printer
{
	void printDocuments(String docName,int copies)
	{
		for(int i=0;i<=copies;i++)
		{
			System.out.println("Printing"+i+"copy of"+docName);
		}
	}

void fun()
  {
    System.out.print("this is fun");
  }
}
//my thread is a thread
class MyThread extends Thread
{
	Table tref;
	
}
class YourThread extends Thread
{
	Table tref;
	
}
public class sync
{
public static void main(String args[])
{
	Table tref=new Table();
	System.out.println("tref is"+tref);
	tref.printTable(5);
	
}
}
