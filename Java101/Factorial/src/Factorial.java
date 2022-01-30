import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		// f / (r*(num-com)!)
		int num, f = 1, com = 1, r = 1, num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("Factorial Number: ");
		num = sc.nextInt();
		
		// num! = f
		for(int i=1; i<=num; i++){   
		
			f = f*i;
		}
		System.out.println("Factorial of this number => "+num+" = F("+f+")");
	
		System.out.print("Combination Numbers: ");
		num = sc.nextInt();
		num2 = sc.nextInt();
		
		// num2! = r
		for(int j=1; j<=num2; j++) {
			
			r = r*j;
		}
		
		// (num-num2)! = com
		for(int k=1; k<=(num-num2); k++) {
			
			com = com*k;
			
		}
		
		// num! / (num2!*(num-num2)!) = f / (r * com)
		int combination = f / (r*com);
		System.out.print("\nCombination of these number C("+num+", "+com+") = "+combination);
	
	}
}
