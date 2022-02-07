
public class Ring {

	Boxer b1, b2;
	int minW;
	int maxW;
	
	public Ring(Boxer b1, Boxer b2, int minW, int maxW) {
		this.b1 = b1;
		this.b2 = b2;
		this.minW = minW;
		this.maxW = maxW;
	}
	
	public void run() {
		if(checkWeight()) {
			while(b1.hp > 0 && b2.hp > 0) {
				System.out.println("******* NEW ROUND *******");
				
				this.b2.hp = this.b1.hit(this.b2);
				System.out.println(this.b2.name+"'s HP = "+this.b2.hp);
				if(isWin()) {
					break;
				}
				
				this.b1.hp = this.b2.hit(this.b1);
				System.out.println(this.b1.name+"'s HP = "+this.b1.hp);
				if(isWin()) {
					break;
				}
			}
		}
		
		else {
			System.out.println("Weights are not EQUAL!!");
		}
	}
	
	public boolean isWin() {
		
		if(b1.hp == 0) {
			
			System.out.println("WINNER --> "+b2.name);
			return true;
		}
		if(b2.hp == 0) {
			
			System.out.println("WINNER --> "+b1.name);
			return true;
		}
		
		return false;
	}
	
	public boolean checkWeight() {
		return ( (b1.weight >= minW) && (b1.weight <= maxW) ) &&
				( (b2.weight >= minW) && (b2.weight <= maxW));
	}
	
	
	
}
