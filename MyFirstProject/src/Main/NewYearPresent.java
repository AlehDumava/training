package Main;

import domain.CollectNewYearPresent;
import java.util.List;
import domain.CaramelCandy;
import domain.ChocolateCandy;



public class NewYearPresent {

	public static void main(String[] args) {
	
		CollectNewYearPresent.collectCaramelCandyForPresent();
		
		List<CaramelCandy> caramelCandy = CollectNewYearPresent.collectCaramelCandyForPresent();
		CollectNewYearPresent.showPresentOnTheScreen(caramelCandy);
		CollectNewYearPresent.getWeightPresent(caramelCandy);
		
		List<ChocolateCandy> chocolateCandy = CollectNewYearPresent.collectChocolateCandyForPresent();
		CollectNewYearPresent.showPresentOnTheScreen(chocolateCandy);
		CollectNewYearPresent.getWeightPresent(chocolateCandy);
	}

}
