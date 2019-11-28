import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;

import java.util.ArrayList;

import java.util.Scanner;

public class Dog extends Pet {


	private boolean heartwormtest; // positive or negative
	private String testdate;
	private String heartmed;
	private String retestdate;

	public Dog(String name) {
		this.setName(name);

	}


	public Dog() {
	}

	public String getAnimalType() {
		return "Dog";
	}


	public String getHeartWormTestDate() {
		return testdate;
	}


	public void setHeartWorm(boolean h, String t) {
		heartwormtest = h;
		testdate = convertDate(t);
	}

	public void setHeartDates(String test, String med) {
		heartmed = convertDate(med);
		retestdate = convertDate(test);
	}

	public String getHeartwormMedDate() {
		return heartmed;
	}


	public String getHeartWormRetestDate() {
		return retestdate;
	}

	public void setHeartWormTestDate(String t) {
		testdate = convertDate(t);
	}

	public void setDistemper(boolean d) {
		this.addVac("Distemper");
	}

	public String getHeartWorm() {
		if (heartwormtest)
			return "Positive";
		else
			return "Negative";
	}

	public void setBordetella(boolean b) {
		this.addVac("Bordetella");
	}

	public boolean getHeartBool() {
		return heartwormtest;
	}


	public ArrayList<String> getBreeds() throws FileNotFoundException {
		File breedlist = new File("dogbreeds.txt");
		ArrayList<String> breeds = new ArrayList<String>();
		Scanner bre = new Scanner(breedlist);
		while (bre.hasNextLine()) {
			breeds.add(bre.nextLine());
		}
		return breeds;
	}


}
