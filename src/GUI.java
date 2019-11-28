import javax.swing.JFrame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;

import javax.swing.JRadioButton;

import com.alee.laf.WebLookAndFeel;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;

import java.awt.Panel;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;


public class GUI extends JFrame {
	private JTextField textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8, textField_9, textField_10, textField_11, txtName;
	private ArrayList<Pet> animals;
	private int size;

	public GUI() throws FileNotFoundException, ParseException, UnsupportedLookAndFeelException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GUI.class.getResource("/com/toedter/components/images/icon.png")));
		setResizable(false);
		WebLookAndFeel.install();
		setTitle("Furry Friends Animal Shelter Control Center");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));
		JPanel panel_2 = new JPanel();
		this.setPreferredSize(new Dimension(849, 532));
		this.setSize(849, 532);
		getContentPane().add(panel_2, "initial");
		panel_2.setLayout(new CardLayout(0, 0));
		animals = new ArrayList<Pet>();
		JPanel Case = new JPanel();
		panel_2.add(Case, "Casenumber");
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		JButton btnNewButton = new JButton("View Animal");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setToolTipText("View Case Number Report");
		JButton btnNewButton_1 = new JButton("New Arrival");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setToolTipText("Add Animal to Database");
		JLabel lblCaseNumber = new JLabel("Case Number");
		lblCaseNumber.setToolTipText("Enter Your Case Number and Press \"View Animal\" to Search for Animal Information");
		lblCaseNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				refresh();
				for (int i = 0; i < animals.size(); i++) {
					if (Integer.parseInt(textField.getText()) == animals.get(i).getCaseNumber()) {
						try {
							CaseNumberInfo alpha = new CaseNumberInfo(animals.get(i));
							alpha.setVisible(true);
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						break;
					}

				}

			}
		});

		JLabel lblListOfCase = new JLabel("List of Case Numbers:");
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(GUI.class.getResource("/com/toedter/components/images/furry.gif")));
		GroupLayout gl_Case = new GroupLayout(Case);
		gl_Case.setHorizontalGroup(
				gl_Case.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Case.createSequentialGroup()
								.addGap(1097)
								.addComponent(lblListOfCase))
						.addGroup(gl_Case.createSequentialGroup()
								.addGap(10)
								.addComponent(lblCaseNumber)
								.addGap(6)
								.addGroup(gl_Case.createParallelGroup(Alignment.LEADING)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 264, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_Case.createSequentialGroup()
												.addGap(27)
												.addComponent(btnNewButton_1)
												.addGap(6)
												.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)))
								.addGap(446))
						.addGroup(gl_Case.createSequentialGroup()
								.addGap(161)
								.addComponent(lblNewLabel_1))
		);
		gl_Case.setVerticalGroup(
				gl_Case.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Case.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblNewLabel_1)
								.addGap(41)
								.addComponent(lblListOfCase)
								.addGap(17)
								.addGroup(gl_Case.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_Case.createSequentialGroup()
												.addGap(25)
												.addComponent(lblCaseNumber))
										.addGroup(gl_Case.createSequentialGroup()
												.addGap(26)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(6)
												.addGroup(gl_Case.createParallelGroup(Alignment.LEADING)
														.addComponent(btnNewButton_1)
														.addComponent(btnNewButton))))
								.addGap(144))
		);
		Case.setLayout(gl_Case);


		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				refresh();
				CardLayout cl = (CardLayout) (panel_2.getLayout());
				cl.next(panel_2);
			}
		});


		JPanel Arrival = new JPanel();
		panel_2.add(Arrival, "initial");

		JLabel lblNewLabel = new JLabel("New Arrival");
		lblNewLabel.setBounds(10, 101, 94, 19);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblAnimalName = new JLabel("Animal Name:");
		lblAnimalName.setBounds(10, 131, 94, 19);
		lblAnimalName.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_1 = new JTextField();
		textField_1.setBounds(108, 132, 187, 20);
		textField_1.setColumns(10);

		JLabel lblAnimalType = new JLabel("Animal Type:");
		lblAnimalType.setBounds(10, 159, 94, 19);
		lblAnimalType.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnDog = new JRadioButton("Dog");
		rdbtnDog.setBounds(202, 159, 55, 23);


		JRadioButton rdbtnCat = new JRadioButton("Cat");
		rdbtnCat.setBounds(259, 159, 59, 23);

		JRadioButton rdbtnOtherType = new JRadioButton("Other Type");
		rdbtnOtherType.setBounds(108, 158, 94, 24);

		rdbtnDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				rdbtnCat.setSelected(false);
				rdbtnOtherType.setSelected(false);

			}
		});

		rdbtnCat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				rdbtnDog.setSelected(false);
				rdbtnOtherType.setSelected(false);
			}
		});

		rdbtnOtherType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				rdbtnDog.setSelected(false);

				rdbtnCat.setSelected(false);
			}
		});


		JLabel lblBirthDate = new JLabel("Birth Date:");
		lblBirthDate.setBounds(10, 189, 94, 19);
		lblBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JDateChooser birthdate = new JDateChooser();
		birthdate.setBounds(10, 219, 154, 20);

		JLabel lblDateOfArrival = new JLabel("Date of Arrival:");
		lblDateOfArrival.setBounds(440, 131, 107, 19);
		lblDateOfArrival.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JDateChooser calendar_1 = new JDateChooser();
		calendar_1.setBounds(450, 158, 201, 20);

		JLabel lblStatusOf = new JLabel("Status of Micro-chip:");
		lblStatusOf.setBounds(440, 184, 143, 19);
		lblStatusOf.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnMicrochipped = new JRadioButton("Micro-chipped");
		rdbtnMicrochipped.setBounds(440, 205, 143, 23);
		JRadioButton rdbtnNotMicrochipped = new JRadioButton("Not Micro-chipped (set date for micro-chipping)");
		rdbtnNotMicrochipped.setBounds(440, 228, 293, 23);

		JLabel lblRelinqushingParty = new JLabel("Relinquishing Party:");
		lblRelinqushingParty.setBounds(440, 253, 133, 19);
		lblRelinqushingParty.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_2 = new JTextField();
		textField_2.setBounds(577, 254, 122, 20);
		textField_2.setColumns(10);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(346, 160, 173, 20);
		JLabel lblCageNumber = new JLabel("Cage Number:");
		lblCageNumber.setBounds(440, 280, 106, 19);
		lblCageNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_3 = new JTextField();
		textField_3.setBounds(550, 281, 55, 20);
		textField_3.setColumns(10);
		textField_3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') ||
						(c == KeyEvent.VK_BACK_SPACE) ||
						(c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField_3.setTransferHandler(null);
		JButton btnNewButton_2 = new JButton("Next");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(739, 420, 77, 23);

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField_1.getText().equals("")) {
					showMessage("Animal Name");
					return;
				}
				if (rdbtnDog.getSelectedObjects() != null)
					animals.add(animals.size(), new Dog());
				else if (rdbtnCat.getSelectedObjects() != null)
					animals.add(animals.size(), new Cat());
				else if (rdbtnOtherType.getSelectedObjects() != null)
					animals.add(animals.size(), new Other());
				else {
					showMessage("Animal Type");
					return;
				}
				if (birthdate.getDate() == null) {
					showMessage("Birth Date");
					return;
				}
				Pet Birth = new Pet();
				Birth.setBirth(((JTextField) birthdate.getDateEditor().getUiComponent()).getText());
				try {
					if (Birth.getAge() < 0) {
						showMessageInv("Birth Date");
						return;
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (calendar_1.getDate() == null) {
					showMessage("Date of Arrival");
					return;
				}

				if (rdbtnMicrochipped.getSelectedObjects() != null)
					animals.get(size).setMicro(true);
				else if (rdbtnNotMicrochipped.getSelectedObjects() != null)
					animals.get(size).setMicro(false);
				else {
					showMessage("Status of Micro-chip");
					return;
				}
				if (textField_2.getText().equals("")) {
					showMessage("Relinquishing Party");
					return;
				}
				if (textField_3.getText().equals("")) {
					showMessage("Cage Number");
					return;
				}
				if (rdbtnDog.getSelectedObjects() != null) {
					CardLayout cl = (CardLayout) (panel_2.getLayout());
					cl.show(panel_2, "dog");

				} else if (rdbtnCat.getSelectedObjects() != null) {
					CardLayout cl = (CardLayout) (panel_2.getLayout());
					cl.show(panel_2, "cat");

				} else if (rdbtnOtherType.getSelectedObjects() != null) {
					CardLayout cl = (CardLayout) (panel_2.getLayout());

					cl.show(panel_2, "other");
				} else {
					lblAnimalType.setForeground(Color.RED);
				}


				animals.get(size).setName(textField_1.getText());
				CreateCaseNumber casenum = new CreateCaseNumber(animals.get(size).getName());

				String alpha = ((JTextField) birthdate.getDateEditor().getUiComponent()).getText();
				animals.get(size).setBirth(alpha);
				animals.get(size).setArrival(((JTextField) calendar_1.getDateEditor().getUiComponent()).getText());
				animals.get(size).setRP(textField_2.getText());
				animals.get(size).setCage(Integer.parseInt(textField_3.getText()));
				animals.get(size).setCaseNumber(casenum.getCaseNumber() + animals.get(size).getCage()); //creates and sets a case number


				textField_1.setText("");
				rdbtnOtherType.setSelected(false);
				rdbtnDog.setSelected(false);
				rdbtnCat.setSelected(false);
				birthdate.setDate(null);
				textField_3.setText("");
				textField_2.setText("");
				rdbtnMicrochipped.setSelected(false);
				calendar_1.setDate(null);
				rdbtnNotMicrochipped.setSelected(false);
				if (rdbtnMicrochipped.getSelectedObjects() != null) {
					animals.get(size).setChip(Integer.parseInt(textField_10.getText()));
					animals.get(size).setOwner(textField_11.getText());
					animals.get(size).chipContacted(((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());

				}
				if (rdbtnNotMicrochipped.getSelectedObjects() != null) {
					animals.get(size).addExpense("Micro-chipped", 5);
					animals.get(size).setChip(Integer.parseInt(textField_10.getText()));
					animals.get(size).setChipDate(((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());

				}

			}
		});
		Arrival.setLayout(null);
		Arrival.add(lblNewLabel);
		Arrival.add(lblAnimalName);
		Arrival.add(lblAnimalType);
		Arrival.add(textField_1);
		Arrival.add(rdbtnOtherType);
		Arrival.add(rdbtnDog);
		Arrival.add(rdbtnCat);
		Arrival.add(lblBirthDate);
		Arrival.add(birthdate);
		Arrival.add(lblCageNumber);
		Arrival.add(textField_3);
		Arrival.add(lblRelinqushingParty);
		Arrival.add(textField_2);
		Arrival.add(rdbtnMicrochipped);
		Arrival.add(calendar_1);
		Arrival.add(lblDateOfArrival);
		Arrival.add(lblStatusOf);
		Arrival.add(rdbtnNotMicrochipped);
		Arrival.add(btnNewButton_2);

		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(GUI.class.getResource("/com/toedter/components/images/furry.gif")));
		label.setBounds(152, 11, 547, 55);
		Arrival.add(label);

		JLabel lblMicrochippingInformation = new JLabel("Micro-Chipping Information");
		lblMicrochippingInformation.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblMicrochippingInformation.setBounds(231, 68, 387, 73);
		Arrival.add(lblMicrochippingInformation);

		JLabel lblChipNumber = new JLabel("Chip Number:");
		lblChipNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblChipNumber.setBounds(252, 132, 107, 19);
		Arrival.add(lblChipNumber);

		JLabel lblDateContacted = new JLabel("The Date Contacted:");
		lblDateContacted.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDateContacted.setBounds(204, 159, 143, 19);
		Arrival.add(lblDateContacted);

		textField_10 = new JTextField();
		textField_10.setBounds(346, 133, 154, 20);
		Arrival.add(textField_10);
		textField_10.setColumns(10);


		Arrival.add(dateChooser);

		JLabel lblOwner = new JLabel("Owner:");
		lblOwner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOwner.setBounds(290, 190, 55, 19);
		Arrival.add(lblOwner);

		textField_11 = new JTextField();
		textField_11.setBounds(346, 191, 163, 20);
		Arrival.add(textField_11);
		textField_11.setColumns(10);

		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(366, 228, 89, 23);
		Arrival.add(btnOk);
		textField_11.setVisible(false);
		lblOwner.setVisible(false);
		lblChipNumber.setVisible(false);
		lblDateContacted.setVisible(false);
		btnOk.setVisible(false);
		textField_10.setVisible(false);
		lblMicrochippingInformation.setVisible(false);
		dateChooser.setVisible(false);
		JPanel DogP = new JPanel();
		panel_2.add(DogP, "dog");

		JLabel lblAnimalInformation = new JLabel("Animal Information");
		lblAnimalInformation.setFont(new Font("Arial", Font.PLAIN, 29));

		JLabel lblDog = new JLabel("Dog");
		lblDog.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblBreed = new JLabel("Breed:");
		lblBreed.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JComboBox<String> comboBox = new JComboBox<String>();
		for (int i = 0; i < this.getDogBreeds().size(); i++) {
			comboBox.addItem(getDogBreeds().get(i));

		}

		rdbtnMicrochipped.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				rdbtnNotMicrochipped.setSelected(false);
				lblNewLabel.setVisible(false);
				lblAnimalName.setVisible(false);
				lblAnimalType.setVisible(false);
				textField_1.setVisible(false);
				rdbtnOtherType.setVisible(false);
				rdbtnDog.setVisible(false);
				rdbtnCat.setVisible(false);
				lblBirthDate.setVisible(false);
				birthdate.setVisible(false);
				lblCageNumber.setVisible(false);
				textField_3.setVisible(false);
				lblRelinqushingParty.setVisible(false);
				textField_2.setVisible(false);
				rdbtnMicrochipped.setVisible(false);
				calendar_1.setVisible(false);
				lblDateOfArrival.setVisible(false);
				lblStatusOf.setVisible(false);
				rdbtnNotMicrochipped.setVisible(false);
				btnNewButton_2.setVisible(false);
				lblOwner.setVisible(true);
				textField_11.setVisible(true);
				lblChipNumber.setVisible(true);
				textField_10.setVisible(true);
				lblDateContacted.setVisible(true);
				btnOk.setVisible(true);
				lblDateContacted.setBounds(204, 159, 143, 19);
				lblDateContacted.setText("The Date Contacted:");
				dateChooser.setVisible(true);
				lblMicrochippingInformation.setVisible(true);


			}
		});
		MicroNo micro = new MicroNo();
		;
		rdbtnNotMicrochipped.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				rdbtnMicrochipped.setSelected(false);
				lblNewLabel.setVisible(false);
				lblAnimalName.setVisible(false);
				lblAnimalType.setVisible(false);
				textField_1.setVisible(false);
				rdbtnOtherType.setVisible(false);
				rdbtnDog.setVisible(false);
				rdbtnCat.setVisible(false);
				lblBirthDate.setVisible(false);
				birthdate.setVisible(false);
				lblCageNumber.setVisible(false);
				textField_3.setVisible(false);
				lblRelinqushingParty.setVisible(false);
				textField_2.setVisible(false);
				rdbtnMicrochipped.setVisible(false);
				calendar_1.setVisible(false);
				lblDateOfArrival.setVisible(false);
				lblStatusOf.setVisible(false);
				rdbtnNotMicrochipped.setVisible(false);
				btnNewButton_2.setVisible(false);
				btnOk.setVisible(true);
				lblChipNumber.setVisible(true);
				textField_10.setVisible(true);
				lblDateContacted.setVisible(true);
				lblDateContacted.setText("Date of Micro-Chipping:");
				lblDateContacted.setBounds(192, 159, 154, 19);
				dateChooser.setVisible(true);
				lblMicrochippingInformation.setVisible(true);


			}
		});


		//resetting components
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


				lblNewLabel.setVisible(true);
				lblAnimalName.setVisible(true);
				lblAnimalType.setVisible(true);
				textField_1.setVisible(true);
				rdbtnOtherType.setVisible(true);
				rdbtnDog.setVisible(true);
				rdbtnCat.setVisible(true);
				lblBirthDate.setVisible(true);
				birthdate.setVisible(true);
				lblCageNumber.setVisible(true);
				textField_3.setVisible(true);
				lblRelinqushingParty.setVisible(true);
				textField_2.setVisible(true);
				rdbtnMicrochipped.setVisible(true);
				calendar_1.setVisible(true);
				lblDateOfArrival.setVisible(true);
				lblStatusOf.setVisible(true);
				rdbtnNotMicrochipped.setVisible(true);
				btnNewButton_2.setVisible(true);
				textField_11.setVisible(false);
				lblOwner.setVisible(false);
				lblChipNumber.setVisible(false);
				lblDateContacted.setVisible(false);
				btnOk.setVisible(false);
				textField_10.setVisible(false);
				lblMicrochippingInformation.setVisible(false);
				dateChooser.setVisible(false);

			}
		});
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') ||
						(c == KeyEvent.VK_BACK_SPACE) ||
						(c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField_4.setTransferHandler(null);
		JLabel lblLbs = new JLabel("lbs");
		lblLbs.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblHairColor = new JLabel("Hair Color:");
		lblHairColor.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_5 = new JTextField();
		textField_5.setColumns(10);

		JLabel lblTypeOfHair = new JLabel("Type of Hair:");
		lblTypeOfHair.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnLong = new JRadioButton("Long");

		JRadioButton rdbtnShort = new JRadioButton("Short");
		rdbtnLong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnShort.setSelected(false);

			}
		});
		rdbtnShort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnLong.setSelected(false);

			}
		});

		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnMale = new JRadioButton("Male");

		JRadioButton rdbtnFemale = new JRadioButton("Female");

		rdbtnMale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnFemale.setSelected(false);
				animals.get(size).setGender(true);

			}
		});

		rdbtnFemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMale.setSelected(false);
				animals.get(size).setGender(false);

			}
		});

		JLabel lblNeutered = new JLabel("Neutered:");
		lblNeutered.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnYes = new JRadioButton("Yes");

		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNo.setSelected(false);
				animals.get(size).setSpayed(true);

			}
		});
		DateDialog spay = new DateDialog("Neutering Procedure Scheduling");
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnYes.setSelected(false);
				animals.get(size).setSpayed(false);
				spay.setVisible(true);

			}
		});
		JLabel lblFleaTest = new JLabel("Flea Test:");
		lblFleaTest.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnYes_1 = new JRadioButton("Yes");

		JRadioButton rdbtnNo_1 = new JRadioButton("No");

		JLabel lblHeartwormTest = new JLabel("Heartworm Test:");
		lblHeartwormTest.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnPositive = new JRadioButton("Positive");

		JRadioButton rdbtnNegative = new JRadioButton("Negative");
		DateDialog n = new DateDialog("Heartworm Medication Date");
		DateDialog ee = new DateDialog("Heartworm Retest Date");
		rdbtnPositive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNegative.setSelected(false);
				n.setVisible(true);
				n.setPreferredSize(new Dimension(570, 417));
				ee.setPreferredSize(new Dimension(570, 417));
				ee.setVisible(true);
			}
		});

		rdbtnNegative.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPositive.setSelected(false);
			}
		});

		JLabel lblTestDate = new JLabel("Heartworm Test Date:");
		lblTestDate.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JDateChooser calendar_2 = new JDateChooser();

		JLabel lblVaccinations = new JLabel("Vaccinations:");
		lblVaccinations.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JCheckBox chckbxRabies = new JCheckBox("Rabies");

		JCheckBox chckbxDistemper = new JCheckBox("Distemper");

		JCheckBox chckbxBordetella = new JCheckBox("Bordetella");

		JButton button_2 = new JButton("Next");
		button_2.setBackground(Color.WHITE);


		JLabel lblFleaTestDate = new JLabel("Flea Test Date:");
		lblFleaTestDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFleaTestDate.setVisible(false);
		JDateChooser calendar = new JDateChooser();
		calendar.setVisible(false);
		rdbtnYes_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNo_1.setSelected(false);
				((Dog) animals.get(size)).setFlea(true);
				lblFleaTestDate.setVisible(true);
				calendar.setVisible(true);
				panel_2.repaint();

			}
		});
		rdbtnNo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnYes_1.setSelected(false);
				((Dog) animals.get(size)).setFlea(false);
				lblFleaTestDate.setVisible(false);
				calendar.setVisible(false);

			}
		});

		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_4.getText().equals("")) {
					showMessage("Animal Weight");
					return;
				}
				if (textField_5.getText().equals("")) {
					showMessage("Hair Color");
					return;
				}
				if (!(rdbtnShort.getSelectedObjects() != null) && !(rdbtnLong.getSelectedObjects() != null)) {
					showMessage("Type of Hair");
					return;

				}
				if (!(rdbtnMale.getSelectedObjects() != null) && !(rdbtnFemale.getSelectedObjects() != null)) {
					showMessage("Animal Gender");
					return;

				}


				if (!(rdbtnYes.getSelectedObjects() != null) && !(rdbtnNo.getSelectedObjects() != null)) {
					showMessage("Neutered Status");
					return;

				}

				if (!(rdbtnYes_1.getSelectedObjects() != null) && !(rdbtnNo_1.getSelectedObjects() != null)) {
					showMessage("Flea Test");
					return;

				}
				if (!(rdbtnPositive.getSelectedObjects() != null) && !(rdbtnNegative.getSelectedObjects() != null)) {
					showMessage("Heartworm Test");
					return;

				}
				if (calendar_2.getDate() == null) {
					showMessage("Heartworm Test Date");
					return;
				}
				if ((rdbtnYes_1.getSelectedObjects() != null))
					if (calendar.getDate() == null) {
						showMessage("Flea Test Date");
						return;
					}
				CardLayout cl = (CardLayout) (panel_2.getLayout());
				cl.show(panel_2, "Casenumber");
				if (rdbtnNo.getSelectedObjects() != null) {
					((Dog) animals.get(size)).setNeuteringDate(spay.getDate());
					animals.get(size).addExpense("Neutering", 75);
				}
				if (rdbtnYes_1.getSelectedObjects() != null) {
					((Dog) animals.get(size)).setFleaDate(((JTextField) calendar.getDateEditor().getUiComponent()).getText());
					animals.get(size).addExpense("Flea Treatment", 10);
				}
				((Dog) animals.get(size)).setBreed((String) comboBox.getSelectedItem());
				((Dog) animals.get(size)).setWeight(Integer.parseInt(textField_4.getText()));
				((Dog) animals.get(size)).setColor(textField_5.getText());
				if (rdbtnShort.getSelectedObjects() != null)
					((Dog) animals.get(size)).setHair(false);
				else if (rdbtnLong.getSelectedObjects() != null)
					((Dog) animals.get(size)).setHair(true);
				else lblHairColor.setForeground(Color.RED);
				if (chckbxRabies.getSelectedObjects() != null) {
					((Dog) animals.get(size)).setRabies(true);
					animals.get(size).addExpense("Rabies", 30);
				}
				if (chckbxDistemper.getSelectedObjects() != null) {
					((Dog) animals.get(size)).setDistemper(true);
					animals.get(size).addExpense("Distemper", 15);
				}
				if (chckbxBordetella.getSelectedObjects() != null) {
					((Dog) animals.get(size)).setBordetella(true);
					animals.get(size).addExpense("Bordetella", 15);
				}
				((Dog) animals.get(size)).setHeartWormTestDate(((JTextField) calendar_2.getDateEditor().getUiComponent()).getText());

				if (rdbtnPositive.getSelectedObjects() != null) {
					((Dog) animals.get(size)).setHeartDates(ee.getDate(), n.getDate());
					animals.get(size).addExpense("Heartworm", 10);
				}
				try {
					animals.get(size).addExpense("Daily", animals.get(size).getDailyCount() * 10);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					if (animals.get(size).monthCount() != 0)
						animals.get(size).addExpense("Flea Prevention", animals.get(size).monthCount() * 3);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				//and now to reset everything...
				comboBox.setSelectedIndex(0);
				rdbtnMale.setSelected(false);
				rdbtnFemale.setSelected(false);
				rdbtnLong.setSelected(false);
				rdbtnShort.setSelected(false);
				rdbtnYes.setSelected(false);
				rdbtnNo.setSelected(false);
				rdbtnYes_1.setSelected(false);
				rdbtnPositive.setSelected(false);
				rdbtnNo_1.setSelected(false);
				rdbtnNegative.setSelected(false);
				textField_5.setText("");
				textField_4.setText("");
				chckbxRabies.setSelected(false);
				chckbxDistemper.setSelected(false);
				chckbxBordetella.setSelected(false);
				calendar.setDate(null);
				calendar_2.setDate(null);
			}
		});

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(GUI.class.getResource("/com/toedter/components/images/furry.gif")));
		GroupLayout gl_DogP = new GroupLayout(DogP);
		gl_DogP.setHorizontalGroup(
				gl_DogP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_DogP.createSequentialGroup()
								.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(154)
												.addComponent(label_1))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(303)
												.addComponent(lblAnimalInformation, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addComponent(lblDog, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addComponent(lblBreed, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addGap(4)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
												.addGap(113)
												.addComponent(lblVaccinations, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_DogP.createSequentialGroup()
																.addComponent(lblWeight, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
																.addGap(4)
																.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
																.addGap(4)
																.addComponent(lblLbs, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_DogP.createSequentialGroup()
																.addComponent(lblHairColor, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
																.addGap(4)
																.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_DogP.createSequentialGroup()
																.addComponent(lblTypeOfHair)
																.addComponent(rdbtnLong)
																.addComponent(rdbtnShort)))
												.addGap(223)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addComponent(chckbxRabies)
														.addComponent(chckbxDistemper, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
														.addComponent(chckbxBordetella)))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addComponent(lblGender, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnMale)
												.addComponent(rdbtnFemale)
												.addGap(178)
												.addComponent(lblFleaTestDate))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addComponent(lblNeutered)
												.addGap(5)
												.addComponent(rdbtnYes)
												.addComponent(rdbtnNo)
												.addGap(260)
												.addComponent(calendar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addComponent(lblFleaTest, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
												.addComponent(rdbtnYes_1)
												.addComponent(rdbtnNo_1))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addComponent(lblHeartwormTest, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_DogP.createSequentialGroup()
																.addGap(113)
																.addComponent(rdbtnPositive)))
												.addComponent(rdbtnNegative))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(18)
												.addComponent(lblTestDate, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(calendar_2, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(741)
												.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)))
								.addGap(25))
		);
		gl_DogP.setVerticalGroup(
				gl_DogP.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_DogP.createSequentialGroup()
								.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(11)
												.addComponent(label_1)
												.addGap(1)
												.addComponent(lblAnimalInformation, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
												.addGap(12)
												.addComponent(lblDog)
												.addGap(7)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addComponent(lblBreed)
														.addGroup(gl_DogP.createSequentialGroup()
																.addGap(1)
																.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_DogP.createSequentialGroup()
																.addGap(2)
																.addComponent(lblVaccinations)))
												.addGap(6)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_DogP.createSequentialGroup()
																.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblWeight)
																		.addGroup(gl_DogP.createSequentialGroup()
																				.addGap(1)
																				.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																		.addComponent(lblLbs))
																.addGap(6)
																.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblHairColor)
																		.addGroup(gl_DogP.createSequentialGroup()
																				.addGap(1)
																				.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																.addGap(6)
																.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
																		.addComponent(lblTypeOfHair)
																		.addComponent(rdbtnLong)
																		.addComponent(rdbtnShort)))
														.addGroup(gl_DogP.createSequentialGroup()
																.addGap(19)
																.addComponent(chckbxDistemper)
																.addComponent(chckbxBordetella)))
												.addGap(2)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addComponent(lblGender)
														.addComponent(rdbtnMale)
														.addComponent(rdbtnFemale)
														.addGroup(gl_DogP.createSequentialGroup()
																.addGap(3)
																.addComponent(lblFleaTestDate)))
												.addGap(2)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNeutered)
														.addComponent(rdbtnYes)
														.addComponent(rdbtnNo)
														.addGroup(gl_DogP.createSequentialGroup()
																.addGap(3)
																.addComponent(calendar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
												.addGap(2)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addComponent(lblFleaTest)
														.addComponent(rdbtnYes_1)
														.addComponent(rdbtnNo_1))
												.addGap(2)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addComponent(lblHeartwormTest)
														.addComponent(rdbtnPositive)
														.addComponent(rdbtnNegative))
												.addGap(2)
												.addGroup(gl_DogP.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_DogP.createSequentialGroup()
																.addGap(75)
																.addComponent(button_2))
														.addGroup(gl_DogP.createParallelGroup(Alignment.TRAILING)
																.addComponent(lblTestDate)
																.addComponent(calendar_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_DogP.createSequentialGroup()
												.addGap(171)
												.addComponent(chckbxRabies)))
								.addContainerGap(30, Short.MAX_VALUE))
		);
		DogP.setLayout(gl_DogP);

		JPanel CatP = new JPanel();
		panel_2.add(CatP, "cat");

		JLabel lblCat = new JLabel("Cat");
		lblCat.setBounds(10, 111, 94, 19);
		lblCat.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel label_3 = new JLabel("Breed:");
		label_3.setBounds(10, 136, 43, 19);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(57, 137, 153, 20);
		for (int i = 0; i < getCatBreeds().size(); i++) {
			comboBox_1.addItem(getCatBreeds().get(i));

		}

		JLabel lblWeight_1 = new JLabel("Weight:");
		lblWeight_1.setBounds(10, 163, 56, 19);
		lblWeight_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_6 = new JTextField();
		textField_6.setBounds(70, 164, 50, 20);
		textField_6.setColumns(10);
		textField_6.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!((c >= '0') && (c <= '9') ||
						(c == KeyEvent.VK_BACK_SPACE) ||
						(c == KeyEvent.VK_DELETE))) {
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField_6.setTransferHandler(null);
		JLabel lblLbs_1 = new JLabel("lbs");
		lblLbs_1.setBounds(124, 163, 56, 19);
		lblLbs_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblHairColor_1 = new JLabel("Hair Color:");
		lblHairColor_1.setBounds(10, 190, 67, 19);
		lblHairColor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_7 = new JTextField();
		textField_7.setBounds(81, 191, 129, 20);
		textField_7.setColumns(10);

		JLabel lblTypeOfHair_1 = new JLabel("Type of Hair:");
		lblTypeOfHair_1.setBounds(10, 217, 87, 19);
		lblTypeOfHair_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnLong_1 = new JRadioButton("Long");
		rdbtnLong_1.setBounds(97, 217, 49, 23);
		JRadioButton rdbtnShort_1 = new JRadioButton("Short");
		rdbtnShort_1.setBounds(146, 217, 51, 23);

		rdbtnLong_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setHair(true);
				rdbtnShort_1.setSelected(false);
			}
		});

		rdbtnShort_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setHair(false);
				rdbtnLong_1.setSelected(false);
			}
		});


		JLabel lblGender_1 = new JLabel("Gender:");
		lblGender_1.setBounds(10, 242, 56, 19);
		lblGender_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnMale_1 = new JRadioButton("Male");
		rdbtnMale_1.setBounds(66, 242, 47, 23);

		JRadioButton rdbtnFemale_1 = new JRadioButton("Female");
		rdbtnFemale_1.setBounds(113, 242, 59, 23);

		rdbtnMale_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setGender(true);
				rdbtnFemale_1.setSelected(false);
			}
		});

		rdbtnFemale_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setGender(false);
				rdbtnMale_1.setSelected(false);
			}
		});

		JLabel lblNeutered_1 = new JLabel("Neutered:");
		lblNeutered_1.setBounds(10, 267, 65, 19);
		lblNeutered_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DateDialog spaycat = new DateDialog("Schedule Neutering Procedure");
		JRadioButton rdbtnYes_2 = new JRadioButton("Yes");
		rdbtnYes_2.setBounds(75, 267, 43, 23);

		JRadioButton rdbtnNo_2 = new JRadioButton("No");
		rdbtnNo_2.setBounds(120, 267, 43, 23);

		rdbtnYes_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setSpayed(true);
				rdbtnNo_2.setSelected(false);
			}
		});

		rdbtnNo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setSpayed(false);
				rdbtnYes_2.setSelected(false);
				spaycat.setVisible(true);
			}
		});
		JLabel lblFleaTest_1 = new JLabel("Flea Test:");
		lblFleaTest_1.setBounds(10, 292, 66, 19);
		lblFleaTest_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DateDialog yes = new DateDialog("Flea Test: Date of First Treatment");
		JRadioButton rdbtnYes_3 = new JRadioButton("Yes");
		rdbtnYes_3.setBounds(76, 292, 43, 23);

		JRadioButton rdbtnNo_3 = new JRadioButton("No");
		rdbtnNo_3.setBounds(119, 292, 39, 23);

		rdbtnYes_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setFlea(true);
				rdbtnNo_3.setSelected(false);
				yes.setVisible(true);
			}
		});

		rdbtnNo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((Cat) animals.get(size)).setFlea(false);
				rdbtnYes_3.setSelected(false);
			}
		});

		JLabel lblDeclawed = new JLabel("Declawed:");
		lblDeclawed.setBounds(10, 317, 66, 19);
		lblDeclawed.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnYes_4 = new JRadioButton("Yes");
		rdbtnYes_4.setBounds(76, 317, 43, 23);

		JRadioButton rdbtnNo_4 = new JRadioButton("No");
		rdbtnNo_4.setBounds(119, 317, 39, 23);
		JRadioButton radioButton = new JRadioButton("2");
		radioButton.setBounds(76, 340, 31, 23);
		radioButton.setEnabled(false);

		JRadioButton radioButton_1 = new JRadioButton("4");
		radioButton_1.setBounds(119, 340, 31, 23);
		radioButton_1.setEnabled(false);

		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton_1.setSelected(false);
			}
		});

		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton.setSelected(false);
			}
		});

		rdbtnNo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton.setEnabled(true);
				radioButton_1.setEnabled(true);
				rdbtnYes_4.setSelected(false);
			}
		});

		rdbtnYes_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButton.setEnabled(false);
				radioButton_1.setEnabled(false);
				rdbtnNo_4.setSelected(false);
			}
		});


		JLabel lblFelineLeukemiaTest = new JLabel("Feline Leukemia Test:");
		lblFelineLeukemiaTest.setBounds(10, 365, 205, 19);
		lblFelineLeukemiaTest.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JRadioButton rdbtnPositive_1 = new JRadioButton("Positive");
		rdbtnPositive_1.setBounds(152, 361, 63, 23);

		JRadioButton rdbtnNegative_1 = new JRadioButton("Negative");
		rdbtnNegative_1.setBounds(215, 361, 69, 23);

		rdbtnPositive_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNegative_1.setSelected(false);
				((Cat) animals.get(size)).setLeukemia(true);
			}
		});

		rdbtnNegative_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnPositive_1.setSelected(false);
				((Cat) animals.get(size)).setLeukemia(false);
			}
		});


		JLabel lblDateOfLeukemia = new JLabel("Date of Leukemia Test:");
		lblDateOfLeukemia.setBounds(270, 136, 563, 19);
		lblDateOfLeukemia.setHorizontalAlignment(SwingConstants.LEFT);
		lblDateOfLeukemia.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JDateChooser calendar_3 = new JDateChooser();
		calendar_3.setBounds(310, 163, 91, 20);

		JLabel lblVaccinations_1 = new JLabel("Vaccinations:");
		lblVaccinations_1.setBounds(10, 390, 90, 19);
		lblVaccinations_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JCheckBox chckbxNewCheckBox = new JCheckBox("Rabies");
		chckbxNewCheckBox.setBounds(100, 390, 57, 23);

		JButton button_1 = new JButton("Next");
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(735, 436, 77, 23);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_6.getText().equals("")) {
					showMessage("Animal Weight");
					return;
				}
				if (textField_7.getText().equals("")) {
					showMessage("Hair Color");
					return;
				}
				if (!(rdbtnShort_1.getSelectedObjects() != null) && !(rdbtnLong_1.getSelectedObjects() != null)) {
					showMessage("Type of Hair");
					return;

				}
				if (!(rdbtnMale_1.getSelectedObjects() != null) && !(rdbtnFemale_1.getSelectedObjects() != null)) {
					showMessage("Animal Gender");
					return;

				}
				if (!(rdbtnYes_2.getSelectedObjects() != null) && !(rdbtnNo_2.getSelectedObjects() != null)) {
					showMessage("Animal Neutering");
					return;

				}

				if (!(rdbtnYes_3.getSelectedObjects() != null) && !(rdbtnNo_3.getSelectedObjects() != null)) {
					showMessage("Flea Test");
					return;

				}
				if (!(rdbtnYes_4.getSelectedObjects() != null) && !(rdbtnNo_4.getSelectedObjects() != null)) {
					showMessage("Animal Declawed Status");
					return;

				}
				if (rdbtnNo_4.getSelectedObjects() != null) {
					if (!(radioButton_1.getSelectedObjects() != null) && !(radioButton.getSelectedObjects() != null)) {
						showMessage("Animal Declaw Count");
						return;
					}

				}
				if (!(rdbtnPositive_1.getSelectedObjects() != null) && !(rdbtnNegative_1.getSelectedObjects() != null)) {
					showMessage("Feline Leukemia Test");
					return;

				}

				if (calendar_3.getDate() == null) {
					showMessage("Date of Leukemia Test");
					return;
				}
				((Cat) animals.get(size)).setBreed(comboBox.getSelectedItem().toString());
				((Cat) animals.get(size)).setWeight(Integer.parseInt(textField_6.getText()));
				((Cat) animals.get(size)).setColor(textField_7.getText());
				if (rdbtnYes.getSelectedObjects() != null) {
					((Cat) animals.get(size)).setNeuteringDate(spaycat.getDate());
					((Pet) animals.get(size)).addExpense("Neutering", 75);
				}
				if (rdbtnNo_4.getSelectedObjects() != null) {
					if (radioButton_1.getSelectedObjects() != null)
						((Cat) animals.get(size)).setDeclawing(false, 4);
					else
						((Cat) animals.get(size)).setDeclawing(false, 2);
				} else
					((Cat) animals.get(size)).setDeclawing(false);

				((Cat) animals.get(size)).setLeukemiaDate(((JTextField) calendar_3.getDateEditor().getUiComponent()).getText());
				((Pet) animals.get(size)).addExpense("Feline Leukemia", 15);
				if (chckbxNewCheckBox.getSelectedObjects() != null) {
					((Cat) animals.get(size)).addVac("Rabies");
					((Pet) animals.get(size)).addExpense("Rabies", 30);
				}
				try {
					animals.get(size).addExpense("Daily", animals.get(size).getDailyCount() * 10);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}


				try {
					if (animals.get(size).monthCount() != 0)
						animals.get(size).addExpense("Flea Prevention", animals.get(size).monthCount() * 3);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (rdbtnYes_3.getSelectedObjects() != null)
					((Pet) animals.get(size)).addExpense("Flea Treatment", 10);
				CardLayout cl = (CardLayout) (panel_2.getLayout());
				cl.show(panel_2, "Casenumber");
				//now to reset the cat's components...
				rdbtnYes_4.setSelected(false);
				radioButton.setSelected(false);
				radioButton_1.setSelected(false);
				rdbtnPositive_1.setSelected(false);
				rdbtnNo_4.setSelected(false);
				rdbtnNegative_1.setSelected(false);
				textField_7.setText("");
				comboBox_1.setSelectedIndex(0);
				textField_6.setText("");
				rdbtnLong_1.setSelected(false);
				rdbtnShort_1.setSelected(false);
				rdbtnYes_2.setSelected(false);
				rdbtnNo_2.setSelected(false);
				rdbtnMale_1.setSelected(false);
				rdbtnFemale_1.setSelected(false);
				rdbtnYes_3.setSelected(false);
				rdbtnNo_3.setSelected(false);
				calendar_3.setDate(null);
				chckbxNewCheckBox.setSelected(false);

			}
		});

		JLabel label_5 = new JLabel("Animal Information");
		label_5.setBounds(270, 67, 256, 43);
		label_5.setFont(new Font("Arial", Font.PLAIN, 29));
		CatP.setLayout(null);
		CatP.add(lblFelineLeukemiaTest);
		CatP.add(lblDeclawed);
		CatP.add(rdbtnYes_4);
		CatP.add(radioButton);
		CatP.add(radioButton_1);
		CatP.add(rdbtnPositive_1);
		CatP.add(rdbtnNo_4);
		CatP.add(rdbtnNegative_1);
		CatP.add(lblHairColor_1);
		CatP.add(textField_7);
		CatP.add(label_3);
		CatP.add(comboBox_1);
		CatP.add(lblWeight_1);
		CatP.add(textField_6);
		CatP.add(lblLbs_1);
		CatP.add(lblTypeOfHair_1);
		CatP.add(rdbtnLong_1);
		CatP.add(rdbtnShort_1);
		CatP.add(lblNeutered_1);
		CatP.add(rdbtnYes_2);
		CatP.add(rdbtnNo_2);
		CatP.add(lblGender_1);
		CatP.add(rdbtnMale_1);
		CatP.add(rdbtnFemale_1);
		CatP.add(lblFleaTest_1);
		CatP.add(rdbtnYes_3);
		CatP.add(rdbtnNo_3);
		CatP.add(calendar_3);
		CatP.add(label_5);
		CatP.add(lblDateOfLeukemia);
		CatP.add(lblVaccinations_1);
		CatP.add(chckbxNewCheckBox);
		CatP.add(lblCat);
		CatP.add(button_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(GUI.class.getResource("/com/toedter/components/images/furry.gif")));
		label_2.setBounds(152, 11, 547, 55);
		CatP.add(label_2);

		JPanel Other = new JPanel();
		panel_2.add(Other, "other");

		JLabel lblOther = new JLabel("Other");
		lblOther.setBounds(10, 79, 94, 19);
		lblOther.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblAnimalType_1 = new JLabel("Animal Type:");
		lblAnimalType_1.setBounds(10, 104, 86, 19);
		lblAnimalType_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_8 = new JTextField();
		textField_8.setBounds(100, 105, 184, 20);
		textField_8.setColumns(10);

		JLabel lblWeight_2 = new JLabel("Weight:");
		lblWeight_2.setBounds(10, 131, 50, 19);
		lblWeight_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textField_9 = new JTextField();
		textField_9.setBounds(64, 132, 40, 20);
		textField_9.setColumns(10);

		textField_8.setTransferHandler(null);
		JLabel lblLba = new JLabel("lbs");
		lblLba.setBounds(108, 131, 43, 19);
		lblLba.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblDescriptionOfAnimal = new JLabel("Description of Animal Appearance:");
		lblDescriptionOfAnimal.setBounds(10, 158, 222, 19);
		lblDescriptionOfAnimal.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JCheckBox checkBox = new JCheckBox("Bordetella");
		checkBox.setBounds(412, 177, 207, 23);

		JCheckBox checkBox_1 = new JCheckBox("Distemper");
		checkBox_1.setBounds(412, 154, 227, 23);

		JCheckBox checkBox_2 = new JCheckBox("Rabies");
		checkBox_2.setBounds(412, 131, 133, 23);

		JLabel lblVaccinations_2 = new JLabel("Vaccinations:");
		lblVaccinations_2.setBounds(356, 104, 86, 19);
		lblVaccinations_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JCheckBox chckbxOther = new JCheckBox("Other");
		chckbxOther.setBounds(412, 201, 66, 23);

		txtName = new JTextField();
		txtName.setBounds(480, 202, 47, 20);
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setEnabled(false);
		txtName.setText("Price");
		txtName.setColumns(10);
		chckbxOther.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxOther.getSelectedObjects() != null) {
					txtName.setText("");
					txtName.setEnabled(true);
					((Other) animals.get(size)).setOther(true);
				} else {
					txtName.setEnabled(false);
					txtName.setText("Price");
				}


			}
		});

		JTextPane textPane = new JTextPane();
		textPane.setBounds(20, 183, 212, 188);

		JButton button = new JButton("Next");
		button.setBackground(Color.WHITE);
		button.setBounds(730, 432, 77, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField_8.getText().equals("")) {
					showMessage("Animal Type");
					return;

				}
				if (textField_9.getText().equals("")) {
					showMessage("Animal Weight");
					return;

				}
				if (textPane.getText().equals("")) {
					showMessage("Animal Appearance");
					return;

				}
				((Other) animals.get(size)).setBreed(comboBox.getSelectedItem().toString());
				((Other) animals.get(size)).setType(textField_8.getText());
				((Other) animals.get(size)).setWeight(Integer.parseInt(textField_9.getText()));
				((Other) animals.get(size)).setApp(textPane);
				if (txtName.isEnabled()) {
					if (txtName.getText().equals("")) {
						showMessage("Vaccine Price");
						return;
					}
					((Other) animals.get(size)).setAddPrice(Double.parseDouble(txtName.getText()));
				}
				if (checkBox.getSelectedObjects() != null) {
					((Other) animals.get(size)).setBordetella(true);
					((Pet) animals.get(size)).addExpense("Bordetella", 15);
				}
				if (checkBox_1.getSelectedObjects() != null) {
					((Other) animals.get(size)).setDistemper(true);
					((Pet) animals.get(size)).addExpense("Distemper", 15);
				}
				if (checkBox_2.getSelectedObjects() != null) {
					((Other) animals.get(size)).setRabies(true);
					((Pet) animals.get(size)).addExpense("Rabies", 15);
				}
				CardLayout cl = (CardLayout) (panel_2.getLayout());
				cl.show(panel_2, "client");
				//resetting components
				textField_9.setText("");
				textField_8.setText("");
				textPane.setText("");
				chckbxOther.setSelected(false);
				txtName.setText("");
				checkBox_2.setSelected(false);
				checkBox_1.setSelected(false);
				checkBox.setSelected(false);


			}
		});
		Other.setLayout(null);
		Other.add(lblOther);
		Other.add(lblWeight_2);
		Other.add(textField_9);
		Other.add(lblLba);
		Other.add(lblAnimalType_1);
		Other.add(textField_8);
		Other.add(textPane);
		Other.add(lblDescriptionOfAnimal);
		Other.add(chckbxOther);
		Other.add(txtName);
		Other.add(checkBox_2);
		Other.add(checkBox_1);
		Other.add(checkBox);
		Other.add(lblVaccinations_2);
		Other.add(button);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(GUI.class.getResource("/com/toedter/components/images/furry.gif")));
		label_4.setBounds(154, 11, 547, 55);
		Other.add(label_4);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		JMenuItem mntmSaveAnimals = new JMenuItem("Save Animal Data");
		mntmSaveAnimals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent aa) {
				try {
					JFrame parentFrame = new JFrame();
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setDialogTitle("Specify a file to save");
					int userSelection = fileChooser.showSaveDialog(parentFrame);
					if (userSelection == JFileChooser.APPROVE_OPTION) {
						File fileToSave = fileChooser.getSelectedFile();
						FileOutputStream fileOut = new FileOutputStream(fileToSave.getAbsolutePath()); //where to save animal data.
						ObjectOutputStream out = new ObjectOutputStream(fileOut);
						out.writeObject(animals); //exports an object containing the data from animals
						out.close();
						fileOut.close();
					}
				} catch (IOException i) {
					i.printStackTrace();
				}
			}
		});
		mnFile.add(mntmSaveAnimals);
		JMenuItem mntmOpenAnimalData = new JMenuItem("Open Animal Data");
		mntmOpenAnimalData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame parentFrame = new JFrame();
				JFileChooser fileChooser = new JFileChooser(); //chooses open file
				fileChooser.setDialogTitle("Specify a file to open");
				int userSelection = fileChooser.showOpenDialog(parentFrame);
				if (userSelection == JFileChooser.APPROVE_OPTION) {
					try {
						FileInputStream saveFile = new FileInputStream(fileChooser.getSelectedFile().getAbsoluteFile());
						ObjectInputStream save = new ObjectInputStream(saveFile);
						animals = (ArrayList<Pet>) save.readObject(); //populates arraylist with information from file
						save.close();
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

			}
		});
		mnFile.add(mntmOpenAnimalData);

		JMenuItem mntmAnimalCaseNumbers = new JMenuItem("Animal Case Numbers");
		mnFile.add(mntmAnimalCaseNumbers);
		mntmAnimalCaseNumbers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CaseNumberReport cnr = new CaseNumberReport(animals);
				cnr.setVisible(true);

			}
		});

		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);

		JMenuItem mntmInventoryReport = new JMenuItem("Inventory Report");
		mntmInventoryReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InventoryReport inv = new InventoryReport(animals);
				inv.setVisible(true);

			}
		});

		JMenuItem mntmExpenseReport = new JMenuItem("Expense Report");
		mntmExpenseReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ExpenseReport exp = new ExpenseReport(animals);
				exp.setVisible(true);

			}
		});
		mnReports.add(mntmExpenseReport);
		mnReports.add(mntmInventoryReport);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmHelp = new JMenuItem("Help");
		mnHelp.add(mntmHelp);
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				HelpDialog help = new HelpDialog();
				help.setVisible(true);

			}
		});
		int selectedAnimal = size;


	}


	private void refresh() {
		size = animals.size();
	}

	public ArrayList<String> getDogBreeds() {

		ArrayList<String> breeds = new ArrayList<String>();
		Scanner bre;
		try {
			File breedlist = new File("dogbreeds.txt");//this file contains all of the cat breeds, which will show up in a combobox.
			bre = new Scanner(breedlist);
			while (bre.hasNextLine()) {
				breeds.add(bre.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return breeds;
	}

	//This will display the case numbers currently stored in the Animals Arraylist.
	//If the user forgets the case numbers, this will help them.
	private String getModel() {
		String endresult = "";
		for (int i = 0; i < animals.size(); i++) {
			endresult += animals.get(i).getCaseNumber() + "\n";
			System.out.println(animals.get(i).getCaseNumber() + " " + endresult);
		}

		return endresult;
	}

	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this,
				"No information entered for: " + message + ".",
				"Error",
				JOptionPane.ERROR_MESSAGE);
	}

	public void showMessageInv(String message) {
		JOptionPane.showMessageDialog(this,
				"Invalid information entered for: " + message + ".",
				"Error",
				JOptionPane.ERROR_MESSAGE);
	}

	public ArrayList<String> getCatBreeds() {

		ArrayList<String> breeds = new ArrayList<String>();
		try {
			File breedlist = new File("catbreeds.txt");//this file contains all of the cat breeds, which will show up in a combobox.
			Scanner bre;
			bre = new Scanner(breedlist);
			while (bre.hasNextLine()) {
				breeds.add(bre.nextLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return breeds;
	}
}

