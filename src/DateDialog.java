import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

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


public class DateDialog extends JDialog {
	private JDateChooser cal;

	public DateDialog(String LabelText) {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setResizable(false);
		setSize(new Dimension(306, 148));
		setPreferredSize(new Dimension(306, 119));
		setTitle(LabelText);
		JLabel lblNewLabel = new JLabel(LabelText);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		JDateChooser calendar = new JDateChooser();
		JButton btnNewButton = new JButton("Ok");

		cal = calendar;

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(calendar, GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(132)
								.addComponent(btnOk)
								.addContainerGap(132, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblNewLabel)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(calendar, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnOk)
								.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cal = calendar;
				DateDialog.this.dispose();

			}
		});


	}

	public String getDate() {

		return ((JTextField) cal.getDateEditor().getUiComponent()).getText();
	}
}
