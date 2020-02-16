package model;

import java.util.List;

public class User {
	int duration=0;
	
	UserType type=null;
	
	List<Product> product=null;
	
	

	public User(int duration, UserType type, List<Product> product) {
		super();
		this.duration = duration;
		this.type = type;
		this.product = product;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
	

}
