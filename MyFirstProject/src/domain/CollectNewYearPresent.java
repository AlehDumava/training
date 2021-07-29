package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class CollectNewYearPresent {
	
	public static List<Sweets> collectCandyForPresent() {
		
		List<Sweets> candy = new ArrayList<>();
		
			candy.add(new CaramelCandy("Caramel", "Werther's Original", 3, 30, "Nougat"));
			candy.add(new CaramelCandy("Caramel", "Branch's", 2, 35, "Hazelnut"));
			candy.add(new CaramelCandy("Caramel", "Nips", 3, 25, "Nougat"));
			candy.add(new CaramelCandy("Caramel", "Dove Promises", 2, 45, "Nougat"));
			candy.add(new CaramelCandy("Caramel", "Sathers", 4, 55, "Peanut"));
			candy.add(new ChocolateCandy("Chocolate", "Glazed Souffle", 4, 25, 14));
			candy.add(new ChocolateCandy("Chocolate", "Chocolate Souffle", 6, 15, 25));
			candy.add(new ChocolateCandy("Chocolate", "Lollipops", 2, 25, 30));
			candy.add(new ChocolateCandy("Chocolate", "Milky Way", 3, 55, 15));
			candy.add(new ChocolateCandy("Chocolate", "Bon Pari", 2, 65, 45));
			
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
	
	
	
	
	public void findCandyByShugarContent() {
		
				
	}
	
	
}
	

