package life;

public class LifeBody extends Life {
	String name;
	byte age;
	int hight;
	int wight;
	int idealWight = hight - 100;
	short cal;
	short grownCal = 3000;
	short teenCal = 3200;
	short childCal = 1800;
	public void userWelcoming() { 
		System.out.println(" Welcome " + name);
	}
	public static void genral() { 
		System.out.println("To have a balanced life you need to take care of \n your bodys' health as well as taking care of your mental health.");
	}
	public void age() { 
		System.out.println(name + " ,How old are you ???");
		System.out.println();
	}
	public void hight() {
		System.out.println(name + " ,How tall are you ???");
	}
	public void wight() {
		System.out.println(name + " ,How much do you wight ???");
	}
	public void idealWight() {
		System.out.println(name + " ,Your current wight is " + wight + " ,your ideal wight is suppuse to be " + (hight - 100) + "\n make sure to keep your wight in this range.");
		System.out.println(hight - 100 + 5);
		System.out.println(hight - 100 - 5);
	}
	public void cal() {
		System.out.println("How many cals do you consume daily ???");
	}
	public void growncal() {
		System.out.println("As an adult you shold consume daily 1600 - 3000 cals \n So Make sure you keep it at this Range.");
	}
	public void grownOvercal() {
		System.out.println("You are consumig too mutch Cals.");
	}
	public void growUnderncal() {
		System.out.println("You are consumig too little Cals.");
	}
	public void teencal() {
		System.out.println("As an teen you shold consume daily 1000 - 1800 cals \n So Make sure you keep it at this Range.");
	}
	public void teenOvercal() {
		System.out.println("You are consumig too mutch Cals.");
	}
	public void teeUnderncal() {
		System.out.println("You are consumig too little Cals.");
	}
	public void childcal() {
		System.out.println("As an adult you shold consume daily 1600 - 3000 cals \n So Make sure you keep it at this Range.");
	}
	public void childOvercal() {
		System.out.println("You are consumig too mutch Cals.");
	}
	public void childUndercal() {
		System.out.println("You are consumig too little Cals.");
	}
	public static void helthyTips() { 
		System.out.println("HELTH TIPS:");
		System.out.println("Do sports daily.");
		System.out.println("Make sure your meals contain fruits or vagetables.");
		System.out.println("Drink eough water.");
		System.out.println(""); 
		System.out.println(""); 
	}
	public static void helthyTipsAsthma() { 
		System.out.println("HELTH TIPS:");
		System.out.println("Do sports daily.");
		System.out.println("Quit Smoking.");
		System.out.println("Avoid asthma triggers.");
		System.out.println(""); 
		System.out.println(""); 
	}
	public static void helthyTipsDiabetes() { 
		System.out.println("HELTH TIPS:");
		System.out.println("Do sports daily at least for 30 minutes.");
		System.out.println("Reducing stress.");
		System.out.println("Quit Smoking.");
		System.out.println(""); 
		System.out.println(""); 
	}
	public static void helthyTipsHigh_Blood_Pressure() { 
		System.out.println("HELTH TIPS:");
		System.out.println("Do sports daily.");
		System.out.println("Make sure your meals contain fruits or vagetables.");
		System.out.println("Reducing the usage of salt.");
		System.out.println("Quit Smoking.");
		System.out.println(""); 
		System.out.println(""); 
	}
	
	public static void foodTips() {
		System.out.println("FOOD TIPS:");
		System.out.println("Quit consuming fuzzy drinks.");
		System.out.println("Eat fish more.");
		System.out.println("Eat fast food less.");

	}
	

}
