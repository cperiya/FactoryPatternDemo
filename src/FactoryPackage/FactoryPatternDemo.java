package FactoryPackage;
/** main class that calls factory pattern methods
 * @author Chitra
 * @version v2024.04
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		ShapeFactory shapeFactory = new ShapeFactory();
        //call shape factory to draw circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        //call shape factory to draw rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        //call shape factory to draw square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

	}

}
