import java.util.Scanner;

public class HarmonicNumbers {

	public static void main(String[] args) {

		int num;
		double harmonic = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be harmonic: ");
		num = sc.nextInt();
		
		while(num > 0) {
			harmonic += (1.0/num);
			num--;
		}
		
		System.out.println(harmonic);
	
	}

}
