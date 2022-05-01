package proyectohibernate;

import java.sql.*;
import java.sql.DriverManager;

public class pruebasJDBC {

	public static void main(String[] args) {
		
		Connection conn;
	    //Statement stm;
	    //String sql;
	    String url = "jdbc:mysql://localhost:3306/pruebashibernate?allowPublicKeyRetrieval=true&useSSL=false";
	    String usuario = "DataBaseAdmin";
	    String password = "1234";
	        try{
	        	System.out.println("Connectando con la base de datos " + url);
	            conn = DriverManager.getConnection(url, usuario, password);
	            //stm = conn.createStatement();
	            //sql = "UPDATE employees SET salary = 200000 WHERE employee_id = 1";
	            //stm.execute(sql);
	            System.out.println("Conexion exitosa");
	            conn.close();
	        }catch (SQLException e) {
	        	e.printStackTrace();
	            System.out.println("Error + " + e.getMessage());
	        }
	}

}
