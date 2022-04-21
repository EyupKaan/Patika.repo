package ptk;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Book> list = new  TreeSet<Book>();
		
		list.add(new Book("Nutuk", 543, "Mustafa Kemal Atatürk", "1927"));
		list.add(new Book("Java", 102, "Patika", "2022"));
		list.add(new Book("Vadideki Zambak", 328, "Honore de Balzac", "1835"));
		list.add(new Book("Serenad", 416, "Zülfü Livaneli", "2011"));
		list.add(new Book("Babalar ve Oðullar", 264, "Ivan Turgenyev", "1862"));
		
		System.out.println("*ALPHABETICAL ORDER*");
		System.out.println("------------------------------");
		for (Book book : list) {
			System.out.println(book.getTitle()+" "+book.getPage());
		}
		TreeSet<Book> list2 = new TreeSet<>(new OrderPageComparator());
		list2.addAll(list);
		System.out.println("*PAGE NUMBER ORDER*");
		System.out.println("------------------------------");
		for (Book book : list2) {
			System.out.println(book.getTitle()+"-"+book.getPage());
		}
	}

}
