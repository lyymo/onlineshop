package cn.web01.tools;

import java.sql.Connection;

public class DBUtils {
	public static String driver="oracle.jdbc.driver.OracleDriver";
	public static String url="jdbc:oracle:thin:@127.0.0.1:1521:cral";
	
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
