package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Athlete;
import model.AthleteLogic;

public class TestAthleteLogic {

	Athlete athlete = new Athlete("John", "Yankees", 2012, 26);
	AthleteLogic logic = new AthleteLogic();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateYearsInLeague() {
		int years = logic.CalculateYearsInLeague(athlete);
		assertEquals(8, years, 0);
	}
	
	@Test 
	public void testCanBeConsideredForHOF() {
		athlete.setYearEnteredLeague(2009);
		assertTrue(logic.CanBeConsideredForHallOfFame(athlete));
	}
	
	@Test
	public void testCannotBeConsideredForHOF() {
		athlete.setYearEnteredLeague(2011);
		assertFalse(logic.CanBeConsideredForHallOfFame(athlete));
	}

}
