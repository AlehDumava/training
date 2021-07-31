package domain;


public class ChocolateCandy extends Sweets {
	
	private Integer cacaoBeansContent;

	public ChocolateCandy(String type, String title, Integer shugarContent, Integer weight, Integer cacaoBeansContent) {
		super(type, title, shugarContent, weight);
		
		this.cacaoBeansContent = cacaoBeansContent;
	}

	public Integer getCacaoBeansContent() {
		return cacaoBeansContent;
	}

	

	@Override
	public String toString() {
		return String.format("Type Sweets:  %-12s Title Sweets:  %-20s Shugar Content, percent:  %-4d Weight, gramm:  %-4d CacaoBeansContent:  %-4d", 
				getType(), getTitle(), getShugarContent(), getWeight(), getCacaoBeansContent());
	}

	
	

}
