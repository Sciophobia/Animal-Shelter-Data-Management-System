import javax.swing.JTextPane;

public class Other extends Pet {
	private String type;
	private JTextPane appearance;
	private double ap;
	private boolean bordetella;
	private boolean distemper;
	private boolean other;

	public Other(String name, String T, String A) {
		this.setType(T);
		this.setApp(A);
		this.setName(name);
	}

	public Other() {
	}

	public Other(String name) {
		this.setName(name);
	}

	public String getAnimalType() {
		return "Other";
	}


	public void setApp(JTextPane a) {
		appearance = a;
	}


	public JTextPane getApp() {
		return appearance;
	}

	public void setAddPrice(double a) {
		ap = a;
	}

	public double getAdditionalPrice() {
		return ap;
	}

	public void setDistemper(boolean d) {
		distemper = d;
	}

	public void setBordetella(boolean b) {
		bordetella = b;
	}


	public boolean getOther() {
		return other;
	}

	public void setOther(boolean o) {
		other = o;
	}

}
