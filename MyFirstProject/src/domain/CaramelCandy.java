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
		return "CaramelCandy [stuffing="  + getStuffing() + "]" + "\n";
	}

		
}
