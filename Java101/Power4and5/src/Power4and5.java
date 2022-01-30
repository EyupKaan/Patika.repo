import java.util.Scanner;
public class Power4and5 {

	public static void main(String[] args) {
		
		int input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		input = sc.nextInt();
		
		System.out.print("Numbers to the power of 4 =>  ");
		for(int i = 1; i<= input; i*=4) {
			System.out.print(i+", ");
		}
		
		System.out.print("\nNumbers to the power of 5 => ");
		for(int j = 1; j<= input; j*=5) {
			System.out.print(j+", ");
		}
	}

}
