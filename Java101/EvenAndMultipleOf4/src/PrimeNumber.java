
public class PrimeNumber {
	
	static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {

		for(int i = 2; i<=100; i++) {
			if(prime(i)) {
				
				System.out.print(i+" ");
			}
		}
	}
//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 

}
