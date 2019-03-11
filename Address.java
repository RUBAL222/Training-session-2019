
public class Address
{
    //Attributes
	double latitude;
	double longitude;
	int pincode;
	String city;
	String state;
	
  void setAddressDetails(double latitude,double longitude,int zipcode,String city,String state)
  
  {
  	this.latitude=latitude;
  	this. longitude=longitude;
  	this.pincode=pincode;
  	this.city=city;
  	this.state=state;
  	
  }
  void showAddressDetails()
	{
		  System.out.println("####################customer#####");
		  System.out.println("latitude:\t"+latitude);
		  System.out.println("longitude:\t"+longitude);
		  System.out.println("pincode:\t"+pincode);
		  System.out.println("city:\t"+city);
		  System.out.println("state:\t"+state);
		
		  
	}
}
