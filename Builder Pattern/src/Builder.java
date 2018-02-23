//Builder.java
//Author: Atacan Demiralp

public class Builder {
	
	private String os;
	private double display;
	private int capacity;
	private boolean touchID;
	
	public Builder setOs(String os) {
		this.os = os;
		return this;
	}
	public Builder setDisplay(double display) {
		this.display = display;
		return this;
	}
	public Builder setCapacity(int capacity) {
		this.capacity = capacity;
		return this;
	}
	public Builder setTouchID(boolean touchID) {
		this.touchID = touchID;
		return this;
	}
	public Mobile GetPhone() {
		return new Mobile(os, display, capacity, touchID);
	}
	
}
