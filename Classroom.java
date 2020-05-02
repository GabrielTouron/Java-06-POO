public class Classroom {

	public static void main(String[] args) {
		Wilder tata = new Wilder("Tata", true);
		System.out.println(tata.whoAmI());
    
		tata.setAware(false);
		System.out.println(tata.whoAmI());
		
		Wilder toto = new Wilder("Toto", false);
		System.out.println(toto.whoAmI());
    
		toto.setAware(true);
		System.out.println(toto.whoAmI());
	}
}
