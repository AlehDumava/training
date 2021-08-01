package Main;

import domain.CollectNewYearPresent;
import domain.Sweets;
import java.util.List;

import Output.ShowPresentOnTheScreen;
import Action.SortCandyByWeight;
import Action.WeightComparator;

/*
	2. Новогодний подарок. 
	Определить иерархию конфет и прочих сладостей.
	Создать несколько объектов-конфет. Собрать детский подарок с определением его веса.
	Провести сортировку конфет в подарке на основе одного из параметров.
	Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.
 */


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
		
		collectPresent.findCandyByShugarContent(Candy, 25, 30);		// min shugar content = 25, max chugar content = 30;
		
		System.out.println("\n========== Show New Year present after searching Candy by Shugar Content ==========\n");
		showPresents.showPresent(Candy);
	}

}
