package InheritanceQ1;
public class Shape {
	protected String shapeName;
	
    public Shape () {
    	this.shapeName = getShapeName();
    }
    
    public String getShapeName() {
    	return this.shapeName;
    }
    
    public void setName(String shapeName) {
    	this.shapeName = shapeName;
    }
    
    public double calculateArea() {
		return 0;
	}

	
}
