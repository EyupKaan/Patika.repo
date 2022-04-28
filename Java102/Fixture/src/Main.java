import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Team> teams = new ArrayList<>();
		ArrayList<Team> tempTeams = new ArrayList<>();
		ArrayList<Week> weeks = new ArrayList<>();
		
		Team homeTeam;
		Team awayTeam;
		
		teams.add(new Team("Liverpool FC"));
		teams.add(new Team("Manchester City FC"));
		teams.add(new Team("Manchester United FC"));
		teams.add(new Team("Chelsea FC"));
		teams.add(new Team("Arsenal FC"));
		teams.add(new Team("Tottenham Hotspur FC "));
	
		if(teams.size() % 2 == 1) teams.add(new Team("BAY"));
		
		Random rnd = new Random();
		int numberOfGame = teams.size() - 1;
		int week = 1;
		while(numberOfGame > 0) {
			tempTeams.addAll(teams);
			Week wk = new Week(week);
			while(tempTeams.size() > 0) {
				int random = rnd.nextInt(tempTeams.size());
				homeTeam = tempTeams.get(random);
				tempTeams.remove(homeTeam);
				random = rnd.nextInt(tempTeams.size());
				awayTeam = tempTeams.get(random);
				
				if(!homeTeam.awayList.contains(awayTeam.getTeamName())) {
					homeTeam.awayList.add(awayTeam.getTeamName());
					tempTeams.remove(awayTeam);
					wk.home.add(homeTeam.getTeamName());
					wk.away.add(awayTeam.getTeamName());
				}else {
					wk = new Week(week);
					tempTeams.clear();
					tempTeams.addAll(teams);
				}
			}
			numberOfGame--;
			week++;
			weeks.add(wk);
		}
		System.out.println("\n1. Half Of Season\n");
		for (Week w : weeks) {
			System.out.println("*WEEK --> "+w.getWeeks());
			for(int i = 0; i < w.away.size(); i++) {
				System.out.println(w.home.get(i)+" vs "+w.away.get(i));
			}
			System.out.println();
			
		}
		
		System.out.println("===============================================");
		System.out.println("\n2. Half Of Season\n");
		for (Week w: weeks) {
			System.out.println("WEEK --> "+w.getWeeks());
			for(int i = 0; i < w.away.size(); i++) {
				System.out.println(w.away.get(i)+" vs "+w.home.get(i));
			}
			System.out.println();
		}
		
	}

}
