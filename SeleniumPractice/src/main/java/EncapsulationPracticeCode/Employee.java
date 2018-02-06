package EncapsulationPracticeCode;

public class Employee {
	
	/*Encapsulation: information hiding
	 * 
	 * One thing to note about encapsulation is the access modifiers (public,private,protected)
	 * 
	 *  https://www.youtube.com/watch?v=bAgkuLLQ0Es
	 */
	private String name;
	private int age;
	private String city;
	
	public void setName(String name)
	{
		this.name	= name;
	}
	
	public void setAge(int age)
	{
		this.age= age;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getCity()
	{	
	return city;
	}		
	public String toString(){
		return name +  "  " + age + "  "  +city;
	}	
	
	

}
