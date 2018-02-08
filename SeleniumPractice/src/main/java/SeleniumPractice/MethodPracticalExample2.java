package SeleniumPractice;

//in this example we can observe that once we write a method then we can it any number of times from main method  

public class MethodPracticalExample2 {

	public static void main(String[] args) {
		findgrades("JohnSmith", 70.65); //here if u have 100 students then just type their name and score u will get the grades 
		findgrades("TomSmith", 56.32);
	}
	
	
	public static void findgrades(String studentName, double Score){  //Here we are giving findgrades method and calling from main method 
		String grade;
		if (Score >=90 && Score <=100){
			grade = "A";
		}
		else if (Score >=80 && Score <=90){
			grade = "B";
		}
		else if (Score >=60 && Score <=80){
			grade = "C";
		}	
		else {
			grade = "D";
	} 
		
		System.out.println("Grade of " + studentName + "  is : " + grade);
	}
		

	

}
