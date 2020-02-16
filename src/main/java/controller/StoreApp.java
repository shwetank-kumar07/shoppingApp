package controller;

import model.Product;

public class StoreApp {
	
	public static int getFinalBill(Shopping shopping) {
		
		return shopping.getTotalDiscountedPrice();
	}
	
}
