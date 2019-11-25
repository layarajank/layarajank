package swing;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JMenu;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ticketbooking {

private JFrame frame;
private JTextField tf1;
private JTable table;
private JTextField tf2;
private JTextField tf3;
private JTextField tf4;
private JTextField tname;
private JTextField tfrom;
private JTextField tto;
private JTextField tdate;
private JTextField ttime;
private JTextField ttktno;
private JTextField tprice;
private JTextField troute;
int tktno=1569;
String str2;
String str1;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
ticketbooking window = new ticketbooking();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public ticketbooking() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 721, 574);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBounds(195, 11, 312, 70);
frame.getContentPane().add(panel);
panel.setLayout(null);

JLabel lblTicketBooking = new JLabel("Ticket Booking");
lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
lblTicketBooking.setBounds(55, 11, 247, 36);
panel.add(lblTicketBooking);

JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(0, 206, 209));
panel_1.setBounds(319, 95, 386, 281);
panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2, true), "Ticket Details", TitledBorder.CENTER, TitledBorder.TOP, null, null));
frame.getContentPane().add(panel_1);
panel_1.setLayout(null);

JLabel lblNewLabel_3 = new JLabel("NAME");
lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
lblNewLabel_3.setBounds(20, 25, 46, 14);
panel_1.add(lblNewLabel_3);

tname = new JTextField();
tname.setBounds(86, 23, 86, 20);
panel_1.add(tname);
tname.setColumns(10);

JLabel lblFrom = new JLabel("From");
lblFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
lblFrom.setBounds(20, 72, 46, 14);
panel_1.add(lblFrom);

JLabel lblTo = new JLabel("To");
lblTo.setFont(new Font("Tahoma", Font.BOLD, 12));
lblTo.setBounds(20, 111, 46, 14);
panel_1.add(lblTo);

JLabel lblDate = new JLabel("Date");
lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
lblDate.setBounds(20, 156, 46, 14);
panel_1.add(lblDate);

JLabel lblTme = new JLabel("Time");
lblTme.setFont(new Font("Tahoma", Font.BOLD, 12));
lblTme.setBounds(20, 196, 46, 14);
panel_1.add(lblTme);

tfrom = new JTextField();
tfrom.setBounds(86, 70, 86, 20);
panel_1.add(tfrom);
tfrom.setColumns(10);

tto = new JTextField();
tto.setBounds(86, 109, 86, 20);
panel_1.add(tto);
tto.setColumns(10);

tdate = new JTextField();
tdate.setBounds(86, 154, 86, 20);
panel_1.add(tdate);
tdate.setColumns(10);

ttime = new JTextField();
ttime.setBounds(86, 194, 86, 20);
panel_1.add(ttime);
ttime.setColumns(10);

JLabel lblNewLabel_4 = new JLabel("Ticket No");
lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
lblNewLabel_4.setBounds(276, 73, 56, 14);
panel_1.add(lblNewLabel_4);

ttktno = new JTextField();
ttktno.setBounds(276, 92, 86, 20);
panel_1.add(ttktno);
ttktno.setColumns(10);

JLabel lblPrice = new JLabel("Price");
lblPrice.setFont(new Font("Tahoma", Font.BOLD, 12));
lblPrice.setBounds(276, 130, 46, 14);
panel_1.add(lblPrice);

tprice = new JTextField();
tprice.setBounds(276, 154, 86, 20);
panel_1.add(tprice);
tprice.setColumns(10);

JLabel lblNewLabel_5 = new JLabel("Route");
lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
lblNewLabel_5.setBounds(286, 183, 46, 14);
panel_1.add(lblNewLabel_5);

troute = new JTextField();
troute.setBounds(276, 208, 86, 20);
panel_1.add(troute);
troute.setColumns(10);
JButton btnConfirm = new JButton("Confirm");
btnConfirm.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		 str2=(String)cb3.getSelectedItem();
		
		String str4;
		if(str1.equals("AC"))
		{
			str4="AC";
		}
		else
		{
			str4="Non AC";
		}
		String[]row= {tf1.getText(),ttktno.getText(),tfrom.getText(),tto.getText(),str2,ttime.getText(),tdate.getText(),str4,tprice.getText()};
		DefaultTableModel a=(DefaultTableModel)table.getModel();
		a.addRow(row);
		
		
		
	}
});
btnConfirm.setBounds(164, 247, 89, 23);
panel_1.add(btnConfirm);

JLabel lblName = new JLabel("Name");
lblName.setBounds(10, 94, 46, 14);
lblName.setFont(new Font("Tahoma", Font.BOLD, 13));
frame.getContentPane().add(lblName);

