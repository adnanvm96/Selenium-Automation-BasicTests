package constructorPractice;

public class ConstructorDemo {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setmake("BMW");
		System.out.println(v1.getmake());
		System.out.println(v1.speed);
		System.out.println(v1.gear);
		System.out.println("*******************");
		
		Vehicle v2 = new Vehicle(100,4);
		v2.setmake("Benz");
		System.out.println(v2.getmake());
	
		System.out.println(v2.speed);
		System.out.println(v2.gear);
		System.out.println("*******************");
		
		
		
		
		
		
		
	}

}
