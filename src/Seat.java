
public class Seat {
	
	private static int seatACount;
	private static double seatACost;
	private static int seatBCount;
	private static double seatBCost;
	private static int seatCCount;
	private static double seatCCost;
	
	
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
	public static void setSeatACost(double count) {
		seatACost = count;
		//System.out.println("The cost of a Seat A Ticket is: $" + seatACost);
	}
	// Set Seat Cost B
	public static void setSeatBCost(double count) {
		seatBCost = count;
		//System.out.println("The cost of a Seat A Ticket is: $" + seatBCost);
	}
	// Set Seat Cost C
	public static void setSeatCCost(double count) {
		seatCCost = count;
		//System.out.println("The cost of a Seat A Ticket is: $" + seatCCost);
	}
	
	// Get Seat Count A
	public static int getSeatACount() {
		return seatACount;
	}
	// Get Seat Count B
	public static int getSeatBCount() {
		return seatBCount;
	}
	// Get Seat Count C
	public static int getSeatCCount() {
		return seatCCount;
	}
	// Get Seat Cost A
	public static double getSeatACost() {
		return seatACost;
	}
	// Get Seat Cost B
	public static double getSeatBCost() {
		return seatBCost;
	}
	// Get Seat Cost C
	public static double getSeatCCost() {
		return seatCCost;
	}

}
