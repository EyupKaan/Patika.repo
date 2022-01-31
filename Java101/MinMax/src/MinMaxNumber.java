import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {

		int counter;
		int min = 0, max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers will be entered ?: ");
		counter = sc.nextInt();
		
		for(int i = 1; i <= counter; i++) {
			System.out.print(i+". Enter the number => ");
			int n = sc.nextInt();
			
			if(i==1) {
				min = n;
				max = n;
			}
			else if(n<min) {
				min = n;
			}
			else {
				max = n;
			}
		}
		
		System.out.println("Greatest number: "+max);
		System.out.println("Smallest number: "+min);
		
	}

}
