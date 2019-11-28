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


public class MicroNo extends JDialog {
	private JDateChooser cal;
	private JTextField chipnum;

	public void Reset() {
		cal.setDate(null);
		chipnum.setText("");
	}

	public MicroNo() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(new Dimension(570, 265));
		setPreferredSize(new Dimension(570, 417));

		JLabel lblChipNumber = new JLabel("Chip Number:");
		lblChipNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel lblDateContacted = new JLabel("Date of Micro-Chipping:");
		lblDateContacted.setFont(new Font("Tahoma", Font.PLAIN, 16));

		chipnum = new JTextField();
		chipnum.setColumns(10);

		JDateChooser calendar = new JDateChooser();

		JLabel lblMicrochipping = new JLabel("Micro-chipping");
		lblMicrochipping.setFont(new Font("Tahoma", Font.PLAIN, 27));

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MicroNo.this.dispose();
				cal = calendar;
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap(187, Short.MAX_VALUE)
								.addComponent(lblMicrochipping)
								.addGap(204))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
								.addGap(118)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblDateContacted)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(calendar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
												.addComponent(lblChipNumber)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(chipnum, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)))
								.addContainerGap(129, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap(498, Short.MAX_VALUE)
								.addComponent(btnOk)
								.addGap(21))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblMicrochipping)
								.addGap(41)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblChipNumber)
										.addComponent(chipnum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(32)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(calendar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblDateContacted, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
								.addGap(43)
								.addComponent(btnOk)
								.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);


	}

	public String getDate() {

		return ((JTextField) cal.getDateEditor().getUiComponent()).getText();
	}

	public int getChipNumber() {
		System.out.println(chipnum.getText() + " - " + Integer.parseInt(chipnum.getText()));

		return Integer.parseInt(chipnum.getText());

	}


}
