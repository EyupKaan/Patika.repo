import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int num;
		int perfect = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Is it perfect number? --> ");
		num = sc.nextInt();
		
		for(int i=1; i<num; i++) {
			if(num%i == 0) {
				perfect += i;
			}
		}
		
		if(perfect == num) {
			System.out.println(num+" is perfect number.");
		}
		else {
			System.out.println(num+" is not perfect number.");
		}
	}

}
