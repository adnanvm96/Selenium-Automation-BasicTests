package constructorPractice;

public class Vehicle {
	private String make;
	int speed;
	int gear;

	public Vehicle() {
		this.speed = 0; //Note** Whenever we use static the we cannot use "this" and "super" keyword
								//and it is always related to the object of the class
		this.gear = 0;
		// This is a constructor without arguments
		System.out.println("This is a constructor without arguments");
	}

	public Vehicle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("This is a constructor with arguments");

	}

	public void setmake(String make) {
		this.make = make; // this refers to the instance of the object
	}

	public String getmake() {
		return make;

	}

}
