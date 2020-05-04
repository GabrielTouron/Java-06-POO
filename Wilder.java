public class Wilder {
	//attributes
	String firstname;
	boolean aware;
	
	//constructor
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	//getter
	public String getFirstname() {
		return this.firstname;
	}
	public boolean isAware() {
		return this.aware;
	}
	
	//setter
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setAware(boolean aware) {
		this.aware = aware;
	}
	
	// instance method
	public String whoAmI() {
		if (this.aware) {
			return "Je m'appelle " + this.getFirstname() + " et je suis aware";
		} else {
			return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
		}
	}
}
