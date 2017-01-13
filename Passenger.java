
public class Passenger {

	String name;
	String streetName;
	String city;
	String phoneNum;
	String postalCode;
	
	
	public Passenger(String n, String sN, String c, String p, String pN, String pC){
		
		this.name = n;
		this.streetName = sN;
		this.city = c;
		this.phoneNum = pN;
		this.postalCode = pC;
	}
	
	public Passenger(Passenger p){
		this.name = p.name;
		this.streetName = p.streetName;
		this.city = p.city;
		this.phoneNum = p.phoneNum;
		this.postalCode = p.postalCode;

	}
	
	public static String printPassenger (Passenger a) {
		String info;
		
		info = a.name + "\n" + a.streetName + ", \n" + a.city + ", " + "a.postalCode";
		return info;
	
	}
}
