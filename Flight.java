
public class Flight {

	int flightNum;
	Seat[] seats = new Seat [10];
	
	public Flight(int fNum, Seat[] seat){
		
		this.flightNum = fNum;
		this.seats = new Seat[10];
	}
	
	public int printFlight(int flightNum){
		
		for (int i = 0; i <= 10; i++){
			if (seats[i].passenger == null) {
				
			}
		}
		
		
		return flightNum;
	}
	
	
	 
}
