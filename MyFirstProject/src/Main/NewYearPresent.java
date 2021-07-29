package Main;

import domain.CollectNewYearPresent;
import domain.Sweets;
import java.util.List;

import Output.ShowPresentOnTheScreen;
import Action.SortCandyByWeight;
import Action.WeightComparator;


public class NewYearPresent {

	public static void main(String[] args) {
	
		
		List<Sweets> Candy = CollectNewYearPresent.collectCandyForPresent();
		
		ShowPresentOnTheScreen showPresents = new ShowPresentOnTheScreen();
		showPresents.showPresent(Candy);
				
		CollectNewYearPresent collectPresent = new CollectNewYearPresent();
		collectPresent.getWeightPresent(Candy);
				
		
		//SortCandyByWeight newSort = new SortCandyByWeight();
		//newSort.sort(Candy, new SortCandyByWeight<Candy>(), new WeightComparator());
		//sort.Compare(caramelCandy, new SortCandyByWeight<CaramelCandy>(), new WeightComparator());
		System.out.println(Candy);
	}

}
