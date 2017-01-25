
public class Seat {

	Passenger passenger;
	int seatNum;
	boolean status;

	public Seat(Passenger p, int sN, boolean s) {
		this.passenger = p;
		this.seatNum = sN;
		
		if (this.passenger == null) {
			this.status = false;
		}
		else 
			this.status = true;
	}
	
	public Seat(Seat s){
		this.passenger = s.passenger;
		this.seatNum = s.seatNum;
		this.status = s.status;
	}
	
	public Seat(){
		this.passenger = null;
		this.seatNum = 0;
		this.status = false;
	}
	
	

	
} 

