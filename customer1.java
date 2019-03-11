
public class customer1
{
	String name;
	String email;
	String phone;
	
	//Address is reference variable
	Address[] addresses;//1 to many
	//order is reference variable
	order[] orders; //1  to many
	void setDataforcustomer1(String name,String email,Address[]Addresses,order[]orders)
	 {
		this.name=name;
		this.email=email;
		this.addresses=Addresses;
		this.orders=orders;
	 }
	void showDetailsForustomer1()
	{
		System.out.println("*****customer"+name+"*****");
		System.out.println("email"+email);
		
		System.out.println("******Address*****");
		/*for(int i=0;i<addresses.length;i++)
		{
		addresses[i].showAddressDetails();
		}
		
		System.out.println("******order*****");
		for (int i=0;i<orders.length;i++)
		{
			orders[i].showorderDetails();
		}*/
		for(order orr: orders)
		{
			orr.showorderDetails();	
		}
		System.out.print("*******************");
	}
	//int totalamount()
	{
		int total=0;
		for (order orr:orders)
		{
			total=total+orr.price;
		}
		//return total;
	}


}

