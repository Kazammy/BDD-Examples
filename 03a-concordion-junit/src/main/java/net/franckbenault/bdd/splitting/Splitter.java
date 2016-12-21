package net.franckbenault.bdd.splitting;

public class Splitter {
	
	public static FirstLastName split(String fullName) {
		String[] words = fullName.split(" ");
		if(words.length>1) {
			return new FirstLastName(words[0], words[1]);
		} else {
			return new FirstLastName(words[0], null);	
		}
	}

}
