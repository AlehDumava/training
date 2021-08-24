package model;

public class VisualParameters {
	
	private String color;
	private byte opacity;
	private byte wayFaceting;
	
		public VisualParameters(String color, byte opacity, byte wayFaceting) {
		super();
		this.color = color;
		this.opacity = opacity;
		this.wayFaceting = wayFaceting;
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

		@Override
		public String toString() {
			return "VisualParameters [color=" + color + ", opacity=" + opacity + ", wayFaceting=" + wayFaceting + "]";
		}
	
	

}
