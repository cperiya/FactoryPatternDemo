package FactoryPackage;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**class to test factory pattern implementation
 * @author Chitra
 * @version v2024.04
 */

class ShapeFactory_Test {
	/**
	 * test case for shape as null
	 */
	@Test
	void getShape_test() {
		ShapeFactory shapefactory = new ShapeFactory();        
		assertTrue(shapefactory.getShape(null) == null);
	}

	/**
	 * test draw method when shape is circle
	 */
	@Test
	public void drawCircle_test() {
		ShapeFactory shapefactory = new ShapeFactory();        
		 assertTrue(shapefactory.getShape("Circle") instanceof Circle);
		
	}
	
	/***
	 * test draw method when shape rectangle
	 * 
	 */
	@Test
	public void drawRectangle_test() {
		ShapeFactory shapefactory = new ShapeFactory();
		assertTrue(shapefactory.getShape("Rectangle") instanceof Rectangle);
		
	}
	
	/***
	 * test draw method when shape is square
	 * 
	 */
	@Test
	public void drawSquare_test() {
		ShapeFactory shapefactory = new ShapeFactory();
		assertTrue(shapefactory.getShape("Square") instanceof Square);
		
	}

}
