package booklist;

import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> bookList = new ArrayList<>();
		HashMap<String, String> mp = new HashMap<>();
		
		bookList.add(new Book("Book-1", "Author-1", 80, LocalDate.parse("2020-03-30")));
		bookList.add(new Book("Book-2", "Author-2", 436, LocalDate.parse("2012-11-14")));
		bookList.add(new Book("Book-3", "Author-3", 80, LocalDate.parse("2016-12-02")));
		bookList.add(new Book("Book-4", "Author-4", 673, LocalDate.parse("2008-07-11")));
		bookList.add(new Book("Book-5", "Author-5", 63, LocalDate.parse("2000-09-24")));
		bookList.add(new Book("Book-6", "Author-6", 227, LocalDate.parse("2013-04-02")));
		bookList.add(new Book("Book-7", "Author-7", 97, LocalDate.parse("1996-05-17")));
		bookList.add(new Book("Book-8", "Author-8", 345, LocalDate.parse("2021-08-26")));
		bookList.add(new Book("Book-9", "Author-9", 72, LocalDate.parse("2003-10-30")));
		bookList.add(new Book("Book-10", "Author10", 191, LocalDate.parse("1992-02-14")));
		
		bookList.forEach(book ->{
			mp.put(book.getTitle(), book.getAuthor());
		});
		
		System.out.println("*BOOKS*\t |\tAUTHORS  |");
		System.out.println("=========================|");
			
		for (String k : mp.keySet()) {
			System.out.println(k+"\t |\t"+mp.get(k)+" |");
			System.out.println("-------------------------|");
		}
		
		System.out.println("=========================|");
		System.out.println("\n\nBOOKS OVER 100 PAGE");
		System.out.println("_______________________");
		bookList.stream()
		.filter(book -> book.getPage() > 100)
		.forEach(book -> System.out.println(book.getTitle()
				+"\t,"+book.getAuthor()+"\t,"
				+book.getPage()));
		
		
	}

}
