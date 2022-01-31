import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
 
		String userName, pwd;
		int balance = 1500;
		int right = 3;
		int price;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kullan�c� ad�: ");
		userName = sc.nextLine();
		System.out.print("�ifre; ");
		pwd = sc.nextLine();
		
		while(right>0) {
			
			if(userName.equals("patika") && pwd.equals("java123")) {
				
				System.out.println("Merhaba, Kodluyoruz bankas�na ho� geldiniz!!");
				System.out.println("1- Para yat�rma: \n"
						+ "2- Para �ekme: \n"
						+ "3- Bakiye sorgula: \n"
						+ "4- ��k�� yap");
				int select = sc.nextInt();
				
				switch(select) {
				case 1:
					System.out.print("Yat�rma tutar�: ");
					price = sc.nextInt();
					balance += price;
					break;
				case 2:
					System.out.print("�ekicek tutar: ");
					price = sc.nextInt();
					if(price > balance) System.out.println("Yetersiz bakiye..");
					else
						balance -= price;
					break;
				case 3:
					System.out.println("Bakiyeniz: "+balance);
					break;
				case 4:
					System.out.println("��k�� yap�ld�..");
				}
				
			}
			else {
				right--;
				System.out.println("Hatal� kullan�c� ad� veya �ifre. Tekrar deneyiniz.");
				
				if(right == 0)System.out.println("Hesab�n�z Bloke Olmu�tur..");
				else System.out.println(right+" hakk�n�z kald�.");
			}
				
		}	
		
	}

}
