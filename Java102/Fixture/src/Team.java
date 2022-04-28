import java.util.ArrayList;

public class Team {

	private String name;

	ArrayList<String> awayList = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getTeamName() {
		return name;
	}
	
}
