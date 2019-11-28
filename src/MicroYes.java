import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;


public class MicroYes extends JDialog {
	private JDateChooser cal;
	private JTextField chipnum;
	private JTextField textField_1;

	public void Reset() {
		cal.setDate(null);
		chipnum.setText("");
		textField_1.setText("");
	}

	public MicroYes() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(new Dimension(505, 269));
		setPreferredSize(new Dimension(570, 417));

		JLabel lblChipNumber = new JLabel("Chip Number:");
		lblChipNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblOwner = new JLabel("Owner:");
		lblOwner.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblDateContacted = new JLabel("Date Contacted:");
		lblDateContacted.setFont(new Font("Tahoma", Font.PLAIN, 16));

		chipnum = new JTextField();
		chipnum.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setColumns(10);

		JDateChooser Date = new JDateChooser();

		JLabel lblMicrochipping = new JLabel("Micro-chipping");
		lblMicrochipping.setFont(new Font("Tahoma", Font.PLAIN, 27));

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MicroYes.this.dispose();
				cal = Date;
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap(87, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblChipNumber)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(chipnum, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblOwner, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
														.addGroup(groupLayout.createSequentialGroup()
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(lblDateContacted)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(Date, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)))
												.addGap(96))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
												.addComponent(lblMicrochipping)
												.addGap(150))
										.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
												.addComponent(btnOk)
												.addGap(80))))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addContainerGap()
												.addComponent(lblMicrochipping))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(55)
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblChipNumber)
														.addComponent(chipnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblOwner, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
														.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(Date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDateContacted, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnOk)
								.addGap(84))
		);
		getContentPane().setLayout(groupLayout);


	}

	public String getDate() {
		return ((JTextField) cal.getDateEditor().getUiComponent()).getText();
	}

	public int getChipNumber() {
		return Integer.parseInt(chipnum.getText());

	}

	public String getOwnerName() {
		return textField_1.getText();
	}
}
