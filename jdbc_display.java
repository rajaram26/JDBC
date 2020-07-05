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
			ResultSet myres=mystat.executeQuery("SELECT * FROM students");
			
			while(myres.next())
			{
				System.out.println(myres.getInt("id")+" "+myres.getString("name")+","+myres.getString("city"));
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
