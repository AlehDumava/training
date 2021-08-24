package model;

import java.util.List;

public class Stone {
	
	private String name;
	private String preciousness;
	private String origin;
	private Integer value;
	
	private List<VisualParameters> visualParameters;
	
	
	public String getName() {
		return name;
	}

	public String getPreciousness() {
		return preciousness;
	}

	public String getOrigin() {
		return origin;
	}

	public Integer getValue() {
		return value;
	}

	public List<VisualParameters> getVisualParameters() {
		return visualParameters;
	}

	


	public void setName(String name) {
		this.name = name;
	}



	public void setPreciousness(String preciousness) {
		this.preciousness = preciousness;
	}



	public void setOrigin(String origin) {
		this.origin = origin;
	}



	public void setValue(Integer value) {
		this.value = value;
	}



	public void setVisualParameters(List<VisualParameters> visualParameters) {
		this.visualParameters = visualParameters;
	}
	
	@Override
	public String toString() {
		return "Stone [name=" + name + ", preciousness=" + preciousness + ", origin=" + origin + ", value=" + value
				+ ", visualParameters=" + visualParameters + "]";
	}

}
