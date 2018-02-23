//Adapter.java
//Author: Atacan Demiralp

public class Adapter implements Windows{
	private Mac mac;
	
	public Adapter(Mac mac) {
		this.mac=mac;
	}

	@Override
	public void runExe(String file_extention) {
		System.out.println("Using Adapter--> " );
		mac.runDMG(file_extention);
	}
}
