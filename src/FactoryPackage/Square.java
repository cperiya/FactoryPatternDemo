package FactoryPackage;

/**class that implements square draw method
 * @author Chitra
 * @version 2024.04
 * Class to implement Square
 */
public class Square implements Shape{
	
	/***
	 * overrides the draw class
	 */
	@Override
	public void draw() {
		System.out.println("Inside square :: draw() method.");
	}
}
