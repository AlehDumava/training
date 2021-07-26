package domain;

import java.util.ArrayList;


public class CollectNewYearPresent {
	
	public void CollectPresent() {
		
		ArrayList<Sweets> sweetsForPresent = new ArrayList<Sweets>();
		
			Candy caramelWerthers = new Candy("Caramel", "Werther's Original", 3, 30);
			Candy caramelBranchs = new Candy("Caramel", "Branch's", 2, 35);
			Candy caramelNips = new Candy("Caramel", "Nips", 3, 25);
			Candy caramelDovePromises = new Candy("Caramel", "Dove Promises", 2, 45);
			Candy caramelSathers = new Candy("Caramel", "Sathers", 4, 55);
			
			Candy souffleGlazed = new Candy("Souffle", "Glazed Souffle", 4, 25);
			Candy souffleChocolate = new Candy("Souffle", "Chocolate Souffle", 6, 15);
			Candy souffleLollipops = new Candy("Souffle", "Lollipops", 2, 25);
			Candy souffleMilkyWay = new Candy("Souffle", "Milky Way", 3, 55);
			Candy souffleBonPari = new Candy("Souffle", "Bon Pari", 2, 65);
					
			sweetsForPresent.add(caramelWerthers);
			sweetsForPresent.add(caramelBranchs);
			sweetsForPresent.add(caramelNips);
			sweetsForPresent.add(caramelDovePromises);
			sweetsForPresent.add(caramelSathers);
			
			sweetsForPresent.add(souffleGlazed);
			sweetsForPresent.add(souffleChocolate);
			sweetsForPresent.add(souffleLollipops);
			sweetsForPresent.add(souffleMilkyWay);
			sweetsForPresent.add(souffleBonPari);
			
			
			System.out.println("-------- New Year Present --------");
			System.out.println("Num:   " + "Type Sweets:   " + "Title Sweets:   " + "\t\tWeight, gramm: " + "\t Shugar Content, percent:  ");
			
			int serialNumberSweet = 1;
			for(Sweets element : sweetsForPresent) {
				
				System.out.println(serialNumberSweet + "\t" + element.getType() + "\t\t" + element.getTitle() + "\t\t" + element.getWeight() + "  ");
				serialNumberSweet ++;
			}
			
	}
	
	public void showPresentOnTheScreen(ArrayList<Sweets> sweetsForPresent) {
		
		System.out.println("-------- New Year Present --------\n");
		System.out.println("Num:   " + "Type Sweets:   " + "Title Sweets:   " + "Weight, gramm:   " + "Shugar Content, perсent:  ");
		
		int serialNumberSweet = 1;
		for(Sweets element : sweetsForPresent) {
			
			System.out.println(serialNumberSweet + "" + element.getType() + "   " + element.getTitle() + "  " + element.getWeight() + "  ");
			serialNumberSweet ++;
			
		}
	
	}
	
}
