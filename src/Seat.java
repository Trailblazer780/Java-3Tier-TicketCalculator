
public class Seat {
	
	private static int seatACount;
	private int seatACost;
	private static int seatBCount;
	private int seatBCost;
	private static int seatCCount;
	private int seatCCost;
	
	
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

	
	
}
