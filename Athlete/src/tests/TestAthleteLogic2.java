package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Athlete;
import model.AthleteLogic;

public class TestAthleteLogic2 {

	Athlete athlete = new Athlete("Tom", "Red Socks", 2019, 19);
	AthleteLogic logic = new AthleteLogic();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test 
	public void testCanBeConsideredForHOF() {
		assertTrue(logic.CanBeConsideredForRookieAwards(athlete));
	}
	
	@Test
	public void testCannotBeConsideredForHOF() {
		athlete.setYearEnteredLeague(2015);
		assertFalse(logic.CanBeConsideredForRookieAwards(athlete));
	}
}
