package classesObjectsMethods;

public class BookImplementation {
	public static void main(String[] args) {
	
	// My books
	Book annaKarenina = new Book();
	Book atonement = new Book();
	Book oneFlew = new Book();
	Book trainspotting = new Book();
	
	// annaKarenina
	annaKarenina.setBookID("0-553-21346-6");
	annaKarenina.setPages(873);
	annaKarenina.setPrice(150);
	
	// atonement
	atonement.setBookID("978-0-307-38884-1");
	atonement.setPages(480);
	atonement.setPrice(180);
	
	// oneFlew
	oneFlew.setBookID("978-0451163967");
	oneFlew.setPages(272);
	oneFlew.setPrice(200);
	
	// trainspotting
	trainspotting.setBookID("0-7493-3650-1");
	trainspotting.setPages(343);
	trainspotting.setPrice(250);
	
	atonement.show();
	}
}
