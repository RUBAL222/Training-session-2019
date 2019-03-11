package com.rubal.model;

public class Customer {

	public int cid;
	public String name;
	public String email;
	public String phone;
	
	public Customer()
	{
		
	}
	public Customer(int cid,String phone,String name,String email)
	{
		this.cid=cid;
		this.name=name;
		this.phone=phone;
		this.email=email;
	}

	@Override
	public String toString() {
		return "Customer [cid ="+cid+",name=" + name + ", phone=" + phone + ",email="+ email + "]";
	}
	public Object getname() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getcid() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getphone() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getemail() {
		// TODO Auto-generated method stub
		return null;
	
	}
	
	
		
	
	public static void add(Customer cRef) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
