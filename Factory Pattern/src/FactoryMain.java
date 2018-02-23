//FactoryMain.java
//Author: Atacan Demiralp

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factoryObj = new Factory();	//Factory object created
		
		//Factory creates operating system for Samsung Brand
		OperatingSystem osObj = factoryObj.GetBrand("Samsung");
		osObj.Display();
		
		//Factory creates operating system for Apple Brand
		osObj = factoryObj.GetBrand("Apple");
		osObj.Display();
				
		//Factory creates operating system for Nokia Brand
		osObj = factoryObj.GetBrand("Nokia");
		osObj.Display();
		
		//Factory creates operating system for Blackberry Brand
		osObj = factoryObj.GetBrand("Blackberry");
		osObj.Display();
	}

}
