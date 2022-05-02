package classesObjectsMethods;

public class rectangleStack {
	private float length, width;
	
	public rectangleStack() {
		length = 1;
		width = 1;
	}
	
	public float doPerimeter() {
		return (length+width)*2;
	}
	
	public float doArea() {
		return length*width;
	}
	
	public void setValues(float length, float width) {
		if(length > 0 && length < 20)
			this.length = length;
		if(width > 0 && width <20)
			this.width = width;
	}
	
	public float doLength() {
		return length;
	}
	
	public float doWidth() {
		return width;
	}
	
	public boolean isSquare() {
		if(length == width)
			return true;
		else
			return false;
	}
	
	

}
