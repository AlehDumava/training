package domain;


public class Chocolate extends Sweets {
	
	private Integer cacaoBeansContent;

	public Chocolate(String type, String title, Integer weight, Integer cacaoBeansContent) {
		super(type, title, weight);
		this.cacaoBeansContent = cacaoBeansContent;
	}

	public Integer getCacaoBeansContent() {
		return cacaoBeansContent;
	}

	public void setCacaoBeansContent(Integer cacaoBeansContent) {
		this.cacaoBeansContent = cacaoBeansContent;
	}
	

}
