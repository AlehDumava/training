package domain;

public abstract class Sweets {
	
	private String	type;
	private String	title;
	private Integer shugarContent;
	private Integer	weight;
	
	
	public Sweets(String type, String title, Integer shugarContent, Integer weight) {
	
		this.type 			= type;
		this.title 			= title;
		this.shugarContent 	= shugarContent;
		this.weight 		= weight;
	}

	
	
	public String getType() {
		return type;
	}


	public String getTitle() {
		return title;
	}


	public Integer getShugarContent() {
		return shugarContent;
	}


	public Integer getWeight() {
		return weight;
	}


	@Override
	public String toString() {
		return String.format("Type Sweets: %12s, Title Sweets: %20s, Shugar Content, percent: %4d, Weight, gramm: %4d", 
				getType(), getTitle(), getShugarContent(), getWeight());
	}

	
}
