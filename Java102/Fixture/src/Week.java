import java.util.ArrayList;

public class Week {
	
	private int weeks;
	
	ArrayList<String> home = new ArrayList<>();
	ArrayList<String> away = new ArrayList<>();
	
	public Week(int count) {
		this.weeks = count;
	}
	
	public int getWeeks() {
		return weeks;
	}
}
