//Wizard.java
//Author: Atacan Demiralp

public class Wizard extends Hero {
	
	private String name;
	private Ork ork;
	
	public Wizard(String name, Ork ork) {
		this.ork=ork;
		this.name=name;
		System.out.println(this.name + " new wizard created.");
	}
	
	public void interact_with() {
		System.out.println(this.name + " the Wizard encounters " + ork.getName() + " and " + ork.action() +"!");
	}
}
