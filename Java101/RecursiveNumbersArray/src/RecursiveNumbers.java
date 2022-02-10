import java.util.Arrays;

public class RecursiveNumbers {

	public static void main(String[] args) {

		int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
		
		System.out.print("Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		Arrays.sort(arr);
		int ref = arr[0];
		int time = 1;
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i] == ref) {
				time++;
			}
			else {
				System.out.println("\n"+ref+" is recursive "+time+" times");
				ref = arr[i];
				time = 1;
			}
		}
		
		System.out.println("\n"+ref+" is recursive "+time+" times");
		
	}

}
