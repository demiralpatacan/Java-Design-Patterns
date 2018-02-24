//WizardWorld.java
//Author: Atacan Demiralp

public class WizardWorld extends FactoryWorld {

	private Ork ork;
	private String playername;
	
	WizardWorld(String playername){
		this.playername=playername;
	}
	
	public void getWorld() {
		System.out.println("\n\n\t---------WizardWorld---------");
	}
	
	public void makeCharacter() {
		ork = getObstacle();
		Wizard wizard = new Wizard(playername, ork);
		wizard.interact_with();
	}

	@Override
	public void makeObstacle() {
		ork = new Ork();
	}

	@Override
	public Ork getObstacle() {
		return this.ork;
	}

	@Override
	public void createWorld() {
		getWorld();
		makeObstacle();
		makeCharacter();

	}

}
