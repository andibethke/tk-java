package andi;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Start {

	public static void main(String[] args) throws Exception {
		Driver drv=new org.hsqldb.jdbcDriver();
		
		DriverManager.registerDriver(drv);
		Connection con=DriverManager.getConnection("jdbc:hsqldb:file:./MeineDb");
		
		Statement stmt=con.createStatement();
		stmt.execute("drop table NAMES;");
		stmt.execute("create table NAMES (name VARCHAR(1000))");
		
//		stmt.execute("insert into NAMES values (1,'Dennis')");
//		stmt.execute("insert into NAMES values (2,'Iryna')");
//		stmt.execute("insert into NAMES values (3,'Elsa')");
		int i=1;
		for (String w : Files.readAllLines(Paths.get("c:/temp/tk-java/deutsch.txt"),Charset.forName("iso-8859-1"))) {
			try {
				stmt.execute(String.format("insert into NAMES values ('%s')", w.replace('\'', '\\')));
			} catch (Exception e) {
				System.out.println("Fehler: "+w);
			}
		}
		
		System.out.println("Wörter importiert...");
		
		ResultSet rs=stmt.executeQuery("select top 1 * from NAMES order by length(name) desc");
		while (rs.next()) {
			System.out.println(rs.getString("name"));
		}
		
	}

}
