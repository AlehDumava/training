package Output;

import java.util.List;

import domain.Sweets;

public class ShowPresentOnTheScreen {
	
	public void showPresent(List<Sweets> candy) {
		
		System.out.println("-------- New Year present --------\n");
	
		System.out.println("Num:   " + "Type Sweets:   " + "Title Sweets:		" + "Shugar Content, percent:   " + "Weight, gramm:  \n");
	
		int serialNumberSweet = 1;
		for(Sweets element : candy) {
		
			System.out.println(serialNumberSweet + "	" + element.getType() + "		" + element.getTitle() + "		" + 
					element.getShugarContent() + "			" +	element.getWeight() + "		");

			serialNumberSweet ++;
		}
	
	System.out.println("\n");
	
	}
	
}