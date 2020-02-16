package controller;

import java.util.*;

import model.Product;
import model.User;
import model.UserType;

public class AffiliateShoppingImpl extends Shopping {
	
	
	public AffiliateShoppingImpl(){
		this.discountPercentage= 10;
		list=new ArrayList<Product>();
		this.user=new User(duration,UserType.AFFILIATE,list);
		
	}

}
