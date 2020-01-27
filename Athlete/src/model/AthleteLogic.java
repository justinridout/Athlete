package model;

import java.util.Calendar;

public class AthleteLogic {

	public int CalculateYearsInLeague(Athlete athlete) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		return year - athlete.getYearEnteredLeague();
	}
	
	public boolean CanBeConsideredForHallOfFame(Athlete athlete) {
		if(athlete.YearsInLeague > 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean CanBeConsideredForRookieAwards(Athlete athlete) {
		if(athlete.YearsInLeague < 3) {
			return true;
		}
		else {
			return false;
		}
	}
}
