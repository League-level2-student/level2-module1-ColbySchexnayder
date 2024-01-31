package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	ArrayList<String> guests = new ArrayList<String>();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewName = new JButton("View Name");
	
	public GuestBook() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addName.addActionListener(this);
		viewName.addActionListener(this);
		panel.add(addName);
		panel.add(viewName);
		
		frame.add(panel);
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addName) {
			String name = JOptionPane.showInputDialog("Enter a name:");
			guests.add(name);
		}
		else if (e.getSource() == viewName) {
			String names = "";
			
			for (int i = 0; i < guests.size(); i++) {
				names += "Guest #" + (i+1) + ": " + guests.get(i) + "\n";
			}
			
			JOptionPane.showMessageDialog(null, names);
		}
	}
}









