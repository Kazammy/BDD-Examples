package net.franckbenault.bdd.calculator;

import java.util.Date;

public class DateCalculator {
	
	private Date currentDate;
	
	DateCalculator(Date date) {
		currentDate = date;
	}

	public boolean isDateInThePast(Date input) {
		return input.before(currentDate);
	}

}
