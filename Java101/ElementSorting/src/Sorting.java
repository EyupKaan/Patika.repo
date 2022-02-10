import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size = scan.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements of array: ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+". Element = ");
			arr[i] = scan.nextInt();
			
		}
		
		Arrays.sort(arr);
		
		System.out.print("Sorting --> ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
				
	}

}
