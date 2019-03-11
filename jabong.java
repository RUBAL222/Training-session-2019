
public class jabong
{
public static void main(String args[])
{
	Address[] arr=new Address[3];
	for(int i=0;i<arr.length;i++)
	{
	arr[i]=new Address();
	}
	
	arr[0].setAddressDetails(56.99,55.78,141002,"brs nagar","punjab");
	arr[1].setAddressDetails(45.778,56.67,151001,"chaura bazzar","Jalandhar");
    arr[2].setAddressDetails(56.667,76.556,141003,"model town","punjab");
	
	order[] arry=new order[5];
	for (int i=0;i<arr.length;i++)
	{
		arry[i]=new order();
	}
	
    arry[0].setorderDetails(121,"shoes",2,"black",5000);
    arry[1].setorderDetails(142,"earrings",1, "gold",700);
    arry[2].setorderDetails(193,"jacket",1, "blue denim",6000);
   // arry[3].setorderDetails(234,"longshoes",1,"black",3000);
   // arry[4].setorderDetails(566, "sweatshirt",3,"white",1100);
    
    customer1 c1=new customer1();
    
    //1 to many fulfillment
    c1.setDataforcustomer1("jony","jony7@gmail.com",arr,arry);
    c1.showDetailsForustomer1();
    System.out.println("***********");
    //System.out.println("c1.name+"+c1.totalamount());
    //System.out.println("************");
        }
}