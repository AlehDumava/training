package Output;

import domain.Sweets;

import java.util.List;


public class ShowPresentOnTheScreen {
	
	public void showPresent(List<Sweets> candy) {
		
		System.out.println("-------- New Year present --------\n");
	
		for(Sweets element : candy) {
					
			System.out.println(candy.indexOf(element) + "  " + element);			
		}
	
		System.out.println("\n");
	
	}
	
}