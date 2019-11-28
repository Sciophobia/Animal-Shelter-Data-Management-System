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
public class CaseNumberReport extends JFrame {
	private JTable table;

	public CaseNumberReport(ArrayList<Pet> animals) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Animal Case Numbers");
		setResizable(false);
		getContentPane().setLayout(null);
		this.setPreferredSize(new Dimension(840, 548));
		this.setSize(840, 548);
		Object[][] data = new Object[animals.size()][animals.size() + 1];
		for (int i = 0; i < animals.size(); i++) {
			data[i][0] = animals.get(i).getName();
			data[i][1] = animals.get(i).getCaseNumber();
		}
		JLabel label = new JLabel("Furry Friends Animal Shelter");
		label.setFont(new Font("Sylfaen", Font.PLAIN, 23));
		label.setBounds(258, 11, 285, 31);
		getContentPane().add(label);
		JLabel lblInventoryReport = new JLabel("Animal Case Numbers");
		lblInventoryReport.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		lblInventoryReport.setBounds(320, 41, 188, 31);
		getContentPane().add(lblInventoryReport);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 104, 759, 360);
		getContentPane().add(scrollPane);
		String[] columnNames = {"Animal Name", "Animal Case Number"};
		table = new JTable(data, columnNames);
		table.setEnabled(false);
		scrollPane.setViewportView(table);


	}


}