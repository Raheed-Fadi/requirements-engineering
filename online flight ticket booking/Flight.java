

/**
 * @author RAHEED
 * @version 1.0
 * @created 25-Apr-2024 1:23:36 PM
 */
public class Flight {

	private string FlightNumber;
	private string DepartureLocation;
	private date DepartureDate;
	private time DepartureTime;
	private Seat Seats;
	public Airline m_Airline;

	public Flight(){

	}

	public void finalize() throws Throwable {

	}
	public boolean CheckSeatAvailability(){
		return false;
	}
}//end Flight