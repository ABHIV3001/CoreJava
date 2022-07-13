package MetaDeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MarksheetModel {

	public void add(MarksheetBean bean) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("insert into result values(?,?,?,?,?)");
		
		ps.setString(1, bean.getRollno());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getChemistry());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getMaths());
		
		ps.executeUpdate();
		
		//con.close();
		ps.close();
		con.commit();
		
		
		
		}
		
		public void update(MarksheetBean bean) throws Exception {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("update result set name=?, chemistry=?,Physics=?,maths=? where rollno=?");
			
			
			ps.setString(1, bean.getName());
			ps.setInt(2, bean.getChemistry());
			ps.setInt(3, bean.getPhysics());
			ps.setInt(4, bean.getMaths());
			ps.setString(5, bean.getRollno());
			
			ps.executeUpdate();
			
		//	con.close();
			ps.close();
			con.commit();
		
	}
	public void delete(MarksheetBean bean) throws Exception {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement("delete from result where rollno=?");
			
			
			
			ps.setString(1, bean.getRollno());
			
			ps.executeUpdate();
			
			//con.close();
			ps.close();
			con.commit();
	}

	public List<MarksheetBean> get (MarksheetBean bean) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/marksheet","root","root");
		con.setAutoCommit(false);
		PreparedStatement ps = con.prepareStatement("select * from result where rollno=?");
		//PreparedStatement ps = con.prepareStatement("select * from result");

		ps.setString(1, bean.getRollno());
		ResultSet rs = ps.executeQuery();
		
		ArrayList<MarksheetBean>list=new ArrayList<MarksheetBean>();
		
		while (rs.next()) {
			
		bean.setRollno(rs.getString(1));
		bean.setName(rs.getString(2));
		bean.setPhysics(rs.getInt(3));
		bean.setChemistry(rs.getInt(4));
		bean.setMaths(rs.getInt(5));
		
		list.add(bean);
		}
		return list;
		
	}
	}	