
class fitness
{
	String name;
	String email;
	String gender;
	String age;
	String weight;
	String height;
}
public class object
{
public static void main(String args[]) 
{
	int a=10;
	int arr[]= {10,20,30,40,50};
	fitness abc1=new fitness();
	fitness abc2=new fitness();
	fitness abc3=new fitness();
	fitness abc4=abc3;//reference copy
	
	System.out.println("a is:"+a);
	System.out.println("arr is:"+arr);
	System.out.println("abc1 is:"+abc1);
	System.out.println("abc2 is:"+abc2);
	System.out.println("abc3 is:"+abc3);
	System.out.println("abc4 is:"+abc4);
	
	abc1.name= "monica";
	abc1.email= "monica@yahoo.com";
	abc1.gender= "Female";
	abc1.age= "25";
	abc1.weight= "57";
	abc1.height= "5'6";
	
	abc2.name="mohan";
	abc2.email="moham9@gmail.com";
	abc2.gender="Male";
	abc2.age="35";
	abc2.weight="60";
	abc2.height="5'1";
	
	abc3.name="jony";
	abc3.email="jony@gmail.com";
	abc3.gender="Male";
	abc3.age="47";
	abc3.weight="65";
	abc3.height="6'5";
	
	abc4=abc3;
	System .out.println(abc1.name+" is "+abc1.age+" year old");
	System .out.println("gender:"+abc1.gender);
	System .out.println("height:"+ abc1.height);
	System .out.println("weight:"+ abc1.weight);
	
	System .out.println(abc4.name+" is "+abc3.age+" year old");
	System .out.println(abc2.name+" is "+abc2.age+" year old");
}
}