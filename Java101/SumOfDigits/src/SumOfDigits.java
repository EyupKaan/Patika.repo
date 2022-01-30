import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		
		int num, dig, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		int digValue = num;
		while(digValue!= 0) {
			dig = digValue%10;
			digValue /=10;
			sum += dig;
		}
		
		System.out.println("Sum of digits "+num+" = "+sum);
	}

}
