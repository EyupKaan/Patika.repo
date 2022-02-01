import java.util.Scanner;

public class Expo {
	
	static int pow(int a,int b) {
		
		if(b == 0) return 1;
		
		else if(a == 1) return 1;
		
		
		
		else {
			return a * pow(a, (b-1));
		}
		
	}

	public static void main(String[] args) {
		
		int num, power;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		System.out.print("Enter power of the number: ");
		power = sc.nextInt();
					
		System.out.println(num+" ^ "+power+" = "+pow(num, power));
			
	}

}
