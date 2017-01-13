
public class Flight {

	String flightNum;
	int day;
	int month;
	int hour;
	int minute;
	int year;
	Seat[] seats;
	
	public Flight(int d, int mo, int yr, int h, int m, Seat[] seat){
		this.day = d;
		this.month = mo;
		this.year = yr;
		this.hour = h;
		this.minute = m;
		this.flightNum = yr + mo + yr + h + m + " ";
	}
}
