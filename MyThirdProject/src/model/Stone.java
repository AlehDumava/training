package model;


public class Stone {
	
	private String attribute;
	private String name;
	private String preciousness;
	private String origin;
	private String color;
	private byte opacity;
	private byte wayFaceting;
	private Integer value;
	
		
	public void setAttribute(String attribute) {
		this.attribute = attribute;
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


	public void setColor(String color) {
		this.color = color;
	}


	public void setOpacity(byte opacity) {
		this.opacity = opacity;
	}


	public void setWayFaceting(byte wayFaceting) {
		this.wayFaceting = wayFaceting;
	}


	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	
	@Override
	public String toString() {
		return "Stone <id> = " + attribute + "\n\t <name> " + name + "\n\t <preciousness> " + preciousness + "\n\t <origin> " + origin + "\n\t\t" +
				"VisualParameters \n\t\t <color> " + color + "\n\t\t <opacity> " + opacity + "\n\t\t <wayFaceting> " + wayFaceting +
				 "\n\t <value> " + value + "\n";
	}


	public String getAttribute() {
		return attribute;
	}


	public String getName() {
		return name;
	}


	public String getPreciousness() {
		return preciousness;
	}


	public String getOrigin() {
		return origin;
	}


	public String getColor() {
		return color;
	}


	public byte getOpacity() {
		return opacity;
	}


	public byte getWayFaceting() {
		return wayFaceting;
	}


	public Integer getValue() {
		return value;
	}

}
