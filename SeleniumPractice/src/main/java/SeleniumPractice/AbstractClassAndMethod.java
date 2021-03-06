package SeleniumPractice;
//Abstract class and Abstract Method
//https://www.youtube.com/watch?v=RcIsb9iFKH8 reference link 

public class AbstractClassAndMethod {

	public static void main(String[] args) 
		
	{
		Adnanphone obj = new Raju(); //As this is an object it cannot instantiate the class
		obj.call();  
		obj.cook();
		obj.dance();
		obj.move();
	}
}
		
	abstract class Adnanphone{  //Abstract class
		//Here we calling an method 
		public void call()
		{
			System.out.println("calling.....");  //definition
		}
		public abstract void move();  //These are declarations and called as Abstract methods 
		public abstract void dance(); //These are declarations
		public abstract void cook();  // These are declarations
	}	
	
	abstract class Ahmedphone extends Adnanphone //Abstract class
	{
		public void move()
		{
			System.out.println("Moving...");
		}
		
	}
	class Raju extends Ahmedphone{    //this will be called as concrete class that means we can create an object for this class 
		// but where as for Adnanphone and Ahmedphone we cannot create an object
		public void dance(){
			System.out.println("Dancing..");
		}
		public void cook(){
			System.out.println("Cooking...");
		}
		
	}
	

	

			
	
		


	
	

	
		
	
		
		
	
