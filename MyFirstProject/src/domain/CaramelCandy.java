package domain;

public class CaramelCandy extends Sweets {
	
	public Integer shugarContent;
	
	public CaramelCandy(String type, String title, Integer weight, Integer shugarContent) {
		super(type, title, weight);
		this.shugarContent = shugarContent;
	}

	
	public Integer getShugarContent() {
		return shugarContent;
	}

	public void setShugarContent(Integer shugarContent) {
		this.shugarContent = shugarContent;
	}
	

}
