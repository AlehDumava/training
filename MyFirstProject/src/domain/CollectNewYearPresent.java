package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectNewYearPresent {
	
	public static List<Sweets> collectCandyForPresent() {
		
		List<Sweets> candy = new ArrayList<>();
		
			candy.add(new CaramelCandy("Caramel", "Werther's Original", 30, 3, "Nougat"));
			candy.add(new CaramelCandy("Caramel", "Branch's", 35, 2, "Hazelnut"));
			candy.add(new CaramelCandy("Caramel", "Nips", 25, 3, "Nougat"));
			candy.add(new CaramelCandy("Caramel", "Dove Promises", 45, 2, "Nougat"));
			candy.add(new CaramelCandy("Caramel", "Sathers", 55, 4, "Peanut"));
			candy.add(new ChocolateCandy("Chocolate", "Glazed Souffle", 25, 4, 14));
			candy.add(new ChocolateCandy("Chocolate", "Chocolate Souffle", 15, 6, 25));
			candy.add(new ChocolateCandy("Chocolate", "Lollipops", 25, 2, 30));
			candy.add(new ChocolateCandy("Chocolate", "Milky Way", 55, 3, 15));
			candy.add(new ChocolateCandy("Chocolate", "Bon Pari", 65, 2, 45));
			
			return candy;
	}
	
	
	public Integer getWeightPresent (List<Sweets> candy) {
		
		int weightPresent = 0;
		for(Sweets element : candy) {
			weightPresent += element.getWeight();
		}
			
		System.out.println("\n---------- Weight Present, gramm ----------");
		System.out.println(weightPresent);
		
		return weightPresent;
	}
	
	
		
	public void findCandyByShugarContent(int a) {
		
		List<Sweets> candy = new ArrayList<Sweets>();
		
		Comparator<Sweets> newFind = new Comparator<Sweets>() {
			
			public int compare(Sweets u1, Sweets u2) {
				
				return  u1.getShugarContent().compareTo(u2.getShugarContent());
			}
			
		};
		 
		//int index = Collections.binarySearch(candy, new Sweets(a),  Collections.reverseOrder());
		System.out.print("Binary search: ");
		//System.out.println(index);
	}
	
	
}
	

