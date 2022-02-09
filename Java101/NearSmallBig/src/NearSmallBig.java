import java.util.Arrays;
import java.util.Scanner;

public class NearSmallBig {

	public static void main(String[] args) {

		int input;
		int arr[] = {11, 33, 2, 7, 16, 110, 112, 155, 64, 55, -14, -33};
		int sNumber = 0;
		int bNumber = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entered number: ");
		input = scan.nextInt();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] < input) {
				sNumber = arr[i];
			}
		}
		
		for(int j = (arr.length-1); j >= 0; j--) {
			if(arr[j] > input) {
				bNumber = arr[j];
			}
		}
		
		System.out.println("The nearest number less than "+input+" is "+sNumber);
		System.out.println("The nearest number greater than "+input+" is "+bNumber);
		
	}

}
