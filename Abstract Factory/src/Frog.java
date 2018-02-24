//Frog.java
//Author: Atacan Demiralp

public class Frog extends Hero{
	
	private String name;
	private Bug bug;
	
	public Frog(String name, Bug bug) {
		this.bug=bug;
		this.name=name;
		System.out.println(this.name + " new frog created");
	}
	
	public void interact_with() {
		System.out.println(this.name + " the Frog encounters " + bug.getName() + " and " + bug.action() +"!");
	}
}
