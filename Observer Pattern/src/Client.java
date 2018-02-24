//Client.java
//Author: Atacan Demiralp

public class Client implements Observer {
	private Observable etheriumMiner = null;
	
	public Client(Observable observable) {
		this.etheriumMiner = observable;
	}

	@Override
	public void update() {
		buyEtheriumMiner();
		unsubscribe();
	}
	
	public void buyEtheriumMiner() {
		System.out.println("New Etherium Miner bought");
	}
	
	public void unsubscribe() {
		etheriumMiner.removeObserver(this);
	}
	
	
}
