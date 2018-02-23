//BuilderMain.java
//Author: Atacan Demiralp

public class BuilderMain {
	
	public static void main(String[] args) {
		//The builder class returns a mobile object as we want
		Mobile mobileObj = new Builder().setCapacity(128).setDisplay(5.5).GetPhone();
		//We don't set all the values to test the program
		
		System.out.println(mobileObj);
		//In the output, we see that undetermined boolean is initialized as false
	}
	
}
