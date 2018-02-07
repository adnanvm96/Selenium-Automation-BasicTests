package SeleniumPractice;

public class StringPractice {

	public static void main(String[] args) {
		String str = "Google LLC is an American multinational technology company that specializes in Internet-related services and products, which include online advertising technologies, search engine, cloud computing, software, and hardware";
		String str2 = "This is Selenium";
		String str3 = "        Space is trimmed                   "; 
		System.out.println(str.length()); //give the length of the string
		System.out.println(str.charAt(3));  //gives you the position of the character and index in java starts from zero(0,1,2,3.....)
		System.out.println(str.concat("   ===> Google chorme is browser of google")); //adds to the line 
		System.out.println(str.contains("is"));
		System.out.println(str.contains("snkjnre"));//Tells u whether this word is present or not
		System.out.println(str.startsWith("Google LLC"));
		System.out.println(str.endsWith("kcnrincirn"));
		System.out.println(str.equals(str2));
		System.out.println(str.indexOf("A"));
		System.out.println(str.isEmpty());
		System.out.println(str.replace("American", "america"));
		System.out.println(str.substring(6));
		
		System.out.println(str3.trim());
		
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++){
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		System.out.println(str2.toLowerCase());
		System.out.println(str3.toUpperCase());
		
		
}
}



/*String length() " length of the string
String charAt() " returns a char value at the given index number
String concat() " combines specified string at the end of this string
String contains() " returns true if chars are found in the string
String startsWith() " checks if this string starts with given prefix
String endsWith() " checks if this string ends with given suffix
String equals() " compares the contents of two given strings
String indexOf() " returns index of given character value or substring
String isEmpty() " checks if this string is empty
String replace() " returns a string replacing all the old char to new char
String substring() " returns a part of the string
String toCharArray() " converts this string into character array
String toLowerCase() " returns the string in lowercase letter
String toUpperCase() " returns the string in uppercase letter
String trim() " eliminates leading and trailing spaces*/