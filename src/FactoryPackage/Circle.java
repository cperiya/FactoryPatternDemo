package FactoryPackage;

/**class that implements circle draw method
 * @author Chitra
 * @version v2024.04
 * Class to implement Circle
 */
public class Circle implements Shape{

	/***
	 * overrides the draw class
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle :: draw() method.");
	}
}
