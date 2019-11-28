import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.text.MessageFormat;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTable.PrintMode;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

@SuppressWarnings("serial")
public class ExpenseReport extends JFrame {
	private JTable table;

	public ExpenseReport(ArrayList<Pet> animals) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Expense Report");
		setResizable(false);
		getContentPane().setLayout(null);
		this.setPreferredSize(new Dimension(840, 548));
		this.setSize(840, 548);
		Object[][] data = new Object[animals.size()][animals.size() + 1];
		for (int i = 0; i < animals.size(); i++) {
			data[i][0] = animals.get(i).getName();
			data[i][1] = animals.get(i).getTotalExpenses();
		}
		JLabel label = new JLabel("Furry Friends Animal Shelter");
		label.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		label.setBounds(258, 11, 285, 31);
		getContentPane().add(label);
		JLabel lblExpenseReport = new JLabel("Expense Report");
		lblExpenseReport.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblExpenseReport.setBounds(343, 38, 128, 31);
		getContentPane().add(lblExpenseReport);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 104, 759, 360);
		getContentPane().add(scrollPane);
		String[] columnNames = {"Animal Name", "Total Expense ($)"};
		table = new JTable(data, columnNames);
		table.setEnabled(false);
		scrollPane.setViewportView(table);
		JButton btnPrint = new JButton("Print");
		/*
		 *Pre-Condition: When the user hits the "Print" button - declared on line 55 - it will print the JTable along with the name of the shelter.
		 *Post-Condition: The page printed will be fit to the page - as in the table does not extend out of the page due to its size. It will be
		 *a print out of exactly what the user sees on the JTable - the names of the animals in one column, and the expenses in the other.
		 */
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				/*btnPrint.setVisible(false); //this is because the button does not belong in the print out.
				Print();
				btnPrint.setVisible(true);*/

				try {
					JTable.PrintMode mode = JTable.PrintMode.FIT_WIDTH; //this fits the table to the page so it does not extend out of the page.
					MessageFormat header = new MessageFormat("Furry Friends Animal Shelter");
					MessageFormat footer = new MessageFormat("Expense Report");
					table.print(mode, header, footer);
				} catch (PrinterException pe) {
					printError(); //if there was an exception, this method will show a message telling the user the printing request has field.
				}

			}
		});
		btnPrint.setBounds(735, 11, 89, 23);
		getContentPane().add(btnPrint);

	}


	private void printError() {
		JOptionPane.showMessageDialog(this, "Print request failed.", "Printer Warning", JOptionPane.WARNING_MESSAGE);
	}

	private void Print() {
		JOptionPane.showMessageDialog(this, "In order to have an appropiate print out of the report, set your printer layout to \"landscape\".", "Printer Warning", JOptionPane.WARNING_MESSAGE);
		PrintJob pj = getContentPane().getToolkit().getPrintJob(this, null, null); //this = This JFrame (class)
		Graphics g = pj.getGraphics(); //gets contents of the jframe/pane
		getContentPane().print(g);//opens print dialog to print, and after "ok" is hit then it is disposed, along with the graphic of the jframe/pane.
		g.dispose();
		pj.end();
	}
}