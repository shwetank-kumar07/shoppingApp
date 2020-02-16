package controller;

import java.util.ArrayList;
import java.util.List;

import model.Product;
import model.User;
import model.UserType;

public abstract class Shopping {
	
	User user;

	int discountPercentage= 0;
	List<Product> list;
	public int duration;
	final String ProductType="GROCERY";
	
	
    int getTotalDiscountedPrice() {
    	
    	int totalPrice=0;
	
    	for(Product product : list) {
    		if(!ProductType.equals(product.getType())) {
    			//System.out.println("Applying discountPercentage "+discountPercentage );
    			totalPrice+=product.getPrice()* (100-discountPercentage)* 0.01;
    			
    		}else {
    			totalPrice+=product.getPrice();
    		}
    		
    	}
    	
    	if(totalPrice>=100) {
    		//System.out.println("Applying add on");
    		totalPrice= addonDiscount(totalPrice);
    	}
    	
    	return totalPrice;
	}
    
    int addonDiscount(int totalPrice) {
    	int addonDiscount=0;
    	int newPrice=totalPrice;
    	
		 addonDiscount=(totalPrice/100) * 5;
		// System.out.println("Applying addonDiscount "+addonDiscount );
		 newPrice= (int) (totalPrice * (100-addonDiscount)* 0.01);
    	
    	
    	return newPrice;
    	
    }
	
    public void addToCart(Product product) {
    	this.list.add(product);
		
	}
	

}
