import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
 
		String userName, pwd;
		int balance = 1500;
		int right = 3;
		int price;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Kullanýcý adý: ");
		userName = sc.nextLine();
		System.out.print("Þifre; ");
		pwd = sc.nextLine();
		
		while(right>0) {
			
			if(userName.equals("patika") && pwd.equals("java123")) {
				
				System.out.println("Merhaba, Kodluyoruz bankasýna hoþ geldiniz!!");
				System.out.println("1- Para yatýrma: \n"
						+ "2- Para çekme: \n"
						+ "3- Bakiye sorgula: \n"
						+ "4- Çýkýþ yap");
				int select = sc.nextInt();
				
				switch(select) {
				case 1:
					System.out.print("Yatýrma tutarý: ");
					price = sc.nextInt();
					balance += price;
					break;
				case 2:
					System.out.print("Çekicek tutar: ");
					price = sc.nextInt();
					if(price > balance) System.out.println("Yetersiz bakiye..");
					else
						balance -= price;
					break;
				case 3:
					System.out.println("Bakiyeniz: "+balance);
					break;
				case 4:
					System.out.println("Çýkýþ yapýldý..");
				}
				
			}
			else {
				right--;
				System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
				
				if(right == 0)System.out.println("Hesabýnýz Bloke Olmuþtur..");
				else System.out.println(right+" hakkýnýz kaldý.");
			}
				
		}	
		
	}

}
