import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class Pet implements Serializable {
	private boolean hair;
	private String name;
	private int age;
	private String birth;
	private String arrive;
	private int chip;
	private int cage;
	private boolean q;
	private boolean gender;
	private String type;
	private int weight;
	private String appearance;
	private String contacted;
	private boolean fleatest;
	private String chipped;
	private ArrayList<String> vaccinations = new ArrayList();
	private String rparty;
	private boolean rabies;
	private boolean spayed;
	private String FleaDate;
	private String breed;
	private String owner;
	private String color;
	private boolean micro;
	private ArrayList<Expense> expenses = new ArrayList();
	private String spaying;
	private int casenumber;

	public void setMicro(boolean t) {
		micro = t;

	}

	public String getMicro() {
		if (micro = true)
			return "Yes";
		else
			return "No";
	}

	public int getVaccineCount() {
		return vaccinations.size();
	}

	public void addExpense(String name, double cost) {
		expenses.add(new Expense(name, cost));
		expenses.get(0).setAnimalName(getName());
	}

	public boolean getFleaBool() {
		return getFleatest();
	}

	public boolean getMicroBool() {
		return micro;
	}

	public String getAnimalType() {
		String a = "Not set"; //FIX THIS
		return a;
	}

	public boolean getSpayedBool() {
		return spayed;
	}

	public void setCaseNumber(int casen) {
		casenumber = casen;
	}

	public int getCaseNumber() {
		return casenumber;
	}

	public void setName(String name2) {
		name = name2;
	}

	public double getTotalExpenses() {
		double total = 0;
		for (int i = 0; i < expenses.size(); i++)
			total += expenses.get(i).getCost();
		return total;
	}

	public String getName() {
		return name;
	}

	public void setRabies(boolean r) {
		this.addVac("Rabies");
		rabies = r;
	}

	public void setHair(boolean h) { //hair type aka true = long and false = short
		hair = h;
	}

	public int getChipNumber() {
		return chip;
	}

	public void setNeuteringDate(String a) {
		spaying = convertDate(a);
	}

	public String getNeuteringDate() {
		return spaying;
	}

	public String getHair() {
		if (hair)
			return "Long";
		else
			return "Short";
	}


	public void setColor(String c) {
		color = c;
	}

	public String getColor() {
		return color;
	}

	public String getGender() {
		if (gender)
			return "Male";
		else
			return "Female";
	}

	public boolean getRabies() {
		return rabies;
	}

	public void setFleaDate(String c) {
		FleaDate = convertDate(c);
	}

	public void setFlea(boolean f) {
		setFleatest(f);
	}

	public String getFlea() {
		if (setFleatest(true))
			return "Yes";
		else
			return "No";


	}

	public void setAge(int age2) {
		age = age2;
	}

	public void setGender(boolean g) {
		gender = g;
	}

	public void setBirth(String b) {
		birth = b;
	}

	public String getVaccines() {
		String returnstring = "";

		for (int i = 0; i < vaccinations.size(); i++) {
			returnstring += vaccinations.get(i);
			if (i != vaccinations.size() - 1)
				returnstring += ", ";

		}

		return returnstring;
	}

	public void setArrival(String a) {
		arrive = a;
	}

	public String getArrival() {
		return arrive;
	}


	public void setChip(int num) {
		chip = num;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String o) {
		owner = o;
	}

	public void setCage(int c) {
		cage = c;
	}

	public int getCage() {
		return cage;
	}

	public void setQuar(boolean qu) {
		q = qu;
	}

	public void setType(String st) {
		st = type;
	}

	public void setWeight(int w) {
		weight = w;
	}

	public void setApp(String a) {
		appearance = a;
	}

	public void addVac(String v) {
		vaccinations.add(v);
	}

	public void chipContacted(String contact) {
		contacted = contact;
	}

	public void setChipDate(String c) {
		chipped = convertDate(c);
	}

	public void setRP(String r) {
		rparty = r;
	}

	public void setSpayed(boolean s) {
		spayed = s;
	}

	public String getContacted() {
		String a = contacted;
		return a;
	}

	public int getWeight() {
		return weight;
	}

	public String getChipDate() {
		String a = chipped;
		return a;
	}

	public ArrayList<Expense> getExpenses() {
		return expenses;
	}

	public String getSpayed() {
		if (spayed)
			return "Spayed";
		else
			return "Not Spayed";
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String bree) {
		breed = bree;
	}

	public String getBirth() {


		return birth;
	}

	public int getAge() throws ParseException {
		Calendar modern = Calendar.getInstance();

		Date mdate = modern.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int modernl = Integer.parseInt(sdf.format(mdate));
		Date date = mdate;
		System.out.println(convertDate(birth));
		if (convertDate(birth) != null)
			date = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(convertDate(birth));
		int year = Integer.parseInt(sdf.format(date));
		int b = modernl - year;
		return b;

	}

	public String convertDate(String theDate) {
		String newDate = "";
		newDate += theDate.substring(3, 6);
		newDate += " ";
		newDate += theDate.substring(0, 2);
		newDate += ", ";

		newDate += theDate.substring(7, 11);
		return newDate;
	}

	public boolean getFleatest() {
		return fleatest;
	}

	public boolean setFleatest(boolean fleatest) {
		this.fleatest = fleatest;
		return fleatest;
	}

	public int getDailyCount() throws ParseException {
		Date date = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(convertDate(getArrival()));
		int days = daysBetween(date, Calendar.getInstance().getTime());
		return days;

	}

	public int daysBetween(Date d1, Date d2) {
		return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
	}

	public int monthCount() throws ParseException {
		Calendar startCalendar = new GregorianCalendar();
		Date date = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(convertDate(getArrival()));
		startCalendar.setTime(date);
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(Calendar.getInstance().getTime());
		int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
		int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
		return diffMonth;
	}


}