tf1 = new JTextField();
tf1.setBackground(new Color(250, 235, 215));
tf1.setBounds(83, 92, 86, 20);
frame.getContentPane().add(tf1);
tf1.setColumns(10);

JSeparator separator = new JSeparator();
separator.setBounds(10, 171, 1, 2);
frame.getContentPane().add(separator);

JSeparator separator_1 = new JSeparator();
separator_1.setBounds(21, 171, 160, -5);
frame.getContentPane().add(separator_1);

JSeparator separator_2 = new JSeparator();
separator_2.setForeground(new Color(0, 0, 0));
separator_2.setBackground(new Color(0, 0, 0));
separator_2.setBounds(10, 127, 271, 2);
frame.getContentPane().add(separator_2);


JRadioButton rb1 = new JRadioButton("Standard");
rb1.setBounds(6, 136, 86, 23);
rb1.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(rb1);

JRadioButton rb2 = new JRadioButton("Single Ticket");
rb2.setBounds(94, 136, 107, 23);
rb2.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(rb2);

JRadioButton rb3 = new JRadioButton("Adult");
rb3.setBounds(203, 136, 68, 23);
rb3.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(rb3);

JRadioButton rb4 = new JRadioButton("First Class");
rb4.setBounds(10, 171, 86, 23);
rb4.setFont(new Font("Tahoma", Font.PLAIN, 12));
frame.getContentPane().add(rb4);

JRadioButton rb5 = new JRadioButton("AC");
rb5.setBounds(104, 173, 46, 23);
rb5.setFont(new Font("Tahoma", Font.PLAIN, 12));
frame.getContentPane().add(rb5);

JRadioButton rb6 = new JRadioButton("Sleeper");
rb6.setBounds(152, 171, 68, 23);
rb6.setFont(new Font("Tahoma", Font.PLAIN, 12));
frame.getContentPane().add(rb6);

JRadioButton rb7 = new JRadioButton("Child");
rb7.setBounds(217, 171, 53, 23);
rb7.setFont(new Font("Tahoma", Font.PLAIN, 13));
frame.getContentPane().add(rb7);

ButtonGroup G1=new ButtonGroup();
G1.add(rb1);
G1.add(rb2);
G1.add(rb3);
G1.add(rb7);

ButtonGroup G2=new ButtonGroup();
G2.add(rb4);
G2.add(rb5);
G2.add(rb6);

JPanel panel_2 = new JPanel();
panel_2.setBackground(new Color(106, 90, 205));
panel_2.setBounds(10, 430, 685, 95);
frame.getContentPane().add(panel_2);
panel_2.setLayout(null);

table = new JTable();
table.setModel(new DefaultTableModel(
new Object[][] {
{"Name", "BookinNumber", "From", "To ", "No.of seats", "Time", "Date", "AC/NonAC", "Price"},
},
new String[] {
"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
}
));
table.setBounds(0, 11, 685, 73);
panel_2.add(table);

JSeparator separator_3 = new JSeparator();
separator_3.setForeground(new Color(0, 0, 0));
separator_3.setBackground(new Color(0, 0, 0));
separator_3.setBounds(10, 232, 262, 8);
frame.getContentPane().add(separator_3);

JLabel lblNewLabel = new JLabel("Tax");
lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel.setBounds(10, 281, 46, 14);
frame.getContentPane().add(lblNewLabel);

tf2 = new JTextField();
tf2.setEditable(false);
tf2.setBounds(115, 279, 86, 20);
frame.getContentPane().add(tf2);
tf2.setColumns(10);

JLabel lblNewLabel_1 = new JLabel("Subtotal");
lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_1.setBounds(10, 321, 61, 20);
frame.getContentPane().add(lblNewLabel_1);

JLabel lblNewLabel_2 = new JLabel("Total");
lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
lblNewLabel_2.setBounds(10, 359, 46, 14);
frame.getContentPane().add(lblNewLabel_2);

tf3 = new JTextField();
tf3.setEditable(false);
tf3.setBounds(115, 322, 86, 20);
frame.getContentPane().add(tf3);
tf3.setColumns(10);

tf4 = new JTextField();
tf4.setEditable(false);
tf4.setBounds(115, 353, 86, 20);
frame.getContentPane().add(tf4);
tf4.setColumns(10);

JComboBox cb1 = new JComboBox();
cb1.setModel(new DefaultComboBoxModel(new String[] {"From", "TVM", "EKM", "KZD"}));
cb1.setBounds(10, 201, 71, 20);
frame.getContentPane().add(cb1);

