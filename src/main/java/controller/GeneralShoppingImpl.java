package controller;

import java.util.ArrayList;

import model.Product;
import model.User;
import model.UserType;

public class GeneralShoppingImpl extends Shopping {
	
	
	public GeneralShoppingImpl(){
		if(this.duration>=2) {
			this.discountPercentage= 5;
		}else {
			this.discountPercentage= 0;
		}
		
		list=new ArrayList<Product>();
		this.user=new User(duration,UserType.GENERAL,list);
		
	}

}
