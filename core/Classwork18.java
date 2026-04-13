package core;
import java.io.*;
import java.sql.*;

public class Classwork18 {
	public static void main(String[] args) throws Exception{
		String url = "jdbc:mysql://localhost:3306/TestDB"; // DB details
		String username = "root"; // MySQL credentials
		String password = "";
		String query = "select *from emp"; // query to be run
		Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Established successfully");
		Statement st = con.createStatement();
		ResultSet rs= st.executeQuery(query); // Execute query
		rs.next();
		rs.next();
		String name= rs.getString("name");
		String cgpa=rs.getString("cgpa");
		int id=rs.getInt("Id");
		System.out.println(name); // Print result on console
		System.out.println(cgpa);
		System.out.println(id);
		st.close(); // close statement
		con.close(); // close connection
		System.out.println("Connection Closed....");
	}
}
