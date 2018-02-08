package classesPractice;

public class ClassDemo {

	public static void main(String[] args) {
		
		Car bmw = new Car();
		bmw.setMake("BMW");
		System.out.println("Make of BMW is ===>" + bmw.getMake());
		
		Car benz = new Car();
		benz.setMake("C300");
		System.out.println("Make of Benz is ===>" +benz.getMake());
		
		//benz.year = 2020;
		benz.setYear(1820);
		System.out.println(benz.getYear());
		
			
		
		
	}

}
