package ModifyOverride;

public class Apple extends Fruit{
	private double price;
	private int quantity;
	
	public Apple(String name, int q, double p) { // constructor with 3 args
		super(name,p);
		this.quantity = q;
		
		total(q,p); //overloading
		
	}
	
	public void total(int q, double p) {  // overloading with 2 parameters
		System.out.println(String.format("Total Price of %d Apples     : RM %.2f", q ,(q * p)));
	}
	public int total(int q) { // overloading with 1 parameter
		return q ;
	}
	
	public String toString() { // overriding method
		return "Total apples sold           : ";
	}
	
	public void printInfo() { //overriding method
	 System.out.println(toString() + total(10));
	 
	}
}


