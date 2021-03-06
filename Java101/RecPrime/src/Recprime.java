import java.util.Scanner;

public class Recprime {

    public static int isPrime(int n, int i) {
        if (i == 1) {
            return 0;
        }
        else {
            if (n % i == 0) {
                return 1;
            }
            else {
                return isPrime(n, i - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write a number: ");
        int n = scanner.nextInt();

        System.out.println(n + (isPrime(n, n / 2) == 1 ? " is not a PRIME NUMBER." : " is a PRIME NUMBER."));
    }
}