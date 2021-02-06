
public class GenerateReport {
	
	private static int seatATotal;
	private static int seatBTotal;
	private static int seatCTotal;
	
	
	public static String generateReport() {
		String output = "";
		String line1 = "";
		String line2 = "";
		String line3 = "";
		String line4 = "";
		String line5 = "";
		String line6 = "";
		//System.out.println(output);
		calculate();
		line1 = String.format("%19s %6s %5s", "Tickets Sold", "Price", "Total");
		line2 = String.format("%19s %6s %5s", "------------", "-----", "-----");
		line3 = String.format("%s %-1s %13s %6s", "Seat A", Seat.getSeatACount(), Seat.getSeatACost(), seatATotal);
		line4 = String.format("%s %-1s %13s %6s", "Seat A", Seat.getSeatBCount(), Seat.getSeatBCost(), seatBTotal);
		line5 = String.format("%s %-1s %13s %6s", "Seat A", Seat.getSeatCCount(), Seat.getSeatCCost(), seatCTotal);
		line6 = String.format("%s %-1s", "Total Sales:", seatATotal+seatBTotal+seatCTotal);
		
		
		
		JFrameForm.getTxtOutput().setText(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5 + "\n\n" + line6);
		//output = String.format("%10d", "Tickets Sold");
		System.out.println(output);
		return output;
	}
	
	public static void calculate() {
		seatATotal = Seat.getSeatACount() * Seat.getSeatACost();
		seatBTotal = Seat.getSeatBCount() * Seat.getSeatBCost();
		seatCTotal = Seat.getSeatCCount() * Seat.getSeatCCost();
		//System.out.println("Seat A total: "+ seatATotal + "\nSeat B Total: " + seatBTotal + "\nSeat C Total: " + seatCTotal);
	}
	
	
	
	
}
