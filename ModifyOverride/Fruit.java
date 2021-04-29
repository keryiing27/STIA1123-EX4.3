package ModifyOverride;

public class Fruit {
	private String name;
	private double price;
	
	public Fruit(String name, double p) {
		this.name = name;
		this.price = p;
		System.out.println(name + " constructor is invoked");
	}
	
	public String total(double p) { //overloading with 1 parameter
		return String.format("Total Price: RM %.2f", p);		
	}
	
}	
