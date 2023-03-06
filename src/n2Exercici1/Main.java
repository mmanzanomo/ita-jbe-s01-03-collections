package n2Exercici1;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		// Create hashset
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		
		// Adding some restaurants
		restaurants.add(new Restaurant("Restaurant1", 8));
		restaurants.add(new Restaurant("Restaurant2", 7));
		restaurants.add(new Restaurant("Restaurant4", 8));
		restaurants.add(new Restaurant("Restaurant5", 9));
		
		// Show set restaurants by console
		for(Restaurant restaurant: restaurants) {
			System.out.println(restaurant);
		}
		
		// try to add elements with the same name and number of points 
		restaurants.add(new Restaurant("Restaurant2", 7));   // copy
		// this element has different number of points and it is added to the restaurants
		restaurants.add(new Restaurant("Restaurant2", 10));   
		restaurants.add(new Restaurant("Restaurant4", 8));   // copy
		
		//shows that the same elements are not added to the set
		System.out.println();
		for(Restaurant restaurant: restaurants) {
			System.out.println(restaurant);
		}
		

	}

}
