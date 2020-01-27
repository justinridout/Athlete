package model;

public class Athlete {
	public String name;
	public String Team;
	public int YearEnteredLeague;
	public int age;
	public int YearsInLeague;
	
	public Athlete() {
		
	}
	
	public Athlete(String n, String t, int entered, int a) {
		this.name = n;
		this.Team = t;
		this.YearEnteredLeague = entered;
		this.age = a;
		this.setYearsInLeague();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}

	public int getYearEnteredLeague() {
		return YearEnteredLeague;
	}

	public void setYearEnteredLeague(int yearEnteredLeague) {
		YearEnteredLeague = yearEnteredLeague;
		this.setYearsInLeague();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYearsInLeague() {
		return YearsInLeague;
	}

	public void setYearsInLeague() {
		AthleteLogic logic = new AthleteLogic();
		int years = logic.CalculateYearsInLeague(this);
		this.YearsInLeague = years;
	}
	
	
}
