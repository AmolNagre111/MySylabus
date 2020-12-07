import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConeection {
	//required mysql connector jar file and add selenium library

	public static void main(String[] args) throws SQLException {
		// JDBC Connectivity
		String host="localhost";
		String port="3306"; 
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt", "root","@mol1988");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from  EmpInfor where name='Hanmant'");
		
		while(rs.next())
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("Location"));
			//System.out.println();
		}
		

	}

}
