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
			mystat.executeUpdate("UPDATE students " +" SET name='SriRam' WHERE id=2" );
			System.out.println("Updation is done Successfully");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
