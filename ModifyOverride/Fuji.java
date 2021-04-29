package ModifyOverride;

public class Fuji extends Apple{
	
	private String country;
	private double weight;
	private double yen;
	
	public Fuji(String n, int q, double p, String c, double w, double y) { // constructor with  args
		super(n,q,p);
		this.country = c;
		this.weight = w;
		this.yen = y;
		
		total(q,p,y);
		
	}
	public void total(int q, double p, double y) { // overloading with 3 parameters
		System.out.println(String.format("Total Price of %d Apples     : %.2f yen", q, (q * p * y)));
	}
	
	public String getCountry() { //overloading with no parameter
		return this.country;
	}
	public double calAver(int q) { // overloading with 1 parameter
		return this.weight / q;
	}
	
	public String calAver() { // overloading method without parameter
		return String.format("The Average Weight of Apples: %.2f", (calAver(7)));
	}
	
	public String toString() { // overriding method
		return "=>Granny Smith Apple is orignated in " ;
	}
	
	public void printInfo() { //overriding
		System.out.println(calAver() + " gm");
		System.out.println(toString() + getCountry());
		
	}
	
}
