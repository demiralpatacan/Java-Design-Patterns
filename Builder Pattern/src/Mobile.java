//Mobile.java
//Author: Atacan Demiralp

public class Mobile {
	private String os;
	private double display;
	private int capacity;
	private boolean touchID;
	public Mobile(String os, double display, int capacity, boolean touchID) {
		super();
		this.os = os;
		this.display = display;
		this.capacity = capacity;
		this.touchID = touchID;
	}
	@Override
	public String toString() {
		return "Mobile [os=" + os + ", display=" + display + ", capacity=" + capacity + ", touchID=" + touchID + "]";
	}
	
	
}
