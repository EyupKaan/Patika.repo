import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		for(int i=0; i<=num; i++) {
			for(int j=0; j<(num-i); j++) System.out.print(" ");
			for(int k=1; k<=(2*i+1); k++)System.out.print("*");
			System.out.println(" ");
		}
		for(int i = num-1; i>=0; i--) {
			for(int j=0; j<(num-i); j++)System.out.print(" ");
			for(int k=0; k<=i*2; k++)System.out.print("*");
			System.out.println(" ");
		}
	}

}
