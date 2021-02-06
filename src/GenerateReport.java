
public class GenerateReport {
	
	private static double seatATotal;
	private static double seatBTotal;
	private static double seatCTotal;
	
	
	public static String generateReport() {
		String output = "";
		String line1 = "";
		String line2 = "";
		String line3 = "";
		String line4 = "";
		String line5 = "";
		String line6 = "";
		//System.out.println(output);
		
		String format = "%1$-1s %2$-12s $%3$-6.2f $%4$-1.2f";
		
		calculate();
		line1 = String.format("%19s %5s %7s", "Tickets Sold", "Price", "Total");
		line2 = String.format("%19s %5s %7s", "------------", "-----", "-----");
		line3 = String.format(format, "Seat A", Seat.getSeatACount(), Seat.getSeatACost(), seatATotal);
		line4 = String.format(format, "Seat B", Seat.getSeatBCount(), Seat.getSeatBCost(), seatBTotal);
		line5 = String.format(format, "Seat C", Seat.getSeatCCount(), Seat.getSeatCCost(), seatCTotal);
		line6 = String.format("%s $ %-1.2f", "Total Sales:", seatATotal+seatBTotal+seatCTotal);
		
		
		
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
