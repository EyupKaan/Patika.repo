import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<Integer> arr = new ArrayList<>();
		MyList<Integer> liste = new MyList<>();
		//System.out.println("1 = "+arr.size());
		//arr.add(10);
		//arr.add(20);
		//System.out.println("2 = "+arr.size());
		//arr.add(30);
		//arr.add(40);
		//System.out.println("3 = "+arr.size());

		//System.out.println("size of liste : "+liste.getCapacity());
		
		liste.add(10);
		liste.add(20);
		liste.add(30);
		liste.add(40);
		liste.add(50);
		liste.add(30);
		
		//System.out.println(liste.getCapacity());
		//System.out.println(liste.size());
		//liste.remove(3);
		//System.out.println(liste.size());
		//System.out.println(liste.getCapacity());
		
		System.out.println(liste.size());
		System.out.println(liste.getCapacity());
		System.out.println(liste.toString());
		System.out.println("_________");
		System.out.println(liste.lastIndex(30));
		System.out.println(liste.indexOf(30));
		
		Object[] arr = liste.toArray();
		
		System.out.println(arr[0]);
		
		liste.clear();
		System.out.println(liste.isEmpty());
	}

}
