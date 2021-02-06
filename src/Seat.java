
public class Seat {
	
	private static int seatACount;
	private static int seatACost;
	private static int seatBCount;
	private static int seatBCost;
	private static int seatCCount;
	private static int seatCCost;
	
	
	// ---- Get & Set methods ---- //
	// Set Seat Count A
	public static void setSeatACount(int count) {
		seatACount = count;
		//System.out.println("There are: " + seatACount + " Seat A tickets sold");
	}
	// Set Seat Count B
	public static void setSeatBCount(int count) {
		seatBCount = count;
		//System.out.println("There are: " + seatBCount + " Seat B tickets sold");
	}
	// Set Seat Count C
	public static void setSeatCCount(int count) {
		seatCCount = count;
		//System.out.println("There are: " + seatCCount + " Seat C tickets sold");
	}
	// Set Seat Cost A 
	public static void setSeatACost(int count) {
		seatACost = count;
		//System.out.println("The cost of a Seat A Ticket is: $" + seatACost);
	}
	// Set Seat Cost B
	public static void setSeatBCost(int count) {
		seatBCost = count;
		//System.out.println("The cost of a Seat A Ticket is: $" + seatBCost);
	}
	// Set Seat Cost C
	public static void setSeatCCost(int count) {
		seatCCost = count;
		//System.out.println("The cost of a Seat A Ticket is: $" + seatCCost);
	}
	
	// Get Seat Count A
	public int getSeatACount() {
		return seatACount;
	}
	// Get Seat Count B
	public int getSeatBCount() {
		return seatBCount;
	}
	// Get Seat Count C
	public int getSeatCCount() {
		return seatCCount;
	}
	// Get Seat Cost A
	public int getSeatACost() {
		return seatACost;
	}
	// Get Seat Cost B
	public int getSeatBCost() {
		return seatBCost;
	}
	// Get Seat Cost C
	public int getSeatCCost() {
		return seatCCost;
	}

}
