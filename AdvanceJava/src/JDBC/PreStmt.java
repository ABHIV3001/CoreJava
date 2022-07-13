package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class PreStmt {
	public static void main(String[] args) throws Exception  {
	//testselect();
		testinsert();
	}

	private static void testselect() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	Statement stmt= conn.createStatement();
    		  ResultSet rs=stmt.executeQuery("select* from emp");
		System.out.println("ID\tFNAME\tLNAME\tSALARY");
		while(rs.next()) {
			System.out.print(rs.getString(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString("LNAME"));
			System.out.println("\t"+rs.getString("SALARY"));
			
	}

	private static void testinsert() throws Exception {
ResourceBundle rb= ResourceBundle.getBundle("com.raystech.app");
Class.forName(rb.getString("driver"));
Connection conn= DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("pwd"));


int id=11;
String fname="AMIT";
String lname="RAJPUT"; 
int salary=18000;

PreparedStatement ps= conn.prepareStatement("insert into emp values(?,?,?,?)");
ps.setInt(1, id);
ps.setString(2, fname);
ps.setString(3, lname);
ps.setInt(4, salary);
int i= ps.executeUpdate();
System.out.println("record inserted" );
conn.close();
ps.close();


/*
		 * PreparedStatement ps =
		 * conn.prepareStatement("insert into emp values(?,?,?,?)");
		 */
//System.out.println("INSERTED");
	}

}
