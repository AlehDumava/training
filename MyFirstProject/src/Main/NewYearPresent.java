package Main;

import domain.CollectNewYearPresent;
import domain.Sweets;
import java.util.List;

import Output.ShowPresentOnTheScreen;
import Action.SortCandyByWeight;
import Action.WeightComparator;



public class NewYearPresent {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	
		List<Sweets> Candy = CollectNewYearPresent.collectCandyForPresent();
		
		
		ShowPresentOnTheScreen showPresents = new ShowPresentOnTheScreen();
		showPresents.showPresent(Candy);
				
		CollectNewYearPresent collectPresent = new CollectNewYearPresent();
		collectPresent.getWeightPresent(Candy);
				
		
		SortCandyByWeight newSort = new SortCandyByWeight();
		newSort.sortCandy(Candy, new WeightComparator());
		
				
		System.out.println("\n========== Show New Year present after sort by Weight ==========\n");
		showPresents.showPresent(Candy);
	}

}
