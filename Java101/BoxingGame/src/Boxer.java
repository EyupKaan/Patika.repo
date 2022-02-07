
public class Boxer {
	
	String name;
	int damage, hp, weight;
	double dodge;
	
	public Boxer(String name, int damage, int hp, int weight, double dodge) {
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.weight = weight;
		this.dodge = dodge;
	}
	

	public int hit(Boxer b) {
		System.out.println("_________________________");
		System.out.println(this.name+" => "+b.name+" "+this.damage+" hit");
		
		if(b.dodge()) {
			System.out.println(b.name+" BLOCK!!");
			return b.hp;
		}
		
		if(b.hp - this.damage < 0) {
			return 0;
		}
		
		return b.hp - this.damage;
	}
	
	
	
	
	
	
	public boolean dodge() {
		
		double randomValue = (int) (Math.random()*100);

		return randomValue <= this.dodge;
	}
	
	
	
}
