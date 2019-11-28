import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.PrintJob;
import java.text.ParseException;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;


public class ClientReport extends JFrame {
	public ClientReport(Pet animal) throws ParseException {
		setResizable(false);
		this.setPreferredSize(new Dimension(791, 514));
		this.setSize(new Dimension(791, 514));
		JLabel label = new JLabel("Furry Friends Animal Shelter");
		label.setBounds(245, 11, 285, 31);
		label.setFont(new Font("Sylfaen", Font.PLAIN, 23));

		JLabel label_1 = new JLabel("Client Report");
		label_1.setBounds(322, 48, 115, 19);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel name = new JLabel("Animal Name:");
		name.setBounds(296, 78, 82, 19);
		name.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel age = new JLabel("Animal Age:");
		age.setBounds(296, 103, 71, 19);
		age.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel birth = new JLabel("Date of Birth:");
		birth.setBounds(296, 128, 76, 19);
		birth.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel micro = new JLabel("Micro-chipped:");
		micro.setBounds(296, 153, 86, 19);
		micro.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel chipnum = new JLabel("Chip Number:");
		chipnum.setBounds(296, 178, 81, 19);
		chipnum.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel date = new JLabel("New JGoodies label");
		date.setBounds(296, 203, 91, 19);
		date.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel owner = new JLabel("Chip Owner:");
		owner.setBounds(296, 228, 74, 19);
		owner.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel breed = new JLabel("Animal Breed:");
		breed.setBounds(296, 253, 80, 19);
		breed.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel weight = new JLabel("Animal Weight:");
		weight.setBounds(296, 278, 90, 19);
		weight.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel color = new JLabel("Hair Color:");
		color.setBounds(296, 303, 64, 19);
		color.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel type = new JLabel("Hair Type:");
		type.setBounds(296, 328, 62, 19);
		type.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel gender = new JLabel("Animal Sex:");
		gender.setBounds(296, 353, 67, 19);
		gender.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel spay = new JLabel("Spaying Status:");
		spay.setBounds(296, 378, 86, 19);
		spay.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel label_15 = new JLabel("Vaccination:");
		label_15.setBounds(296, 403, 69, 19);
		label_15.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel lblNewLabel = new JLabel(animal.getName());
		lblNewLabel.setBounds(384, 78, 292, 19);
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel age2 = new JLabel("" + animal.getAge());
		age2.setBounds(378, 103, 59, 19);
		age2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel birth2 = new JLabel(animal.getBirth());
		birth2.setBounds(378, 128, 252, 19);
		birth2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel micro2 = new JLabel(animal.getMicro());
		micro2.setBounds(388, 153, 122, 19);
		micro2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel chipnum2 = new JLabel("" + animal.getChipNumber());
		chipnum2.setBounds(383, 178, 82, 19);
		chipnum2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel date2 = new JLabel("New label");
		date2.setBounds(393, 203, 174, 19);
		date2.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		if (((Pet) animal).getMicroBool()) {
			date.setText("Date Contacted:");
			date2.setText(animal.getContacted());
		} else {
			date.setText("Micro-Chipping Date:");
			owner.setVisible(false);
			date2.setText(animal.getChipDate());
		}
		JLabel owner2 = new JLabel(animal.getOwner());
		owner2.setBounds(376, 228, 214, 19);
		owner2.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		owner2.setText(animal.getOwner());
		JLabel breed2 = new JLabel(animal.getBreed());
		breed2.setBounds(382, 253, 233, 19);
		breed2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel weight2 = new JLabel("" + animal.getWeight() + " lbs");
		weight2.setBounds(392, 278, 73, 19);
		weight2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel color2 = new JLabel(animal.getColor());
		color2.setBounds(366, 303, 224, 19);
		color2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel type2 = new JLabel(animal.getHair());
		type2.setBounds(364, 328, 251, 19);
		type2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel gender2 = new JLabel(animal.getGender());
		gender2.setBounds(369, 353, 141, 19);
		gender2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

		JLabel spay2 = new JLabel(animal.getSpayed());
		spay2.setBounds(388, 378, 189, 19);
		spay2.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		if (animal.getMicro().equals("No")) {
			owner.setVisible(false);
			owner2.setVisible(false);
		} else {
			owner2.setText(animal.getOwner());
		}

		JLabel lblIDoNot = new JLabel(animal.getVaccines());
		lblIDoNot.setBounds(371, 403, 346, 19);
		lblIDoNot.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		getContentPane().setLayout(null);

		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPrint.setVisible(false); //this is because the button does not belong in the print out.
				Print();
				btnPrint.setVisible(true);
			}
		});
		btnPrint.setBounds(676, 11, 82, 23);
		getContentPane().add(btnPrint);
		getContentPane().add(label);
		getContentPane().add(label_1);
		getContentPane().add(name);
		getContentPane().add(lblNewLabel);
		getContentPane().add(micro);
		getContentPane().add(micro2);
		getContentPane().add(chipnum);
		getContentPane().add(chipnum2);
		getContentPane().add(date);
		getContentPane().add(date2);
		getContentPane().add(owner);
		getContentPane().add(owner2);
		getContentPane().add(breed);
		getContentPane().add(breed2);
		getContentPane().add(weight);
		getContentPane().add(weight2);
		getContentPane().add(color);
		getContentPane().add(color2);
		getContentPane().add(type);
		getContentPane().add(type2);
		getContentPane().add(gender);
		getContentPane().add(gender2);
		getContentPane().add(spay);
		getContentPane().add(spay2);
		getContentPane().add(label_15);
		getContentPane().add(lblIDoNot);
		getContentPane().add(birth);
		getContentPane().add(age);
		getContentPane().add(birth2);
		getContentPane().add(age2);
	}

	/*	private void Print() {
			JOptionPane.showMessageDialog(this,"In order to have an appropiate print out of the report, set your printer layout to \"landscape\".","Printer Warning", JOptionPane.WARNING_MESSAGE);
			PrintJob pj = getContentPane().getToolkit().getPrintJob(this, null, null); //this = This JFrame (class)
			PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
			attributes.add(OrientationRequested.LANDSCAPE);
			Graphics g = pj.getGraphics(); //gets contents of the jframe/pane
			getContentPane().print(g);//opens print dialog to print, and after "ok" is hit then it is disposed, along with the graphic of the jframe/pane.
			g.dispose();
			pj.end();
		}
		*/
	public void Print() {
		PrinterJob pj = PrinterJob.getPrinterJob();
		pj.setPrintable(new Printable() {
			public int print(Graphics g, PageFormat pf, int pageCount) {
				if (pageCount > 0)
					return Printable.NO_SUCH_PAGE;
				Graphics2D g2 = (Graphics2D) g;
				g2.translate(pf.getImageableX(), pf.getImageableY());
				getContentPane().paintAll(g2);
				return Printable.PAGE_EXISTS;
			}
		});
		if (!pj.printDialog())
			return;
		try {
			PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
			attributes.add(OrientationRequested.LANDSCAPE); //report has to be landscape
			pj.print(attributes);
		} catch (PrinterException xcp) {
			JOptionPane.showMessageDialog(this, "An error has occured with the print request: " + xcp.getCause().toString(), "Printing Error", JOptionPane.ERROR_MESSAGE);
		}
	}


}
