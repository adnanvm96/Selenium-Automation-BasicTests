package SeleniumPractice;

public class DataTypes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//These are selection statements
		//This is if statement
		int DayOfTheWeek = 7;
		
		if (DayOfTheWeek == 1){
			System.out.println("Day is Sunday");	
		}
		if (DayOfTheWeek == 2){
			System.out.println("Day is Monday");	
		}
		if (DayOfTheWeek == 3){
			System.out.println("Day is Tuesday");
		}
		if (DayOfTheWeek==4){
			System.out.println("Day is Wednesday");
		}
		if(DayOfTheWeek==5){
			System.out.println("Day is Thursday");
		}
		if (DayOfTheWeek == 6){
			System.out.println("Day is Friday");
		}
        if (DayOfTheWeek == 7){
        	System.out.println("Day is Saturday");
        }
        
        
        //This is switch statement 
        switch (DayOfTheWeek){
        case 1:
        	System.out.println("Day is Sunday");
        case 2:
        	System.out.println("Day is Monday");
        case 3:
        	System.out.println("Day is Tuesday");
        case 4:
        	System.out.println("Day is Wednesday");
        case 5:
        	System.out.println("Day is Thursday");
        	//break;  -->this will break the statement from showing the following output 
        case 6:
        	System.out.println("Day is Friday");
        	break;
        case 7:
        	System.out.println("Day is Saturday");
        
        }
        
        

	}

}
