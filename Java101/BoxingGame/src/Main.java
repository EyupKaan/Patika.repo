
public class Main {
	
	public static void main(String[] args) {
		
		Boxer b1 = new Boxer("McGregor", 20, 100, 90, 45);
		Boxer b2 = new Boxer("Khabib", 25, 95, 90, 40);
				
		int getStarted = (int) (Math.random() * 2);
		if(getStarted == 0) {
			Ring ring = new Ring(b1, b2, 80, 100);
			System.out.println(b1.name+" starting to match..");
			ring.run();
		}
		if(getStarted == 1) {
			Ring ring = new Ring(b1, b2, 80, 100);
			System.out.println(b2.name+" starting to match..");
			ring.run();
		}
	}
}
