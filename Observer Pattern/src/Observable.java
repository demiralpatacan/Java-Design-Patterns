//Observable.java
//Author: Atacan Demiralp

public interface Observable {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
}
