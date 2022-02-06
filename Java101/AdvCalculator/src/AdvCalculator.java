import java.util.Scanner;

public class AdvCalculator {
	static Scanner scan = new Scanner(System.in);
	
	static void plus() {
        System.out.print("How many number will be collected ? ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }

        System.out.println("Result = " + result);
	}
	
	static void minus() {
		System.out.print("How many number will be processed ? ");
		int counter = scan.nextInt();
		int num, result = 0;
		
		for(int i = 1; i <= counter; i++) {
			System.out.print(i+". Number :");
			num = scan.nextInt();
			if(i == 1) {
				result += num;
				continue;
			}
			result -= num;
		}
		
		System.out.println("Result = "+result);
	}
	
	static void division() {
		System.out.print("Enter 1. Number : ");
		double num1 = scan.nextDouble();
		System.out.println("Enter 2. Number : ");
		double num2 = scan.nextDouble();
		
		double result;
		
		if(num1%num2 == 0) {
			result = num1 / num2;
			System.out.println("Result = "+result);
			System.out.println((int)num1+" is exactly divisible by "+(int)num2);
			
		}
		else {
			result = num1 / num2;
			System.out.println("Result = "+result);
			System.out.println("Remainder is :"+num1%num2);
		}
	}
	
	static void multiplication() {
		System.out.print("How many number will be multiply ? ");
		int counter = scan.nextInt();
		int result = 0, num;
		
		for(int i = 1; i <= counter; i++) {
			System.out.print(i+". Numer : ");
			num = scan.nextInt();
			if(i == 1) {
				result += num;
				continue;
			}
			result *= num;
		}
		System.out.println("Result = "+result);
		
	}
	
	static void power() {
		System.out.print("Enter the Root : ");
		int root = scan.nextInt();
		System.out.print("Enter the Power : ");
		int pow = scan.nextInt();
		int result = 1;
		
			
		for(int i = 1; i<=pow; i++) {
				result *= root;
			}
			System.out.println("Result = "+result);
		   	
		}
	
	static void factorial() {
		System.out.print("Factorial of : ");
		int num = scan.nextInt();
		int result = 1;
		
		for(int i = 1; i<=num; i++) {
			result *= i;
		}
		
		System.out.println("!"+num+" = "+result);
		
	}
	
	static void rectangleArea() {
		int a, b, area;
		System.out.print("Enter the short side : ");
		a = scan.nextInt();
		System.out.print("Enter the long side : ");
		b = scan.nextInt();
		
		if(a == b) {
			area = a* b;
			System.out.println("It is a square ");
			System.out.println("Area = "+area);
		}
		else {
			area = a*b;
			System.out.println("Area = "+area);
		}
	}
	
	
	

	public static void main(String[] args) {
		
		int select;
		String menu= "1- Addition\n"
				+ "2- Subtraction\n"
				+ "3- Multiplication\n"
				+ "4- Division\n"
				+ "5- Exponentiation\n"
				+ "6- Factorial\n"
				+ "7- Area of Rectangle\n"
				+ "0- Exit";
		
		do {
			System.out.println(menu);
			System.out.print("Select a process : ");
			select = scan.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				multiplication();
				break;
			case 4:
				division();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				rectangleArea();
				break;
				default:
					System.out.println("Please enter numbers between 1-7 !! ");
			}	
		}while(select != 0);
		
	}

}
