import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Cat extends Pet {
	private Declawed declaw;
	private boolean Leukemia;
	private String LeukemiaTestDate;

	public Cat(String name) {
		this.setName(name);
	}

	public Cat() {
	}

	public String getAnimalType() {
		return "Cat";
	}


	public void setDeclawing(boolean d, int num) {
		declaw = new Declawed(d, num);
	}

	public void setDeclawing(boolean num) {
		declaw = new Declawed(num);
	}

	public void setLeukemia(boolean l) {
		Leukemia = l;

	}

	public void setLeukemiaDate(String ld) {

		LeukemiaTestDate = convertDate(ld);
	}

	public Declawed getDeclawObj() {
		return declaw;
	}

	public Boolean getLeukemiaTest() {
		return Leukemia;
	}

	public String getLeukemiaTestDate() {
		return LeukemiaTestDate;
	}


	public ArrayList<String> getBreeds() throws FileNotFoundException {
		File breedlist = new File("catbreeds.txt");
		ArrayList<String> breeds = new ArrayList<String>();
		Scanner bre = new Scanner(breedlist);
		while (bre.hasNextLine()) {
			breeds.add(bre.nextLine());
		}
		return breeds;
	}

}
