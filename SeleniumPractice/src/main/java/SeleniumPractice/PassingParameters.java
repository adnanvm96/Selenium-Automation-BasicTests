package SeleniumPractice;

public class PassingParameters {

	public static void main(String[] args) {
		PassingParameters obj1 = new PassingParameters();
		int sum = obj1.add(100, 100);
		System.out.println("Addition of e and f is ===>" + sum);
		obj1.sub(200.55, 100.60);
		PassingParameters2 fullname = new PassingParameters2();
		
		String fullname1 = PassingParameters2.getMyfullname("Adnan Ahmed", "Mohammed");
		System.out.println("My fullname is=====>" +  fullname1);
		
		
	}

	/*
	 public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("The addition of a and b is===> " + c);
	}
	//public void means it wont return anything but if we want to return then use the below code after this
	 * Return means executing variable "c" in this case  
	*/
	
	public int add(int e,int f)
	{
		int g=e+f;
		return g;
	}
	
	public void sub(double x,double y)
	{
		double d=x-y;
		System.out.println("The subtraction of x and y is====> " + d);
		
	}
	
	
	
}
