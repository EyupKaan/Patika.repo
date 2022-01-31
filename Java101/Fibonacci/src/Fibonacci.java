import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int num, fib;
		int p1 = 0, p2 = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Fibonacci Serie: ");
		num = sc.nextInt();
		System.out.print(p1+" "+p2);
		
		for(int i=2; i<=num; i++) {
			
			fib = p1+p2;
			System.out.print(" "+fib);
			p1 = p2;
			p2 = fib;
		}
		System.out.println();
	}

}
