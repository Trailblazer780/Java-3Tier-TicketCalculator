
public class GenerateReport {
	
	private static int seatATotal;
	private static int seatBTotal;
	private static int seatCTotal;
	
	
	public static String generateReport() {
		String output = "" ;
		//System.out.println(output);
		calculate();
		return output;
	}
	
	public static void calculate() {
		seatATotal = Seat.getSeatACount() * Seat.getSeatACost();
		seatBTotal = Seat.getSeatBCount() * Seat.getSeatBCost();
		seatCTotal = Seat.getSeatCCount() * Seat.getSeatCCost();
		
		System.out.println("Seat A total: "+ seatATotal + "\nSeat B Total: " + seatBTotal + "\nSeat C Total: " + seatCTotal);
	}
	
	
	
	
}
