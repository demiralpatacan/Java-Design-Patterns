//Factory.java
//Author: Atacan Demiralp

public class Factory {
	
	public OperatingSystem GetBrand (String brandName) {
		switch (brandName) {
			case "Samsung":	return new Android();
			case "Apple":	return new IOS();
			case "Nokia":	return new WindowsPhone();
			default:	 System.out.println("Invalid Brand Name"); 
							return null;
		}
	}
}
