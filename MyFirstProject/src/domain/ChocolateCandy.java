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

	public void setCacaoBeansContent(Integer cacaoBeansContent) {
		this.cacaoBeansContent = cacaoBeansContent;
	}

	@Override
	public String toString() {
		return "ChocolateCandy [cacaoBeansContent=" + getCacaoBeansContent() + "]"+"\n";
	}

	
	

}
