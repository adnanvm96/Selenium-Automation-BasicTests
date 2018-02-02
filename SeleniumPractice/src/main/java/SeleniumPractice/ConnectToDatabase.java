package SeleniumPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//This "com.mysql.jdbc.Driver" is already mentioned in referenced libraries under mysql connector 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		//URL should be in this format url of the form jdbc:subprotocol:subname
		//Connection--> import from javal.sql
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SeleniumAutomation","root","123456");
		System.out.println("Database is connected to MySQL ");
		//createStatement is used to run queries and create an object for it as Statement and import from java.sql
		Statement stmnt = con.createStatement();
		//ResultSet --> is used to execute the query 
		ResultSet rs = stmnt.executeQuery("select * from SeleniumAutomation.credentials;");
		
		while (rs.next()){
			String UserName = rs.getString("UserName");
			System.out.println("Databse record of Username is=====>" + UserName);
			
			String DateCreated = rs.getString("DateCreated");
			System.out.println("Databade record of Date is=====>"+ DateCreated);
			String Result = rs.getString("Result");
			System.out.println("Database record of Result is=====>" + Result);
			
			
			
			
		}
		

	}

}
