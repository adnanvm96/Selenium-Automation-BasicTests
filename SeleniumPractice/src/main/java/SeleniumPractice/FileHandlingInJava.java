package SeleniumPractice;

import java.io.File;
import java.io.IOException;

public class FileHandlingInJava {

	public static void main(String[] args) {
		
		/*File abc = new File ("/Users/adnahmed/Desktop/Folders");
		//abc.mkdir(); //Create a folder
		
		//boolean a = abc.exists(); //Checks whether the folder exists or not 
		//System.out.println(a);
		
		//abc.delete();   //It will delete the folder
		boolean a =abc.exists();
		if (a == true){
			System.out.println("Folder exists");
		}
		else {
			System.out.println("Folder does not exists");
		}	*/
		
	
		//How to create a file 
		File abcd = new File("/Users/adnahmed/Desktop/Folders.txt");
		try {
			abcd.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		//** Note:---- For writing content in the file we use BufferedWriter Method
		//**           For reading content in the file we user BufferedReader Method 
		
		 
			
		
		
		
		

	}

}