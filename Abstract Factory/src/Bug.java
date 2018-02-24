//Bug.java
//Author: Atacan Demiralp

public class Bug extends Obstacle{

	private String name;
	
	public Bug() {
		name="Bug";
		System.out.println(name + " is created.");
	}
	
	public String getName() {
		return name;
	}
	
	public String action() {
		return "eats it";
	}
	 
}
