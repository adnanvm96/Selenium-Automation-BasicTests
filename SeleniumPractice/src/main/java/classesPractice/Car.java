package classesPractice;

public class Car {
	//make
	private String make;
			//model
	private String model;
			//year
	private int year;
	
	
	public void increaseSpeed(){
		System.out.println(" Increasing the speed");
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		if (year > 1900){
			this.year = year;
		}else{
			System.out.println("This model doesnt exsit");
		}
		
	}
	
	

}
