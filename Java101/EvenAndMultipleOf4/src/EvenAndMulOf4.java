import java.util.Scanner;
public class EvenAndMulOf4 {

	public static void main(String[] args) {

		int k, t = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter a number: ");
			k = sc.nextInt();
			
			if(k %2==0 && k %4==0) {
				t += k;
			}
			
		}while(k % 2==0);
		
		System.out.println("Total of even and multiple of 4 numbers: "+t);
		
		
	}

}
