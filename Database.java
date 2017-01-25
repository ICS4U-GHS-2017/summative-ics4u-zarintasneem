
public class Database {

	public static void main (String[] args){
		
		Flight flightA;
		Flight flightB;
		Seat[] seatsA = new Seat[10];
		Seat[] seatsB = new Seat[10];
		Passenger[] passengers = new Passenger[20];
		char enter = 'X';
		int flightNum = 0;
		
		System.out.println("Welcome to Flight-By-Night Database. \n'Enter' to access Flights.");
		In.getInt();
		
		while (enter == 'X'){
			System.out.print("Please enter your flight number:");
			flightNum = In.getInt();
			
			if (flightNum == 1 || flightNum == 2) {
				
				System.out.println();
				System.out.println("You have accessed flight number " + flightNum + ".");
				System.out.println("To continue, enter 'E'. To cancel, enter 'X'");
				enter = In.getChar();
			}
			
			else {
				enter = 'X';
			}
		}
		
		menu(flightNum);
		
	}
	
	public static void menu (int flightNum) {
		
		System.out.println("");
		System.out.println("You have accessed flight " + flightNum + ".");
		System.out.println("");
		System.out.println("To cancel or reserve a seat, enter 1.");
		System.out.println("To print flight information, enter 2.");
		System.out.println("To cancel a flight, enter 3.");
		System.out.println("To change a flight status to Take-Off, enter 4.");
	}
	
	public static String printFlight(int flightNum){
		return null;
		
	}
	
	public static void reserve() {
		
	}
	
	public static void cancel() {
		
	}
	
	public static String[] sortNames(String [] list) {
		int compare;
		String temp;
		
		for (int top = 1; top < list.length; top++) {
			
			String item = list[top]; // temporary storage of item
			int i = top;
			
			while (i > 0 && item.charAt(0) < list[i-1].charAt(0)) {
				// shift larger items to the right by one
				list[i] = list[i-1];
				// prepare to check the next item to the left
				i--;
			}
			
			list[i] = item; // put sorted item in open location
		}
		
		for (int i = 0; i < list.length-1; i++){
		
			compare = list[i].compareTo(list[i+1]);
			if (compare <= 0) {
				//if i is equal or smaller than i+1 leave it as it is
				list[i] = list[i];
			}
			else if (compare > 0) {
				//if i is greater than i+1
				temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp;
				
			}	
		}
		return list;
	}
	
	public static void saveNames() {
		String filePath = "src//testing.java";
		
	}
	
	public static void cancelFlights() {
		
	}
	
	public static void flightTakeOff() {
		
	}
	
	public static void flightAtDest() {
		
	}
	
	public static void deleteAllInfo() {
		
	}
}
