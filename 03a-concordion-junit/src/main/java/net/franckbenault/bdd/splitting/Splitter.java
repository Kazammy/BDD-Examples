package net.franckbenault.bdd.splitting;

public class Splitter {
	
	public static FirstLastName split(String fullName) {
		String[] words = fullName.split(" ");
        return new FirstLastName(words[0], words[1]);
	}

}
