package SeleniumPractice;

public class staticAndNonStaticClass {
	
     static int a=10,b=20; //Static Variables
     int c=30,d=40; //Non-Static Variables
     
    	 
    public static void add(){    //Static Method
    	System.out.println("Addition of a+b===>"+ (a+b)); //Here '+' is called as concatenator
    }	 
     public void add2(){
    	 System.out.println("Addition of c+d====>"+ (c+d));
     }    	
    	 
    	public static void main(String[] args ){
    		//Access static class members
    		System.out.println(staticAndNonStaticClass.a); //10
    		staticAndNonStaticClass.add();
    		
    	//Access Non-Static class members
    		//Creating an object syntax is "Classname object = new Classname();"
    		staticAndNonStaticClass obj = new staticAndNonStaticClass();
    		System.out.println(obj.d); //40
    		obj.add2(); //70
    		
    	}
    		
        		
}
    	
     
	
	
	
	