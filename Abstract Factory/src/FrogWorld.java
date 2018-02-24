//FrogWorld.java
//Author: Atacan Demiralp

public class FrogWorld extends FactoryWorld {
	
	private Bug bug;

	private String playername;
	
	FrogWorld(String playername){
		this.playername=playername;
	}
	
	public void getWorld() {
		System.out.println("\n\n\t---------FrogWorld---------");
	}
		
	public void makeCharacter() {
		bug = getObstacle();
		Frog frog = new Frog(playername, bug);
		frog.interact_with();
	}

	@Override
	public void makeObstacle() {
		bug = new Bug();
	}
	
	public Bug getObstacle() {
		return this.bug;
	}
	
	public void createWorld() {
		getWorld();
		makeObstacle();
		makeCharacter();
	}

}
