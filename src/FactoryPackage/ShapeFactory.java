package FactoryPackage;
/**class that calls the creates instance of different shape classes based on the shape
 * @author Chitra
 * @version v2024.04
 */
public class ShapeFactory {

	/** method call that decides the class that has to be instantiated based on shape passed 
	 * @param shapeType 
	 * @return the instance of the selected shapeType  */
	public Shape getShape(String shapeType)
    {
        if(shapeType == null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }
        return null;
            
    }

}
