package EncapsulationPracticeCode;

public class EncapsulationPractice2 {
	
	
	public static void main(String[] args){
		
		Employee james = new Employee();
	System.out.println(james);
	james.setName("James Smith");
	System.out.println("James name is ===>"+ james);
	james.setAge(40);
	System.out.println("James Age is ====>"+ james);
	james.setCity("Fremont");
	System.out.println("James City is=====>"+ james);
	System.out.println(james);
	
	
	
	
	

}

}