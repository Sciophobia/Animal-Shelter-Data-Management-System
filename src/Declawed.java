import java.io.Serializable;

public class Declawed implements Serializable {
	private boolean declawed;
	private int number;

	public Declawed(boolean d, int n) {
		declawed = d;
		number = n;
	}

	public Declawed(boolean n) {
		declawed = n;
	}

	public String getDeclaw() {
		if (declawed == true)
			return "Yes";
		else
			return "No";
	}

	public int getCount() {
		return number;
	}

}
 