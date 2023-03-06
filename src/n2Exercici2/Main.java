package n2Exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import n2Exercici1.Restaurant;

public class Main {

	public static void main(String[] args) {
		
		// Create hashset
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		
		// Adding some restaurants
		restaurants.add(new Restaurant("Restaurant1", 8));
		restaurants.add(new Restaurant("Restaurant2", 7));
		restaurants.add(new Restaurant("Restaurant2", 9));
		restaurants.add(new Restaurant("Restaurant2", 5));
		restaurants.add(new Restaurant("Restaurant4", 8));
		restaurants.add(new Restaurant("Restaurant5", 9));
		restaurants.add(new Restaurant("Restaurant2", 3));

		// Convert to List
		List<Restaurant> listRestaurants = new ArrayList<Restaurant>();
		listRestaurants.addAll(restaurants);
		
		// Order the list by comparator
		Collections.sort(listRestaurants, new RestaurantsComparator());

		// Show all restaurants by console
		for(Restaurant restaurant: listRestaurants) {
			System.out.println(restaurant);
		}
		
	}

}
