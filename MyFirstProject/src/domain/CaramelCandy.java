package domain;

public class CaramelCandy extends Sweets {
	
	public String stuffing;
	
	public CaramelCandy(String type, String title, Integer shugarContent, Integer weight, String stuffing) {
		
		super(type, title, shugarContent, weight);
		this.stuffing = stuffing;
	}

	public String getStuffing() {
		
		return stuffing;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("Type Sweets:  %-12s Title Sweets:  %-20s Shugar Content, percent:  %-4d Weight, gramm:  %-4d Stuffing:  %-10s", 
				getType(), getTitle(), getShugarContent(), getWeight(), getStuffing());
	}

		
}
