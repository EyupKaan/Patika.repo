package ptk;

import java.util.Comparator;

public class OrderPageComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getPage() - o2.getPage();
	}

}
