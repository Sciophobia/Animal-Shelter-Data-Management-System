import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.CardLayout;

import javax.swing.JPanel;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class CaseNumberInfo extends JFrame {
	public CaseNumberInfo(Object animal) throws ParseException {
		setResizable(false);
		this.setPreferredSize(new Dimension(791, 514));
		this.setSize(new Dimension(791, 514));

		getContentPane().setLayout(new CardLayout(0, 0));

		JPanel Dog = new JPanel();
		getContentPane().add(Dog, "dog");
		if (((Pet) animal).getAnimalType().equals("Dog")) {
			CardLayout cl = (CardLayout) (getContentPane().getLayout());
			cl.show(getContentPane(), "dog");
			JLabel label = new JLabel("Furry Friends Animal Shelter");
			label.setBounds(260, 11, 285, 31);
			label.setFont(new Font("Sylfaen", Font.PLAIN, 23));

			JLabel label_1 = new JLabel("Animal Name:");
			label_1.setBounds(22, 48, 82, 19);
			label_1.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_2 = new JLabel(((Pet) animal).getName());
			label_2.setBounds(110, 48, 61, 19);
			label_2.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_3 = new JLabel("Micro-chipped:");
			label_3.setBounds(22, 123, 86, 19);
			label_3.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_4 = new JLabel(((Pet) animal).getMicro());
			label_4.setBounds(114, 123, 97, 19);
			label_4.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_5 = new JLabel("Chip Number:");
			label_5.setBounds(22, 148, 81, 19);
			label_5.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_6 = new JLabel(((Pet) animal).getChipNumber() + "");
			label_6.setBounds(109, 148, 102, 19);
			label_6.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_7 = new JLabel("New JGoodies label");
			label_7.setBounds(22, 173, 263, 19);
			label_7.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			if (!((Pet) animal).getMicroBool())
				label_7.setText("Date of Micro-Chipping: " + ((Pet) animal).getChipDate());
			else
				label_7.setText("Date Contacted: " + ((Pet) animal).getContacted());


			JLabel label_9 = new JLabel("Chip Owner:");
			label_9.setBounds(22, 198, 74, 19);
			label_9.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_10 = new JLabel(((Pet) animal).getOwner());
			label_10.setBounds(102, 198, 61, 19);
			label_10.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_11 = new JLabel("Animal Breed:");
			label_11.setBounds(22, 223, 80, 19);
			label_11.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_12 = new JLabel(((Pet) animal).getBreed());
			label_12.setBounds(108, 223, 458, 19);
			label_12.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_13 = new JLabel("Animal Weight:");
			label_13.setBounds(22, 248, 90, 19);
			label_13.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_14 = new JLabel(((Pet) animal).getWeight() + " lbs");
			label_14.setBounds(118, 248, 448, 19);
			label_14.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_15 = new JLabel("Hair Color:");
			label_15.setBounds(22, 273, 64, 19);
			label_15.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_16 = new JLabel(((Pet) animal).getColor());
			label_16.setBounds(92, 273, 83, 19);
			label_16.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_17 = new JLabel("Hair Type:");
			label_17.setBounds(22, 298, 62, 19);
			label_17.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_18 = new JLabel(((Pet) animal).getHair());
			label_18.setBounds(90, 298, 85, 19);
			label_18.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_19 = new JLabel("Animal Sex:");
			label_19.setBounds(22, 323, 67, 19);
			label_19.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_20 = new JLabel(((Pet) animal).getGender());
			label_20.setBounds(95, 323, 61, 19);
			label_20.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_21 = new JLabel("Spaying Status:");
			label_21.setBounds(22, 348, 86, 19);
			label_21.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_22 = new JLabel(((Pet) animal).getSpayed());
			label_22.setBounds(114, 348, 61, 19);
			label_22.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_23 = new JLabel("Vaccination:");
			label_23.setBounds(22, 373, 69, 19);
			label_23.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_24 = new JLabel(((Pet) animal).getVaccines());
			label_24.setBounds(97, 373, 250, 19);
			label_24.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_25 = new JLabel("Date of Birth:");
			label_25.setBounds(22, 98, 76, 19);
			label_25.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_26 = new JLabel("Animal Age:");
			label_26.setBounds(22, 73, 71, 19);
			label_26.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_27 = new JLabel(((Pet) animal).getBirth());
			label_27.setBounds(104, 98, 99, 19);
			label_27.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_28 = new JLabel(((Pet) animal).getAge() + "");
			label_28.setBounds(104, 73, 7, 19);
			label_28.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblTypeOfAnimal = new JLabel("Type of Animal: Dog");
			lblTypeOfAnimal.setBounds(22, 398, 120, 19);
			lblTypeOfAnimal.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblFleaTest = new JLabel("Flea Test:");
			lblFleaTest.setBounds(221, 48, 56, 19);
			lblFleaTest.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblHeartwormTest = new JLabel("Heartworm Test:");
			lblHeartwormTest.setBounds(221, 73, 99, 19);
			lblHeartwormTest.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblHeartwormTestDate = new JLabel("Heartworm Test Date:");
			lblHeartwormTestDate.setBounds(221, 98, 129, 19);
			lblHeartwormTestDate.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblHeartwormMedicationStart = new JLabel("Heartworm Medication Start Date:");
			lblHeartwormMedicationStart.setBounds(221, 123, 196, 19);
			lblHeartwormMedicationStart.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblHeartwormRetestDate = new JLabel("Heartworm Retest Date:");
			lblHeartwormRetestDate.setBounds(221, 148, 139, 19);
			lblHeartwormRetestDate.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblNull = new JLabel(((Dog) animal).getFlea());
			lblNull.setBounds(283, 48, 283, 19);
			lblNull.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_29 = new JLabel(((Dog) animal).getHeartWorm());
			label_29.setBounds(326, 73, 185, 19);
			label_29.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_30 = new JLabel(((Dog) animal).getHeartWormTestDate());
			label_30.setBounds(356, 98, 147, 19);
			label_30.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_31 = new JLabel(((Dog) animal).getHeartwormMedDate());
			label_31.setBounds(423, 123, 196, 19);
			label_31.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_32 = new JLabel(((Dog) animal).getHeartWormRetestDate());
			label_32.setBounds(366, 148, 233, 19);
			label_32.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			if (!((Dog) animal).getHeartBool()) {
				lblHeartwormMedicationStart.setVisible(false);
				label_31.setVisible(false);
				label_32.setVisible(false);
				lblHeartwormRetestDate.setVisible(false);

			}


			Dog.setLayout(null);
			Dog.add(label);
			Dog.add(label_7);
			Dog.add(label_9);
			Dog.add(label_10);
			Dog.add(label_19);
			Dog.add(label_20);
			Dog.add(lblTypeOfAnimal);
			Dog.add(label_1);
			Dog.add(label_2);
			Dog.add(label_26);
			Dog.add(label_28);
			Dog.add(label_25);
			Dog.add(label_27);
			Dog.add(label_3);
			Dog.add(label_4);
			Dog.add(label_5);
			Dog.add(label_6);
			Dog.add(lblHeartwormRetestDate);
			Dog.add(label_32);
			Dog.add(lblHeartwormTest);
			Dog.add(label_29);
			Dog.add(lblFleaTest);
			Dog.add(lblNull);
			Dog.add(lblHeartwormTestDate);
			Dog.add(label_30);
			Dog.add(lblHeartwormMedicationStart);
			Dog.add(label_31);
			Dog.add(label_15);
			Dog.add(label_16);
			Dog.add(label_17);
			Dog.add(label_18);
			Dog.add(label_21);
			Dog.add(label_22);
			Dog.add(label_13);
			Dog.add(label_14);
			Dog.add(label_11);
			Dog.add(label_12);
			Dog.add(label_23);
			Dog.add(label_24);

			if (((Dog) animal).getHeartBool()) {
				lblHeartwormMedicationStart.setVisible(false);
				lblHeartwormRetestDate.setVisible(false);


			}
		}
		JPanel Cat = new JPanel();
		getContentPane().add(Cat, "cat");

		Panel Other = new Panel();
		getContentPane().add(Other, "other");
		Other.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnReports = new JMenu("Reports");
		menuBar.add(mnReports);

		JMenuItem mntmClientReport = new JMenuItem("Client Report");
		mnReports.add(mntmClientReport);
		mntmClientReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientReport cli;
				try {
					cli = new ClientReport(((Pet) animal));
					cli.setVisible(true);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		});

		JMenuItem mntmCostReport = new JMenuItem("Cost Report");
		mnReports.add(mntmCostReport);
		mntmCostReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CostReport inv = new CostReport(((Pet) animal).getExpenses());
				inv.setVisible(true);

			}
		});
		if (((Pet) animal).getAnimalType().equals("Other")) {
			CardLayout cl = (CardLayout) (getContentPane().getLayout());
			cl.show(getContentPane(), "other");
			JLabel label_70 = new JLabel("Furry Friends Animal Shelter");
			label_70.setFont(new Font("Sylfaen", Font.PLAIN, 23));
			label_70.setBounds(260, 0, 285, 31);
			Other.add(label_70);

			JLabel label_71 = new JLabel("New JGoodies label");
			label_71.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_71.setBounds(22, 162, 231, 19);
			Other.add(label_71);

			if (!((Pet) animal).getMicroBool())
				label_71.setText("Date of Micro-Chipping: " + ((Pet) animal).getChipDate());
			else
				label_71.setText("Date Contacted: " + ((Pet) animal).getContacted());

			JLabel label_73 = new JLabel("Chip Owner:");
			label_73.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_73.setBounds(22, 187, 74, 19);
			Other.add(label_73);

			JLabel label_74 = new JLabel(((Pet) animal).getOwner());
			label_74.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_74.setBounds(102, 187, 61, 19);
			Other.add(label_74);

			JLabel label_75 = new JLabel("Animal Sex:");
			label_75.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_75.setBounds(22, 286, 67, 19);
			Other.add(label_75);

			JLabel label_76 = new JLabel(((Pet) animal).getGender());
			label_76.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_76.setBounds(95, 286, 61, 19);
			Other.add(label_76);

			JLabel label_77 = new JLabel("Type of Animal: " + ((Other) animal).getAnimalType());
			label_77.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_77.setBounds(22, 361, 325, 19);
			Other.add(label_77);

			JLabel label_78 = new JLabel("Animal Name:");
			label_78.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_78.setBounds(22, 37, 82, 19);
			Other.add(label_78);

			JLabel label_79 = new JLabel(((Pet) animal).getName());
			label_79.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_79.setBounds(110, 37, 61, 19);
			Other.add(label_79);

			JLabel label_80 = new JLabel("Animal Age:");
			label_80.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_80.setBounds(22, 62, 71, 19);
			Other.add(label_80);

			JLabel label_81 = new JLabel(((Pet) animal).getAge() + "");
			label_81.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_81.setBounds(104, 62, 7, 19);
			Other.add(label_81);

			JLabel label_82 = new JLabel("Date of Birth:");
			label_82.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_82.setBounds(22, 87, 76, 19);
			Other.add(label_82);

			JLabel label_83 = new JLabel(((Pet) animal).getBirth());
			label_83.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_83.setBounds(104, 87, 99, 19);
			Other.add(label_83);

			JLabel label_84 = new JLabel("Micro-chipped:");
			label_84.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_84.setBounds(22, 112, 86, 19);
			Other.add(label_84);

			JLabel label_85 = new JLabel(((Pet) animal).getMicro());
			label_85.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_85.setBounds(114, 112, 97, 19);
			Other.add(label_85);

			JLabel label_86 = new JLabel("Chip Number:");
			label_86.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_86.setBounds(22, 137, 81, 19);
			Other.add(label_86);

			JLabel label_87 = new JLabel(((Pet) animal).getChipNumber() + "");
			label_87.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_87.setBounds(109, 137, 7, 19);
			Other.add(label_87);

			JLabel label_92 = new JLabel("Flea Test:");
			label_92.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_92.setBounds(221, 37, 56, 19);
			Other.add(label_92);

			JLabel label_93 = new JLabel(((Pet) animal).getFlea());
			label_93.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_93.setBounds(283, 37, 283, 19);
			Other.add(label_93);

			JLabel label_98 = new JLabel("Hair Color:");
			label_98.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_98.setBounds(22, 236, 64, 19);
			Other.add(label_98);

			JLabel label_99 = new JLabel(((Pet) animal).getColor());
			label_99.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_99.setBounds(92, 236, 83, 19);
			Other.add(label_99);

			JLabel label_100 = new JLabel("Hair Type:");
			label_100.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_100.setBounds(22, 261, 62, 19);
			Other.add(label_100);

			JLabel label_101 = new JLabel(((Pet) animal).getHair());
			label_101.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_101.setBounds(90, 261, 85, 19);
			Other.add(label_101);

			JLabel label_102 = new JLabel("Spaying Status:");
			label_102.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_102.setBounds(22, 311, 86, 19);
			Other.add(label_102);

			JLabel label_103 = new JLabel(((Pet) animal).getSpayed());
			label_103.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_103.setBounds(114, 311, 61, 19);
			Other.add(label_103);

			JLabel label_104 = new JLabel("Animal Weight:");
			label_104.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_104.setBounds(22, 211, 90, 19);
			Other.add(label_104);

			JLabel label_105 = new JLabel(((Pet) animal).getWeight() + " lbs");
			label_105.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_105.setBounds(118, 211, 448, 19);
			Other.add(label_105);


			JLabel label_108 = new JLabel("Vaccination:");
			label_108.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_108.setBounds(22, 336, 69, 19);
			Other.add(label_108);

			JLabel label_109 = new JLabel(((Pet) animal).getVaccines());
			label_109.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_109.setBounds(97, 336, 250, 19);
			Other.add(label_109);


			JLabel label_88 = new JLabel("Animal Appearence: ");
			label_88.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			label_88.setBounds(221, 64, 118, 19);
			Other.add(label_88);

			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(263, 89, 238, 202);
			Other.add(scrollPane);

			JTextPane textPane = ((Other) animal).getApp();
			scrollPane.setViewportView(textPane);
		}

		if (((Pet) animal).getAnimalType().equals("Cat")) {
			CardLayout cl = (CardLayout) (getContentPane().getLayout());
			cl.show(getContentPane(), "cat");
			JLabel label_33 = new JLabel("Furry Friends Animal Shelter");
			label_33.setBounds(260, 11, 285, 31);
			label_33.setFont(new Font("Sylfaen", Font.PLAIN, 23));

			JLabel label_34 = new JLabel("New JGoodies label");
			label_34.setBounds(22, 173, 321, 19);
			label_34.setFont(new Font("Sylfaen", Font.PLAIN, 14));


			if (!((Pet) animal).getMicroBool())
				label_34.setText("Date of Micro-Chipping: " + ((Pet) animal).getChipDate());
			else
				label_34.setText("Date Contacted: " + ((Pet) animal).getContacted());

			JLabel label_36 = new JLabel("Chip Owner:");
			label_36.setBounds(22, 198, 74, 19);
			label_36.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_37 = new JLabel(((Pet) animal).getOwner());
			label_37.setBounds(102, 198, 118, 19);
			label_37.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_38 = new JLabel("Animal Breed:");
			label_38.setBounds(22, 223, 80, 19);
			label_38.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_39 = new JLabel(((Pet) animal).getBreed());
			label_39.setBounds(108, 223, 128, 19);
			label_39.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_40 = new JLabel("Animal Weight:");
			label_40.setBounds(22, 248, 90, 19);
			label_40.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_41 = new JLabel(((Pet) animal).getWeight() + " lbs");
			label_41.setBounds(118, 248, 51, 19);
			label_41.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_42 = new JLabel("Hair Color:");
			label_42.setBounds(22, 273, 64, 19);
			label_42.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_43 = new JLabel(((Pet) animal).getColor());
			label_43.setBounds(92, 273, 128, 19);
			label_43.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_44 = new JLabel("Hair Type:");
			label_44.setBounds(22, 298, 62, 19);
			label_44.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_45 = new JLabel(((Pet) animal).getHair());
			label_45.setBounds(90, 298, 199, 19);
			label_45.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_46 = new JLabel("Animal Sex:");
			label_46.setBounds(22, 323, 67, 19);
			label_46.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_47 = new JLabel(((Pet) animal).getGender());
			label_47.setBounds(95, 323, 219, 19);
			label_47.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_48 = new JLabel("Spaying Status:");
			label_48.setBounds(22, 348, 86, 19);
			label_48.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_49 = new JLabel(((Pet) animal).getSpayed());
			label_49.setBounds(114, 348, 137, 19);
			label_49.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_50 = new JLabel("Vaccination:");
			label_50.setBounds(22, 373, 69, 19);
			label_50.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_51 = new JLabel(((Pet) animal).getVaccines());
			label_51.setBounds(97, 373, 292, 19);
			label_51.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblTypeOfAnimal_1 = new JLabel("Type of Animal: Cat");
			lblTypeOfAnimal_1.setBounds(22, 398, 115, 19);
			lblTypeOfAnimal_1.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_53 = new JLabel("Animal Name:");
			label_53.setBounds(22, 48, 82, 19);
			label_53.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_54 = new JLabel(((Pet) animal).getName());
			label_54.setBounds(110, 48, 109, 19);
			label_54.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_55 = new JLabel("Animal Age:");
			label_55.setBounds(22, 73, 71, 19);
			label_55.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_56 = new JLabel(((Pet) animal).getAge() + "");
			label_56.setBounds(104, 73, 7, 19);
			label_56.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_57 = new JLabel("Date of Birth:");
			label_57.setBounds(22, 98, 76, 19);
			label_57.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_58 = new JLabel(((Pet) animal).getBirth());
			label_58.setBounds(104, 98, 116, 19);
			label_58.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_59 = new JLabel("Micro-chipped:");
			label_59.setBounds(22, 123, 86, 19);
			label_59.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_60 = new JLabel(((Pet) animal).getMicro());
			label_60.setBounds(114, 123, 106, 19);
			label_60.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_61 = new JLabel("Chip Number:");
			label_61.setBounds(22, 148, 81, 19);
			label_61.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_62 = new JLabel(((Pet) animal).getChipNumber() + "");
			label_62.setBounds(109, 148, 398, 19);
			label_62.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_63 = new JLabel("Declawed:");
			label_63.setBounds(221, 73, 59, 19);
			label_63.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_64 = new JLabel((((Cat) animal).getDeclawObj().getDeclaw()));
			label_64.setBounds(286, 73, 285, 19);
			label_64.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_65 = new JLabel("Declaw Count:");
			label_65.setBounds(221, 98, 84, 19);
			label_65.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_66 = new JLabel(((Cat) animal).getDeclawObj().getCount() + "");
			label_66.setBounds(311, 98, 185, 19);
			label_66.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_67 = new JLabel("Flea Test:");
			label_67.setBounds(221, 48, 65, 19);
			label_67.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_68 = new JLabel(((Pet) animal).getFlea());
			label_68.setBounds(292, 48, 283, 19);
			label_68.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblFelineLeukemiaTest = new JLabel("Feline Leukemia Test: ");
			lblFelineLeukemiaTest.setBounds(22, 423, 128, 19);
			lblFelineLeukemiaTest.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_52 = new JLabel();
			if (((Cat) animal).getLeukemiaTest())
				label_52.setText("Positive");
			else
				label_52.setText("Negative");
			label_52.setBounds(156, 423, 292, 19);
			label_52.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel lblFelineLeukemiaTest_1 = new JLabel("Feline Leukemia Test Date: ");
			lblFelineLeukemiaTest_1.setBounds(22, 448, 158, 19);
			lblFelineLeukemiaTest_1.setFont(new Font("Sylfaen", Font.PLAIN, 14));

			JLabel label_69 = new JLabel(" " + ((Cat) animal).getLeukemiaTestDate());
			label_69.setBounds(175, 448, 321, 19);
			label_69.setFont(new Font("Sylfaen", Font.PLAIN, 14));
			Cat.setLayout(null);
			Cat.add(label_33);
			Cat.add(lblFelineLeukemiaTest_1);
			Cat.add(label_69);

			Cat.add(label_34);

			Cat.add(label_36);
			Cat.add(label_37);
			Cat.add(label_38);
			Cat.add(label_39);
			Cat.add(label_40);
			Cat.add(label_41);
			Cat.add(label_42);
			Cat.add(label_43);
			Cat.add(label_44);
			Cat.add(label_45);
			Cat.add(label_46);
			Cat.add(label_47);
			Cat.add(label_48);
			Cat.add(label_49);
			Cat.add(label_53);
			Cat.add(label_54);
			Cat.add(label_55);
			Cat.add(label_56);
			Cat.add(label_57);
			Cat.add(label_58);
			Cat.add(label_59);
			Cat.add(label_60);
			Cat.add(label_61);
			Cat.add(label_62);
			Cat.add(label_63);
			Cat.add(label_64);
			Cat.add(label_65);
			Cat.add(label_66);
			Cat.add(label_67);
			Cat.add(label_68);
			Cat.add(lblTypeOfAnimal_1);
			Cat.add(label_50);
			Cat.add(label_51);
			Cat.add(lblFelineLeukemiaTest);
			Cat.add(label_52);
		}
	}
}
