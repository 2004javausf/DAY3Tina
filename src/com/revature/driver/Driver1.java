package com.revature.driver;
import com.revature.beans.Cat;

public class Driver1 {
	
	public static void main(String[] args) {

		
		Cat newCat = new Cat();

		newCat.setType("Persian");
		newCat.setWeight(50);
		
		// Print out details instead of mem ref, using overriding toString method
		System.out.println(newCat);

	}


}
