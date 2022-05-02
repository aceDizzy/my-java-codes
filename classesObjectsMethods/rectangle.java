package classesObjectsMethods;

// Create a class rectangle
public class rectangle {
	
	// The class has attributes length and width each of which defaults to 1. 
	private float length, width = 1;
	
	// It has member function that calculates the perimeter and the area of the rectangle.
	public void perimeter() {
		System.out.println("Perimeter of the rectangle is: "+ (length * 2 + width * 2));
	}
	
	public void area() {
		System.out.println("Area of the rectangle is "+ (length * width));
	}
	
	// It has set() and get() functions for both length and width.
	public float getLength() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	// The set() function should verify that length and width are each floating point numbers 
	// larger than 0.0 and less than 20.0.
	public void setLW(float length, float width) {
		if(length > 0 && length < 20)
			this.length = length;
		
		if(width > 0 && width < 20)
			this.width = width;
		
			
		}
	}
	
	
