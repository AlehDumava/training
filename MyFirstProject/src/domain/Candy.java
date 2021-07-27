package domain;

public class Candy extends Sweets {
	
	private Integer shugarContent;
	
	public Candy(String type, String title, Integer weight, Integer shugarContent) {
		super(type, title, weight);
		//this.shugarContent = shugarContent;
	}

	
	public Integer getShugarContent() {
		return shugarContent;
	}

	public void setShugarContent(Integer shugarContent) {
		this.shugarContent = shugarContent;
	}
	

}
