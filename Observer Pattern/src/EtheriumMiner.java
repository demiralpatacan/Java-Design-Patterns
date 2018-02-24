//EtheriumMiner.java
//Author: Atacan Demiralp
import java.util.ArrayList;

public class EtheriumMiner implements Observable {
	//list of clients registered for notification
	private ArrayList<Observer> clients = new ArrayList<Observer>();
	private boolean available= true;
	
	public boolean isAvailable() {	//to see if the miner is available
		return available;
	}
	
	public void setAvailability(boolean available) {	//to set availability of the miner
		this.available = available;
		notifyObserver();
	}

	@Override
	public void addObserver(Observer k) {
		clients.add(k);
	}

	@Override
	public void removeObserver(Observer k) {
		clients.remove(k);
	}

	@Override
	public void notifyObserver() {
		//notify all clients
		for(Observer k:clients)
			k.update();
	}
}
