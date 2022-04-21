package ptk;


public class Book implements Comparable<Book> {

	String title;
	int page;
	String author;
	String date;
	
	public Book(String title, int page, String author, String date) {
		super();
		this.title = title;
		this.page = page;
		this.author = author;
		this.date = date;
	}
	
	public String getTitle() {
		return title;
	}
	public int getPage() {
		return this.page;
	}

	@Override
	public int compareTo(Book o) {

		return getTitle().compareTo(o.getTitle());
	}
	
	
}
