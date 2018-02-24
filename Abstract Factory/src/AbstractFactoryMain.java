//AbstractFactoryMain.java
//Author: Atacan Demiralp

import java.util.Scanner;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		FactoryWorld fw;
		
		System.out.println("Hello! What's your name?");
		String playerName = reader.next();
		System.out.println("Welcome " + playerName +"! How old are you?");
		int playerAge = reader.nextInt();
		
		if(playerAge < 18) {					
			fw = new FrogWorld(playerName);			//Set the Frog World
		}
		else {
			fw = new WizardWorld(playerName);		//Set the Wizard World
		}
		fw.createWorld();			//create the world
		
		reader.close();
	}
}
