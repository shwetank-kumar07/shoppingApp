package test;

import java.util.List;

import org.junit.Test;

import controller.AffiliateShoppingImpl;
import controller.EmployeeShoppingImpl;
import controller.GeneralShoppingImpl;
import controller.Shopping;
import controller.StoreApp;
import model.Product;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
 
public class TestApp {
 
  @Test
  public void testEmployeeNonGrocery() {
	  Shopping shopping=new EmployeeShoppingImpl();
		Product product=new Product();
		product.setPrice(100);
		product.setType("APPLIANCE");
		shopping.addToCart(product);
		assertEquals(StoreApp.getFinalBill(shopping), 70);
  }
  
  @Test
  public void testEmployeeGrocery() {
	  Shopping shopping=new EmployeeShoppingImpl();
		Product product=new Product();
		product.setPrice(100);
		product.setType("GROCERY");
		shopping.addToCart(product);
		assertEquals(StoreApp.getFinalBill(shopping), 95);
  }
  
  @Test
  public void testAffiliate() {
	  Shopping shopping=new AffiliateShoppingImpl();
		Product product=new Product();
		product.setPrice(100);
		product.setType("APPLIANCE");
		shopping.addToCart(product);
		assertEquals(StoreApp.getFinalBill(shopping), 90);
  }
  
  @Test
  public void testGeneral() {
	    Shopping shopping=new GeneralShoppingImpl();
		Product product=new Product();
		product.setPrice(100);
		product.setType("APPLIANCE");
		shopping.addToCart(product);
		shopping.duration=2;
		assertEquals(StoreApp.getFinalBill(shopping), 95);
  }
  
  @Test
  public void testRegular() {
	    Shopping shopping=new GeneralShoppingImpl();
		Product product=new Product();
		product.setPrice(90);
		product.setType("APPLIANCE");
		shopping.addToCart(product);
		shopping.duration=1;
		assertEquals(StoreApp.getFinalBill(shopping), 90);
  }
  
  @Test
  public void testAddOn() {
	    Shopping shopping=new GeneralShoppingImpl();
		Product product=new Product();
		product.setPrice(200);
		product.setType("APPLIANCE");
		shopping.addToCart(product);
		shopping.duration=1;
		assertEquals(StoreApp.getFinalBill(shopping), 180);
  }
}


