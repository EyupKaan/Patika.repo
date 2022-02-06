import java.util.Scanner;

public class PatternMethot {
	
	public static int pattern(int num, int i, int j) {
		
		System.out.print(i+" ");
		
		if(i<= 0 || j == 1) {
			while(num != i) return pattern(num, i + 5, 1);
			
			System.exit(0);
		}
		
		
		return pattern(num, i - 5, 0);
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = scan.nextInt();
		
		
		System.out.println(pattern(n, n, 0));

	}

}
