package se.hiq.kodarskolan;

public class Book {

	private int price;

	public void setPrice (int price) {
		this.price = price;
	}

	public int getPrice () {
		return price;
	}

	public Book(Author author, String nm, String isbn) {
	}

	public void createCopyWithId(int i) {
	}
}
