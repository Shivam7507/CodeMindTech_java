package inheritance;

 class Vehical{
	 
	 public Vehical(String str) {
		 System.out.println(str+" Is a vehical");
	 }
	 public void showVehical() {
		 System.out.println("This is a vehical...");
	 }
	
}
 
class Motorcycle extends Vehical{
	public Motorcycle(String str) {
		super(str);
	}
	public void showVehical() {
		 System.out.println("This is a vehical with two wheels");
	 }
}

class Car extends Vehical{
	public Car(String str) {
		super(str);
	}
	public void showVehical() {
		 System.out.println("This is a vehical with four wheels");
	 }
}

public class hierarchical_Inheritance {
	public static void main(String[] args) {
		Motorcycle m = new Motorcycle("Motorcycle");
		m.showVehical();
		
		Car c = new Car("Car");
		c.showVehical();
		
	}

}
