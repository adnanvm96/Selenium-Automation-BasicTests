package inheritanceExample;

public class Animal {
	public Animal() {
		
		        System.out.println("A new animal has been created!");
		
		    }
	public void sleep() {
		System.out.println("An animal sleeps...");
	}
	public void eat() {
		
		System.out.println("An animal eats...");
		
	}
	public static void main (String[] args){
		Animal animal = new Animal();
		Bird bird = new Bird();
		Dog dog = new Dog();
		        System.out.println();
		        animal.sleep();
		        animal.eat();
		        bird.sleep();
		        bird.eat();
		        dog.sleep();
		        dog.eat();
		
	}
}
		         
		
		
		

		
		
		
	
	
	
	
		
		     
		
		
		
		
