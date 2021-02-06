
public class Seat {
	
	private static int seatACount;
	private static int seatACost;
	private static int seatBCount;
	private static int seatBCost;
	private static int seatCCount;
	private static int seatCCost;
	
	
	// ---- Get & Set methods ---- //
	
	public static void setSeatACount(int count) {
		seatACount = count;
		System.out.println("There are: " + seatACount + " Seat A tickets sold");
	}

	public static void setSeatBCount(int count) {
		seatBCount = count;
		System.out.println("There are: " + seatBCount + " Seat B tickets sold");
	}
	
	public static void setSeatCCount(int count) {
		seatCCount = count;
		System.out.println("There are: " + seatCCount + " Seat C tickets sold");
	}
	public static void setSeatACost(int count) {
		seatACost = count;
		System.out.println("The cost of a Seat A Ticket is: $" + seatACost);
	}
	public static void setSeatBCost(int count) {
		seatBCost = count;
		System.out.println("The cost of a Seat A Ticket is: $" + seatBCost);
	}
	public static void setSeatCCost(int count) {
		seatCCost = count;
		System.out.println("The cost of a Seat A Ticket is: $" + seatCCost);
	}
}
