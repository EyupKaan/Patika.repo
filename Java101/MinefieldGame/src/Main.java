import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter width of field : ");
		int col = sc.nextInt();
		
		System.out.print("Enter height of field : ");
		int row = sc.nextInt();
		
		Minefield m = new Minefield(row,col);
		m.Exe();
	}

}