JComboBox cb2 = new JComboBox();
cb2.setModel(new DefaultComboBoxModel(new String[] {"To", "TVM", "EKM", "KZD"}));
cb2.setBounds(94, 203, 75, 20);
frame.getContentPane().add(cb2);

JComboBox cb3 = new JComboBox();
cb3.setModel(new DefaultComboBoxModel(new String[] {"Seats", "1", "2", "3"}));
cb3.setBounds(203, 201, 68, 20);
frame.getContentPane().add(cb3);

JButton btnTotal = new JButton("Total");
btnTotal.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		LocalDate localDate = LocalDate.now();
		tdate.setText(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));


		
		float tax=0;
		float price=0;
		String time="";
		String fr=(String) cb1.getSelectedItem();
		String to=(String) cb2.getSelectedItem();
		if((fr.equals("KZD"))&&(to.equals("TVM")))
				{
			    price=250;
			    time="13.30";
			    
				}
		if((fr.equals("KZD"))&&(to.equals("EKM")))
		{
	    price=150;
	    time="15.20";
		}
		
		if(rb4.isSelected())
		{
			  str1="Firstclass";
			  price=price+((30*price)/100);
			  tax=(price*20)/100;
			  
			
		}
		if(rb5.isSelected())
		{
			 str1="AC";
			 price=price+((40*price)/100);
			 tax=(price*30)/100;
			 
			
		}
		if(rb6.isSelected())
		{
			str1="Sleeper";
			 price=price+((20*price)/100);
			 tax=(price*10)/100;
			 
			
		}
		tktno++;
		String tkt=String.valueOf(tktno);
		String str2=(String)cb3.getSelectedItem();
		float seat=Float.parseFloat(str2);
		float subtotal=(seat*price);
		float ttax=seat*tax;
		float total=subtotal+ttax;
		String subt=String.valueOf(subtotal);
		String tot=String.valueOf(total);
		String totaltax=String.valueOf(ttax);
		tf2.setText(totaltax);
		tf3.setText(subt);
		tf4.setText(tot);
		tname.setText(tf1.getText());
		tfrom.setText((String)cb1.getSelectedItem());
		tto.setText((String)cb2.getSelectedItem());
		tprice.setText(tot);
		troute.setText("Any");
		ttime.setText(time);
		ttktno.setText(tkt);
	}
});
btnTotal.setFont(new Font("Tahoma", Font.BOLD, 12));
btnTotal.setBounds(6, 396, 89, 23);
frame.getContentPane().add(btnTotal);

JButton btnReset = new JButton("Reset");
btnReset.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	tf1.setText("");
	tf2.setText("");
	tf3.setText("");
	tf4.setText("");
	tname.setText("");
	tfrom.setText("");
	tto.setText("");
	troute.setText("");
	tdate.setText("");
	ttime.setText("");
	ttktno.setText("");
	tprice.setText("");
	cb1.setSelectedIndex(0);
	cb2.setSelectedIndex(0);
	cb3.setSelectedIndex(0);
	G1.clearSelection();
	G2.clearSelection();
	

}
});
btnReset.setFont(new Font("Tahoma", Font.BOLD, 13));
btnReset.setBounds(115, 396, 89, 23);
frame.getContentPane().add(btnReset);

JButton btnNewButton = new JButton("Exit");
btnNewButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
System.exit(0);
}
});
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
btnNewButton.setBounds(213, 396, 89, 23);
frame.getContentPane().add(btnNewButton);

JSeparator separator_4 = new JSeparator();
separator_4.setForeground(new Color(0, 0, 0));
separator_4.setBounds(298, 123, 1, 234);
frame.getContentPane().add(separator_4);

JSeparator separator_5 = new JSeparator();
separator_5.setForeground(new Color(0, 0, 0));
separator_5.setBackground(new Color(0, 0, 0));
separator_5.setBounds(298, 123, -16, 238);
frame.getContentPane().add(separator_5);

JSeparator separator_6 = new JSeparator();
separator_6.setBackground(new Color(0, 0, 0));
separator_6.setForeground(new Color(0, 0, 0));
separator_6.setBounds(10, 384, 271, 2);
frame.getContentPane().add(separator_6);

JSeparator separator_7 = new JSeparator();
separator_7.setOrientation(SwingConstants.VERTICAL);
separator_7.setForeground(new Color(0, 0, 0));
separator_7.setBackground(new Color(0, 0, 0));
separator_7.setBounds(277, 123, 11, 262);
frame.getContentPane().add(separator_7);
}
}

