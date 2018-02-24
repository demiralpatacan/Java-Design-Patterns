//Ork.java
//Author: Atacan Demiralp

public class Ork extends Obstacle{
	
	private String name;
	
	public Ork() {
		name="Kashnaq";
		System.out.println(name + "is an evil ork.");
	}
	
	public String getName() {
		return name;
	}
	
	public String action() {
		return "kills it.";
	}
}
