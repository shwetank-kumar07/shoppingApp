package controller;

import java.util.ArrayList;
import java.util.List;

import model.Product;
import model.User;
import model.UserType;

public class EmployeeShoppingImpl extends Shopping {
	
	
	public EmployeeShoppingImpl(){
		this.discountPercentage= 30;
		list=new ArrayList<Product>();
		this.user=new User(duration,UserType.EMPLOYEE,list);
		
	}
	
	

}
