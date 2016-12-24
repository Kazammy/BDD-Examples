package net.franckbenault.bdd.splitting;

public class FirstLastName {
	
	public FirstLastName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

    private String firstName;
	private String lastName;
    
    public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}


	@Override
	public String toString() {
		return "FirstLastName [firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
