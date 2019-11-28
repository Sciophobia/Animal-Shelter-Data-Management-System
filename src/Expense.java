import java.io.Serializable;


public class Expense implements Serializable {
	private String name = "";
	private double cost = 0;
	private String AnimalName = "";

	public Expense(String n, double c) {
		name = n;
		cost = c;

	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public void setAnimalName(String n) {
		AnimalName = n;
	}

	public String getAnimalName() {
		return AnimalName;
	}
}
