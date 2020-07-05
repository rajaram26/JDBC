package hello;

import java.sql.*;
public class first {
	public static void main(String args[]) {
		try {
			// get connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rootpassword");
			//create statement
			Statement mystat=con.createStatement();
			//execute sql
			mystat.executeUpdate("INSERT INTO students VALUES (5,'Tharani','Velis')");
			System.out.println("Insetion is done Successfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
