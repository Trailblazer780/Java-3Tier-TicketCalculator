import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class JFrameForm extends JFrame implements ActionListener{
	 // Sizing the JFramme
	 private final int FRAME_WIDTH = 360;
	 private final int FRAME_HEIGHT = 500;
	 private final int FRAME_X = 150;
	 private final int FRAME_Y = 250;
	 
	 // JButtons
	 private JButton btnReport;
	 private JButton btnReset;	 
	 private static JTextArea txtOutput;
	 
	 private JTextField countA;
	 private JTextField countB;
	 private JTextField countC;
	 private JTextField priceA;
	 private JTextField priceB;
	 private JTextField priceC;
	 private JLabel lblblank;
	 private JLabel lblcount;
	 private JLabel lblprice;
	 private JLabel lblseatA;
	 private JLabel lblseatB;
	 private JLabel lblseatC;


     
	
	 public JFrameForm() {
		 
	        this.setTitle("Concert Ticket Calculator");
	        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
	        this.setLocation(FRAME_X,FRAME_Y);
	        this.setResizable(false);
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        
	        
	        // content Panel that will hold all other JPanels
	        
	        JPanel contentPanel = new JPanel();
	        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
	        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS)); 
	        this.add(contentPanel);
	        
	        
	        // Input Panel
	        JPanel inputPanel = new JPanel();
	        inputPanel.setBorder(BorderFactory.createTitledBorder("Enter Data"));
	        inputPanel.setLayout(new GridLayout(4,3,5,10));
	        lblseatA = new JLabel("Enter for Seat A:");
	        lblseatB = new JLabel("Enter for Seat B:");
	        lblseatC = new JLabel("Enter for Seat C:");
	        lblprice = new JLabel("Price ($)");
	        lblcount = new JLabel("Count");
	        lblblank = new JLabel("");
	        
	        countA = new JTextField();
	        countA.setColumns(5);	        
	        countB = new JTextField();
	        countB.setColumns(5);
	        countC= new JTextField();
	        countC.setColumns(5);
	        priceA = new JTextField();
	        priceA.setColumns(5);
	        priceB = new JTextField();
	        priceB.setColumns(5);
	        priceC = new JTextField();
	        priceC.setColumns(5);
	        
	        inputPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	        inputPanel.add(lblblank);
	        inputPanel.add(lblcount);
	        inputPanel.add(lblprice);
	        inputPanel.add(lblseatA);
	        inputPanel.add(countA);
	        inputPanel.add(priceA);
	        inputPanel.add(lblseatB);
	        inputPanel.add(countB);
	        inputPanel.add(priceB);
	        inputPanel.add(lblseatC);
	        inputPanel.add(countC);
	        inputPanel.add(priceC);

	        
	        contentPanel.add(inputPanel);
	        
	        // Output Panel
	        JPanel outputPanel = new JPanel();
	        outputPanel.setBorder(BorderFactory.createTitledBorder("Report"));
	        setTxtOutput(new JTextArea());
	        getTxtOutput().setColumns(38);
	        getTxtOutput().setRows(10);
	        getTxtOutput().setFont(new Font("Courier", Font.BOLD, 14));
	        getTxtOutput().setLineWrap(true);
	        getTxtOutput().setWrapStyleWord(true);
	        getTxtOutput().setEditable(false);
	        getTxtOutput().setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
	        outputPanel.add(getTxtOutput());
	        contentPanel.add(outputPanel);
	        
	        // Buttons Panel
	        btnReport = new JButton("Create Report");
	        btnReport.addActionListener(this);
	        btnReset = new JButton("Reset");
	        btnReset.addActionListener(this);
	        
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.setBorder(BorderFactory.createEmptyBorder(25, 0, 0, 0));
	        buttonPanel.add(btnReport);
	        buttonPanel.add(btnReset);
	        contentPanel.add(buttonPanel);
	 }
	 
	 
	 public void actionPerformed(ActionEvent event) {
		 if (event.getSource() == btnReport) {
			 // Seat A count 
			 int sCountA = Integer.parseInt(countA.getText());
			 Seat.setSeatACount(sCountA);
			 // Seat B Count
			 int sCountB = Integer.parseInt(countB.getText());
			 Seat.setSeatBCount(sCountB);
			 // Seat C Count 
			 int sCountC = Integer.parseInt(countC.getText());
			 Seat.setSeatCCount(sCountC);
			 // Seat A Cost
			 int sCostA = Integer.parseInt(priceA.getText());
			 Seat.setSeatACost(sCostA);
			 // Seat B Cost
			 int sCostB = Integer.parseInt(priceB.getText());
			 Seat.setSeatBCost(sCostB);
			 int sCostC = Integer.parseInt(priceC.getText());
			 Seat.setSeatCCost(sCostC);
			 GenerateReport.generateReport();
			 
		 }
	 }


	public static JTextArea getTxtOutput() {
		return txtOutput;
	}


	public void setTxtOutput(JTextArea txtOutput) {
		this.txtOutput = txtOutput;
	}
}
