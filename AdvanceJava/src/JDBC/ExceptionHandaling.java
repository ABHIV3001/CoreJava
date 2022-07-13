package JDBC;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExceptionHandaling {
	public static void main(String[] args) throws SQLException {
		
		int a=10,b=0,c;
		try {
		c=a/b;
		System.out.println(c);
	}	
	catch(Exception e) {
		System.out.println("cant divid by zero");
	}
//---------------------------------------------------------------------------------------------------------------------------------
		try (FileReader in= new FileReader("c:/test.txt")) {
			System.out.println(in.read());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
//---------------------------------------------------------------------------------------------------------------------------------		
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		Statement stmt=conn.createStatement();
	ResultSet ResultSetrs = stmt.executeQuery("select fname,lname from emp");
	while(rs.next) {
		
	}
	}
	}

