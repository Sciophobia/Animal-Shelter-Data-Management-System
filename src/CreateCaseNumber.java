import java.util.ArrayList;


public class CreateCaseNumber {
	private ArrayList<Character> characters = new ArrayList<Character>();

	public CreateCaseNumber(String name) {
		char[] character = name.toCharArray();
		for (int i = 0; i < character.length; i++) {
			characters.add(character[i]); //I'll use these characters to form a case number
		}
	}

	public int getCaseNumber() {
		String casenumber = "";
		for (int i = 0; i < 2; i++) {
			casenumber += Character.getNumericValue(characters.get(i));//numeric value of name will be the case number
		}
		return Integer.parseInt(casenumber);
	}

}
