//ObserverMain.java
//Author: Atacan Demiralp

public class ObserverMain {
	public static void main(String[] args) {
	      EtheriumMiner subject = new EtheriumMiner();

	      new Client(subject);		//Clients who observe Etherium Miner

	      System.out.println(subject.isAvailable());	
	      subject.setAvailability(false);		//set availability and notifies the clients
	      System.out.println(subject.isAvailable());	
	      subject.setAvailability(true);
	}
}
