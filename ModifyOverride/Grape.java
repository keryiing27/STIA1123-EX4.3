package ModifyOverride;

public class Grape extends Fruit{
	
	private double price, weight, sgDollar;
	private String vitamin;
	
	public Grape(String n, double p, double w, String v, double sg) { // constructor with many args
		super(n,p);
		this.weight = w;
		this.vitamin = v;
		this.sgDollar = sg;
		
		total(p,w,sg);
	}
	
	public void total(double p, double w, double sg) { // overloading with 2 parameters
		System.out.println(String.format("Total Price of Grapes       : $ %.2f" , (p * w * sg)));
	}
	
	public String printV() { //overriding
		return vitamin;
	}
	
	public String toString() { //overriding method
		return "=>Grape is a good source of ";
	}
	
	public void printInfo() { //overriding
		System.out.println(toString() + printV());
	}
	
}
