package net.franckbenault.bdd.calculator;

import java.util.Date;

public class DateCalculator {
	
	private Date currentDate;
	
	DateCalculator(Date date) {
		currentDate = date;
	}

	public boolean isDateInThePast(Date date) {
		// TODO Auto-generated method stub
		return date.before(currentDate);
	}

}
