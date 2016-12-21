package net.franckbenault.bdd.splitting;

public class Splitter {
	
	public static FirstLastName split(String fullName) {
		String[] words = fullName.split(" ",2);
		
		if(isTitle(words[0])) {
			words = words[1].split(" ",2);
		}
		
		if(words.length>1) {
			return new FirstLastName(words[0], words[1]);
		} else {
			return new FirstLastName(words[0], null);	
		}
	}
	
	private static boolean isTitle(String input) {
		if ("Sir".equals(input)) {
			return true;
		} 
		return false;
	}

}
