package andi;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class Start {

	public static void main(String[] args) throws Exception {
		Driver drv=new SQLServerDriver();
		DriverManager.registerDriver(drv);
		
		Connection con=DriverManager.getConnection(
				"jdbc:sqlserver://127.0.0.1:1433;databaseName=NORTHWND;User=nw;Password=nw;");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from Products where unitprice>50");
		
		while (rs.next()) {
			System.out.printf("%s (%.2f)\n",rs.getString(2),rs.getDouble("unitprice"));
		}
		rs.close();
		con.close();

	}

}
