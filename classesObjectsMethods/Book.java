package classesObjectsMethods;

/* 
 * Exercise 1:
	Write a class Book with three data members BookId, Pages and Price.
	It also contains the following member function:
		• The get() method is used to input values
		• The show() method is used to display values
		• The set() method is used to set the values of data members using parameters
		• The getPrice() method is used to return the value of price
 */

public class Book {
	
	private String bookId;
	private int pages;
	private double price;
	
	// The get() method is used to input values
	public String getBookID() {
		return bookId;
	}
	
	public int getPages() {
		return pages;
	}
	
	// The getPrice() method is used to return the value of price
	public double getPrice() {
		return price;
	}
	
	// The set() method is used to set the values of data members using parameters
	public void setBookID(String bookId) {
		this.bookId = bookId;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("Book ID: " + bookId);
		System.out.println("Pages: " + pages);
		System.out.println("Price: " + price);
		
	}

}
