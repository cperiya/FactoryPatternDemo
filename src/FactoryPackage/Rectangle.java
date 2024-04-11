package FactoryPackage;

/**class that implements rectangle draw method
 * @author Chitra
 * @version v2024.04
 * Class to implement Rectangle
 */
public class Rectangle implements Shape{
	
	/***
	 * overrides the draw class
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectangle :: draw() method.");
	}

}
