package booklist;

import java.time.LocalDate;

public class Book {
	
	private String title,
					author;
	
	private int page;
	
	private LocalDate date;

	public Book(String title, String author, int page, LocalDate date) {
		super();
		this.title = title;
		this.author = author;
		this.page = page;
		this.date = date;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPage() {
		return page;
	}
	
}
