package ModifyOverride;

public class GrannySmith extends Apple{
	
	private String country;
	private int calories, amount;
	private double ausDollar;
	
	public GrannySmith(String n, int q, double p, String c, int cal, int a, double aus) {
		// constructor with many args
		super(n,q,p);
		this.country = c;
		this.calories = cal;
		this.amount = a;
		this.ausDollar = aus;
		
		total(q,p,aus);
	}

	public void total(int q, double p, double aus) { // overloading with 3 parameters
		System.out.println(String.format("Total Price of %d Apples     : AU$ %.2f", q, (q * p * aus)));
	}
	
	public String getCountry() { 
		return this.country;
	}
	
	public int calCalories(int cal, int a) { //overloading with 2 parameters
		return this.calories * this.amount;
	}
	
	public String calCalories() { //overloading with no parameter
		return "Total calories              : ";
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public void bakeApplePie() { 
		System.out.println("=>It usually used for baking Apple Pie.");
	}
	
	public String toString() {  //overriding
		return "=>Granny Smith Apple is orignated in " ;
	}
	
	public void printInfo() { //overriding
		System.out.println(calCalories() + calCalories(52, 3));
		System.out.println(toString() + getCountry());
	}
	
}
