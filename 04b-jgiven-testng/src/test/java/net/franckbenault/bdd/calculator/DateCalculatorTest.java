package net.franckbenault.bdd.calculator;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.testng.annotations.Test;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.Format;
import com.tngtech.jgiven.format.BooleanFormatter;
import com.tngtech.jgiven.testng.SimpleScenarioTest;

import net.franckbenault.bdd.calculator.DateCalculatorTest.TestSteps;

public class DateCalculatorTest extends SimpleScenarioTest<TestSteps> {

	@Test
	public void determine_past_date_test() throws ParseException {
	    given().today_is_$("2011-01-20");
	    when().$_ask_if_$_is_in_the_past("I","Jan 19, 2011");
		then().the_result_should_be(true).
		but().the_result_should_not_be(false);
	}
	

	@Test
	public void determine_non_past_date_test() throws ParseException {
	    given().today_is_$("2011-01-20");
	    when().$_ask_if_$_is_in_the_past("I","Jan 22, 2011");
		then().the_result_should_be(false).
		but().the_result_should_not_be(true);

	}


	
	public static class TestSteps extends Stage<TestSteps> {
		
		private DateCalculator calculator;
		private Date checkedDate;

		public void today_is_$(String currentDateInputString) throws ParseException {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date date = format.parse(currentDateInputString);
			calculator = new DateCalculator(date);
		}

		public void the_result_should_not_be(@Format( value = BooleanFormatter.class, args = { "yes", "no" } ) boolean yesNo) {
			assertFalse(yesNo ==calculator.isDateInThePast(checkedDate));
			
		}

		public TestSteps the_result_should_be(
				@Format( value = BooleanFormatter.class, args = { "yes", "no" } ) boolean yesNo) {
			assertTrue(yesNo ==calculator.isDateInThePast(checkedDate));
			return self();
		}

		public void $_ask_if_$_is_in_the_past(String user, String checkedDateString) throws ParseException {
			DateFormat format = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
			checkedDate = format.parse(checkedDateString);
		}
		
	}
}
