package com.revature.driver;
import com.revature.beans.Human;

public class Driver2 {
	
	public static void main(String[] args) {

		
		Human newBeing = new Human();

		newBeing.setAge(25);
		newBeing.setName("Matt");
		
		// Print out details instead of mem ref, using overriding toString method
		System.out.println(newBeing);

	}


}
