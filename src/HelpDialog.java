import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;


public class HelpDialog extends JFrame {
	private JTextPane txtpnHjk = new JTextPane();
	private JList list = new JList();

	public HelpDialog() {
		setResizable(false);
		setTitle("Help");
		setSize(556, 421);
		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		list.setModel(new AbstractListModel() {
			String[] values = new String[]{"Case Numbers", "Arrival Information", "Reports"};

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});

		scrollPane.setRowHeaderView(list);


		JTextPane CaseNumber = new JTextPane();
		CaseNumber.setText("How do I use the case number to get a detailed report?\n"
				+ "In order to get information about an animal, you must enter a case number "
				+ "in the textbox and click \"search\". This will bring up a screen with the appropiate"
				+ " information.\n\n"
				+ "How do I add a new animal?\n"
				+ "In order to add a new animal, just click the \"New Arrival\" button.\n\n"
				+ "What if I do not remember an animal's case number?\n"
				+ "Then go to the menu bar and click \"File\" and then \"Animal Case Numbers\".");
		JTextPane ArrivalInfo = new JTextPane();
		ArrivalInfo.setText("What does \"Other Type\" mean?\n If the animal is not a cat or a dog "
				+ "then it would be listed as \"other\", as in \"other than a dog or cat\".\n\n"
				+ "What does \"Date of Arrival\" mean?\n"
				+ "This is the date that the animal arrivated at the shelter.\n\n"
				+ "What does \"Relinquishing Party\" mean?\n"
				+ "The name of the family or individual that brought the animal to the shelter.\n\n"
		);
		JTextPane Reports = new JTextPane();
		Reports.setText("How do I view a \"Client Report\"?\n"
				+ "In order to view a client report, you need to enter the case number and go to the case number report's "
				+ "menu bar and click \"Reports\" and then \"Client Report\".\n\n"
				+ "What is an \"Expense Report\"?\n "
				+ "An expense report shows a list of animals and then their total expenses at the shelter.\n\n"
				+ "What is a \"Cost Report\"?\n"
				+ "A cost report basically goes into detail on each expense the animal has cost the shelter.\n\n"
				+ "What is an \"Inventory Report\"?\n"
				+ "An inventory report shows a list of animals at the shelter and their corresponding cage numbers.");

		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);
		MouseListener mouseListener = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println(list.getSelectedIndex());
				if (list.getSelectedIndex() == 0)
					textPane.setText(CaseNumber.getText());
				if (list.getSelectedIndex() == 1)
					textPane.setText(ArrivalInfo.getText());
				if (list.getSelectedIndex() == 2)
					textPane.setText(Reports.getText());

			}
		};
		list.addMouseListener(mouseListener);
	}

}
