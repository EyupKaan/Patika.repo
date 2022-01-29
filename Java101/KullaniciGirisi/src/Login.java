import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
		
		 String userName, pwd, newpwd;
		 
		 Scanner inp = new Scanner(System.in);
		 
		 System.out.print("Kullanýcý adý: ");
		 userName = inp.nextLine();
		 System.out.print("Þifre: ");
		 pwd = inp.nextLine();
		 
		 if(userName.equals("patika") && pwd.equals("java123")) {
			 System.out.println("Giriþ Baþarýlý..");
		 }
		 else {
			 System.out.println("Hatalý Giriþ..");
			 System.out.println("1- Þifremi Yenile          2-Çýkýþ");
			 int tercih = inp.nextInt();
			 
			 switch(tercih) {
			 case 1:
				 System.out.print("Yeni þifrenizi girin: ");
				 newpwd = inp.nextLine();
				 if(newpwd.equals(pwd))System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				 else  break; System.out.println("Þifre oluþturuldu");
				 break;
			 case 2:
				 System.out.println("Çýkýþ yapýldý.");
			 }
		 }
		 
	}

}
