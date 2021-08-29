package model;

import java.util.List;

public class DimondFund {
	
	private List<Stone> stone;
	

	public List<Stone> getStone() {
		return stone;
	}

	public void setStone(List<Stone> stone) {
		this.stone = stone;
	}

	@Override
	public String toString() {
		return "DimondFund --" + stone;
	}
	


	
	
	

}
