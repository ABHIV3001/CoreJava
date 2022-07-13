package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class CURD {
public static void main(String[] arg) throws Exception {
	testselect();
  // testdelete();
	testinsert();
	//testupdate();
}
	private static void testupdate() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	 
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/rays","root","root");
	Statement stmt=conn.createStatement();
	
	int i=stmt.executeUpdate("UPDATE EMP SET FNAME= 'KIRPAN' where ID=4");
	System.out.println("UPDATED RECORD"+i);
}
	private static void testinsert() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	Statement stmt=conn.createStatement();
	
	int i=stmt.executeUpdate("insert into emp (ID,FNAME,LNAME,SALARY) VALUES(10,'VINAY','SINGH',59000)");
	System.out.println("INSERT UPDATE RECORDED"+i);
	
	conn.close();
	stmt.close();
}
//---------------------------------------------------------------------------------------------------------------------------------	
	private static void testdelete() throws Exception {
	 
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
	Statement stmt=conn.createStatement();
	
	int i= stmt.executeUpdate("delete from emp where id =10"
			+ "");
	System.out.println(i+"deleted");
	
	stmt.close();
	conn.close();
}
//---------------------------------------------------------------------------------------------------------------------------------
	private static void testselect() throws Exception {
		ResourceBundle rb= ResourceBundle.getBundle("com.raystech.app"
				+ "");
		String drive =rb.getString("url");
	//Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn=DriverManager.getConnection(rb.getString("url"),rb.getString("username"),rb.getString("pwd"));
	Statement stmt= conn.createStatement();
	
	ResultSet rs= stmt.executeQuery("Select *from emp");
	System.out.println("ID\tFNAME\tLNAME\tSALARY");
	while(rs.next()) {
		System.out.print(rs.getString(1));
		System.out.print("\t"+rs.getString(2));
		System.out.print("\t"+rs.getString("LNAME"));
		System.out.println("\t"+rs.getString("SALARY"+ ""));
	}
//---------------------------------------------------------------------------------------------------------------------------------	


	
	}

}


