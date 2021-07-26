package domain;

public abstract class Sweets {
	
	private String	type;
	private String	title;
	private Integer	weight;
	
	
	public Sweets(String type, String title, Integer weight) {
	
		this.type = type;
		this.title = title;
		this.weight = weight;
	}

	
	public String getType() {
		return type;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Integer getWeight() {
		return weight;
	}

	

}
