import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList<T> {

	private T[] list;			// default list
	private int number = 0;     // default number of element 
	private int index = 0;  	// default index
	
	public MyList() {
		
		this.list = (T[]) new Object[10]; // default created list 	
	}
	
	public MyList(int capacity) {
		
		this.list = (T[]) new Object[capacity]; // user preffered list
	}
	
	public int getCapacity() {
		
		return list.length;
	}
	
	public int size(){
		
		return number;
	}
	
	public void add(T element) {
		if(number == list.length) {
			list = Arrays.copyOf(list, list.length * 2);
		}
		
		list[index++] = element;
		number++;
		
	}
	
	public T get(int index) {
		return list[index];
	}
	
	public void remove(int index) {
		if (index < 0 || list.length <= index) {
            return;
        }
		
		T[] copyList = (T[]) new Object[getCapacity()];
		
		for(int i = 0; i < getCapacity(); i++) {
			
			if(i == index) continue;
			
			if(index < i) {
				copyList[i-1] = list[i];
			}
			else {
				copyList[i] = list[i];
			}
		}
		
		list = copyList;
		index--;
		number--;
	}
	
	public void set(int index, T element) {
		if(index < 0 || list.length <= index) {
			return;
		}
		
		list[index] = element;
	}
	
	public String toString() {
		
		String str = "[";
		
		
		for(int i = 0; i < size(); i++) {
			str += list[i];
			str += ",";
		}
		
		str = str.substring(0, str.length() - 1);
		str += "]";
		
		return str;
		
	}
	
	public int indexOf(T element) {
		
		for(int i = 0; i <= size(); i++) {
			
			if(list[i] == element) {
				return i;
			}
			
		}
		return -1;
	}
	
	public int lastIndex(T element) {
		
		for(int i = size(); i >= 0; i--) {
			
			if(list[i] == element) {
				return i;
			}
			
		}
		
		return -1;
	}
	
	public boolean isEmpty() {
		
		if(number == 0) return true;
		
		
		return false;
	}
	
	public T[] toArray() {
			
		T[] arr = (T[]) new Object[size()];
		
		for(int i = 0; i < size(); i++) {
			arr[i] = list[i];
		}
		
		return arr;
	}
	
	public void clear() {
		for (T t : list) {
			t = null;
		}
		number = 0;
	}
	
	public MyList<T> sublist(int first, int last){
		
		if( (first >= list.length || first < 0) &&
				last >= list.length || last < first) {
			return null;
		}
		
		int lengthSublist = last - first;
		MyList<T> subList = new MyList<>(lengthSublist);
		
		for(int i = first; i < last; i++) {
			subList.add((T) list[i]);
		}
		
		return subList;
		
	}
	
	public boolean contains(T data) {
		
		for (Object o : list) {
			
			if(data.equals(o)) return true;
		
		}
		return false;
	}
}
