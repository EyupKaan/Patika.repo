import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		
		 String userName, pwd, newpwd;
		 
		 Scanner inp = new Scanner(System.in);
		 
		 System.out.print("Kullan�c� ad�: ");
		 userName = inp.nextLine();
		 System.out.print("�ifre: ");
		 pwd = inp.nextLine();
		 
		 if(userName.equals("patika") && pwd.equals("java123")) {
			 System.out.println("Giri� Ba�ar�l�..");
		 }
		 else {
			 System.out.println("Hatal� Giri�..");
			 System.out.println("1- �ifremi Yenile          2-��k��");
			 int tercih = inp.nextInt();
			 
			 switch(tercih) {
			 case 1:
				 System.out.print("Yeni �ifrenizi girin: ");
				 newpwd = inp.nextLine();
				 if(newpwd.equals(pwd))System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
				 else  break; System.out.println("�ifre olu�turuldu");
				 break;
			 case 2:
				 System.out.println("��k�� yap�ld�.");
			 }
		 }
		 
	}

}
