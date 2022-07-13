package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CommitTransactions {
public static void main(String[] args) throws Exception {
Connection conn=null;
Statement stmt=null;
try 
{
//create cconnection
	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","username","pwd");
	//begin transacction
	conn.setAutoCommit(false);
	//create statement
	stmt=conn.createStatement();
	//transfer fund
	stmt.executeUpdate("update emp set fname='Abhi' where id=1");
	stmt.executeUpdate("updae emp set fname='vishu' where id=2");
	conn.commit();
}catch (SQLException e) {
conn.rollback();
}finally {
	stmt.close();
	conn.close();
}
}
}