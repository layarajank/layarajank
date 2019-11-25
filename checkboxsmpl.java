package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.*;
public class checkboxsmpl {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkboxsmpl window = new checkboxsmpl();
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
	public checkboxsmpl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(137, 200, 194, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox chckbxC = new JCheckBox("c++");
		chckbxC.setBounds(165, 74, 97, 23);
		frame.getContentPane().add(chckbxC);
		chckbxC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				lblNewLabel.setText("c++ "+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.setBounds(165, 120, 97, 23);
		frame.getContentPane().add(chckbxJava);
		chckbxJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				lblNewLabel.setText("java "+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
	}
}
