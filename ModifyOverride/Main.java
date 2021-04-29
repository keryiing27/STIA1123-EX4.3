/*
****************************************
Important Points
Two or more methods can have the same name inside the same class if they accept different arguments. This feature is known as method overloading.
Method overloading is achieved by either:
--changing the number of arguments.
--or changing the data type of arguments.
It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters.
*******************************************
*/
package ModifyOverride;

public class Main {

	
	public static void main(String[] args) {

		System.out.println("======ORANGE======");
		Fruit F = new Fruit("Orange", 5.5);
		System.out.println(F.total(5.5));
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======APPLE======");
		Apple A = new Apple("Apple", 5, 2.9);
		A.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======GRAPE======");
		Grape G = new Grape("Grape", 13.9, 1.1, "Vitamin C and Vitamin K", 0.31);
		G.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======KIWI======");
		Kiwi K = new Kiwi("Kiwi", 14.2, "Fiber, Vitamin C & Antioxidants", 3, 5, 0.2);
		K.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		System.out.println("======FUJI APPLE======");
		Fuji Fj = new Fuji("Fuji Apple", 7, 2.6, "Japan", 2.03, 26.53);
		Fj.printInfo();
		System.out.println("------------------------------------------------");
		System.out.println();
		
		

		System.out.println("======GRANNY SMITH APPLE======");
		GrannySmith Gs = new GrannySmith("Granny Smith", 8, 2.4, "Australia", 95, 2, 0.31);
		Gs.printInfo();
		Gs.bakeApplePie();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
	}
	
}
