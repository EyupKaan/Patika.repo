import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int n = rand.nextInt(100);
		
		int right = 0;
		int guess;
		int userNumbers[] = new int[5];
		
		System.out.println(n);
		while(right < 5) {
			System.out.print("Guess a number between 0-100 : ");
			guess = sc.nextInt();
			
			if( guess < 0 || guess > 100) {
				System.out.println("Please!! It should be 0-100..");
				continue;
			}
			
			if(guess == n) {
				System.out.println("Congratulations!! YOU FOUND !! It was ''"+n+"''");
				break;
			}
			else {
				System.out.println("\nYou couldn't find..");
				if(n < guess && guess < (n+10)) {
					System.out.println("It's so close.. Lower it a little!!");
				}
				if(guess < n && guess > (n-10)) {
					System.out.println("It's so close. Increase it a little!!");
				}
				
			}
			userNumbers[right++] = guess;
			
			System.out.println("Remainder right = "+(5 - right));
			
			if(right == 5) {
				System.out.println("\nYour right is over...");
				System.out.print("The numbers you guessed ==> [");
				for(int i = 0; i < userNumbers.length; i++) System.out.print(userNumbers[i]+",");
				System.out.print("]");
			}
		}
		
	}

}
