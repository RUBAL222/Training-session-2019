
public class app 
{
public static void main(String args[])
{
	
	Myproduct c1=new Myproduct();
	customer d1= new customer();
	System.out.println("c1 is"+c1);
	System.out.println("d1 is"+d1);
	
	d1.setDataForcustomer("ram","ram05@gamil.com","89764637736","BRS nagar");
	c1.setDataForMyproduct("Shoes","addidas","8000","M");
	d1.showDataForcustomer();
	 
	int[]arr=new int[5];
	arr[0]= 1;
	
	Myproduct[] carr=new Myproduct[5];
	carr[0]=new Myproduct();
	carr[2]=new Myproduct();
	 
	 carr[0].setDataForMyproduct("jacket", "nike", "4000", "XL");
	// carr[1].setDataForMyproduct("sweatshirt", "nike", "7000", "L");
	 carr[2].setDataForMyproduct("Cap", "Puma", "8000", "S");
	 //carr[3].setDataForMyproduct("Tshirt", "tommy", "4000", "XL");
	// carr[4].setDataForMyproduct("Jeans", "tommy", "4000", "M");
	 
	 carr[0].showDataForMyproduct();
	 //carr[1].showDataForMyproduct();
	 carr[2].showDataForMyproduct();
	 
}
}
