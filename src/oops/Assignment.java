package oops;

import java.util.Scanner;

public class Assignment {
	public void match() {
		String team1 = "ind";
		String team2 = "aus";
		int overs = 50;
		int team1_score;
		int team2_score;
		System.out.println(" It is " + team1.toUpperCase() + " v/s " +team2.toUpperCase() 
		+ " ODI match" );
		Scanner sc = new Scanner(System.in);
		System.out.println("Is weather good or bad ?");
		String weather = sc.nextLine();
		if(weather.equalsIgnoreCase("good")) {
			System.out.println("The match will be held for 50 overs");
		}else if (weather.equalsIgnoreCase("bad")) {
			System.out.println("for how many hours weather is bad ?");
			int badweather =sc.nextInt();
			if (badweather == 1) {
				overs = overs-10;
				System.out.println("The match will be held for " +overs+" overs");
			}else if(badweather == 2) {
				overs = overs-20;
				System.out.println("The match will be held for " +overs+" overs");
			}else if (badweather > 3){
				System.out.println("the match is cancelled due to the bad weather");
			}
		}
		System.out.println("What is the score of IND ? ");
		team1_score = sc.nextInt();
		System.out.println("how many wickets did India loss ? ");
		int wickets1 = sc.nextInt();
		System.out.println("IND : "+ team1_score+"/"+wickets1);
		System.out.println("what is the score of AUS ? ");
		team2_score = sc.nextInt();
		System.out.println("how many wickets did India loss ? ");
		int wickets2 = sc.nextInt();
		System.out.println(" AUS : " + team2_score+"/"+wickets2);
		if (team1_score > team2_score) {
			System.out.println(" IND won by " + (team1_score - team2_score) + " runs");
		}else {
			System.out.println("AUS won by " + (team2_score - team1_score) + " runs");
		}
		
	}

	public static void main(String[] args) {
		Assignment a = new Assignment();
		a.match();

	}

}
