import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int row;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row number: ");
		row = sc.nextInt();
		
		for(int i = row-1; i>=0; i--) {
			for(int j=0; j<(row-i); j++)System.out.print(" ");
			for(int k=0; k<=i*2; k++)System.out.print("*");
			System.out.println(" ");
		}
	}
}
