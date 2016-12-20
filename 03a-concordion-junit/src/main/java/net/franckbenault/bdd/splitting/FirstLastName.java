package net.franckbenault.bdd.splitting;

public class FirstLastName {
	
	public FirstLastName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

    public String firstName;
	public String lastName;
    
    @Override
	public String toString() {
		return "FirstLastName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
