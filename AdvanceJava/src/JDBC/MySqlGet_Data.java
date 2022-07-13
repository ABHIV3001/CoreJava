package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlGet_Data {
	public static void main(String[] args) throws Exception  {
		//testselect();
	Class.forName("com.mysql.jdbc.Driver").newInstance();//<load driver
		
	Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery("SELECT ID,FNAME,LNAME,SALARY FROM emp");
	
	System.out.println("ID\tFNAME\tLNAME\tSALARY");
	
	while(rs.next()) {
	System.out.println(rs.getString(1));
	System.out.print("\t"+rs.getString(2));
	System.out.print(" "+rs.getString(3));
	System.out.println("\t"+rs.getString(4));
	}
	//	rs.close();
	stmt.close();
	conn.close();
	
	}

	//private static void testselect() {
		// TODO Auto-generated method stub
		
	}
