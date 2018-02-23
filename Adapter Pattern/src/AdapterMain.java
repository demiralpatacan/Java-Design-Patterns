//AdapterMain.java
//Author: Atacan Demiralp

public class AdapterMain {
	public static void main(String[] args) {
	    Windows file = new Exe();		//We create an exe object
	    file.runExe(".exe");				//We run the exe ojbect as Windows does
	    
	    file = new Adapter(new Dmg());	//We create a Dmg object
	    file.runExe(".dmg");				//We run the Dmg object as Windows does
	 }
}
