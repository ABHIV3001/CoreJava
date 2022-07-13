package MetaDeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Metadeta {
public static void main(String[] args) throws Exception {
	testselect();
}

private static void testselect() throws Exception {
Class.forName("com.mysql.jdbc.Driver");
Connection conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");

		/* Statement stmt=(Statement) */
	
} 

}
