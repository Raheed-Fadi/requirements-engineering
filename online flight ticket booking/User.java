

/**
 * @author RAHEED
 * @version 1.0
 * @created 25-Apr-2024 1:23:37 PM
 */
public class User {

	private string UserID;
	private string Username;
	private string Password;
	private Booking Bookings;
	public Booking m_Booking;
	public Search m_Search;

	public User(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param password
	 * @param username
	 */
	public boolean Login(string password, string username){
		return false;
	}

	/**
	 * 
	 * @param password
	 * @param username
	 * @param E-mail
	 */
	public boolean Signup(string password, atring username, string E-mail){
		return false;
	}

	/**
	 * 
	 * @param Seat
	 * @param Flight
	 */
	public void BookFlight(Seat Seat, Flight Flight){

	}

	/**
	 * 
	 * @param Booking
	 */
	public void CancelBooking(Booking Booking){

	}

	/**
	 * 
	 * @param Search
	 */
	public void Search(Search Search){

	}
}//end User