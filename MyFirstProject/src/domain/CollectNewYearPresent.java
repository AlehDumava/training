package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class CollectNewYearPresent {
	
	public static List<CaramelCandy> collectCaramelCandyForPresent() {
		
		List<CaramelCandy> caramelCandy = new ArrayList<>();
		
			caramelCandy.add(new CaramelCandy("Caramel", "Werther's Original", 3, 30));
			caramelCandy.add(new CaramelCandy("Caramel", "Branch's", 2, 35));
			caramelCandy.add(new CaramelCandy("Caramel", "Nips", 3, 25));
			caramelCandy.add(new CaramelCandy("Caramel", "Dove Promises", 2, 45));
			caramelCandy.add(new CaramelCandy("Caramel", "Sathers", 4, 55));
			
			return caramelCandy;
	}
	
	public static List<ChocolateCandy> collectChocolateCandyForPresent() {
		
		List<ChocolateCandy> chocolateCandy = new ArrayList<>();
		
			chocolateCandy.add(new ChocolateCandy("Chocolate", "Glazed Souffle", 4, 25));
			chocolateCandy.add(new ChocolateCandy("Chocolate", "Chocolate Souffle", 6, 15));
			chocolateCandy.add(new ChocolateCandy("Chocolate", "Lollipops", 2, 25));
			chocolateCandy.add(new ChocolateCandy("Chocolate", "Milky Way", 3, 55));
			chocolateCandy.add(new ChocolateCandy("Chocolate", "Bon Pari", 2, 65));
					
			return chocolateCandy;
	}
	
	public static void showPresentOnTheScreen(List<CaramelCandy> sweetsForPresent) {
		
		System.out.println("-------- New Year present --------\n");
		System.out.println("Num:   " + "Type Sweets:   " + "Title Sweets:		" + "Weight, gramm:   " + "Shugar Content, percent:  \n");
		
		int serialNumberSweet = 1;
		for(CaramelCandy element : sweetsForPresent) {
			
			System.out.println(serialNumberSweet + "	" + element.getType() + "		" + element.getTitle() + "		" + 
			element.getWeight() + "		" + element.getShugarContent());
			
			serialNumberSweet ++;
			
		}
		
	}
		
	
	public static Integer getWeightPresent (List<CaramelCandy> caramelCandy) {
		
		int weightPresent = 0;
		for(CaramelCandy element : caramelCandy) {
			weightPresent += element.getWeight();
		}
			
		System.out.println("\n---------- Weight Present, gramm ----------");
		System.out.println(weightPresent);
		
		return weightPresent;
	}
	
	
	public void sortCandyByWeight() {
		
					
	}
	
	public void findCandyByShugarContent() {
		
				
	}
	
	
}
	

